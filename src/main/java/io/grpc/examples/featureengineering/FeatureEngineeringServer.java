/*
 * Copyright 2015 The gRPC Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.grpc.examples.featureengineering;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import io.grpc.stub.StreamObserver;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;


/**
 * Server that manages startup/shutdown of a {@code Greeter} server.
 */
public class FeatureEngineeringServer {
  private static final Logger logger = Logger.getLogger(FeatureEngineeringServer.class.getName());

  private Server server;

  private void start() throws IOException {
    /* The port on which the server should run */
    int port = 50052;
    server = ServerBuilder.forPort(port)
        .addService(new FeatureEngineerImpl())
        .build()
        .start();
    logger.info("Server started, listening on " + port);
    Runtime.getRuntime().addShutdownHook(new Thread() {
      @Override
      public void run() {
        // Use stderr here since the logger may have been reset by its JVM shutdown hook.
        System.err.println("*** shutting down gRPC server since JVM is shutting down");
        try {
        	FeatureEngineeringServer.this.stop();
        } catch (InterruptedException e) {
          e.printStackTrace(System.err);
        }
        System.err.println("*** server shut down");
      }
    });
  }

  private void stop() throws InterruptedException {
    if (server != null) {
      server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
    }
  }

  /**
   * Await termination on the main thread since the grpc library uses daemon threads.
   */
  private void blockUntilShutdown() throws InterruptedException {
    if (server != null) {
      server.awaitTermination();
    }
  }

  /**
   * Main launches the server from the command line.
   */
  public static void main(String[] args) throws IOException, InterruptedException {
    final FeatureEngineeringServer server = new FeatureEngineeringServer();
    server.start();
    server.blockUntilShutdown();
  }

  static class FeatureEngineerImpl extends FeatureEngineerGrpc.FeatureEngineerImplBase {

    @Override
    public void engineerFeatures(EventList req, StreamObserver<FEEvent> responseObserver) {
      Map<String,Integer> m = new HashMap<>();
      
      List<Event> lst = req.getEventList();
      for(Event e:lst) {
    	  
    	  m.put("f1", m.getOrDefault("f1", 0) + e.getF1());
    	  m.put("f2", m.getOrDefault("f2", 0) + e.getF2());
    	  m.put("f3", m.getOrDefault("f3", 0) + e.getF3());
    	  m.put("f4", m.getOrDefault("f4", 0) + e.getF4());
      }

      FEEvent reply = FEEvent.newBuilder().putAllResult(m).build();
      responseObserver.onNext(reply);
      responseObserver.onCompleted();
    }
    

  }
}
