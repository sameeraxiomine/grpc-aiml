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

import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.examples.featureengineering.Event;
import io.grpc.examples.featureengineering.EventList;
import io.grpc.examples.featureengineering.FEEvent;
import io.grpc.examples.featureengineering.FeatureEngineerGrpc;
import io.grpc.examples.featureengineering.Event.Builder;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * A simple client that requests a greeting from the {@link HelloWorldServer}.
 */
public class FeatureEngineeringClient {
  private static final Logger logger = Logger.getLogger(FeatureEngineeringClient.class.getName());

  private final FeatureEngineerGrpc.FeatureEngineerBlockingStub blockingStub;

  /** Construct client for accessing HelloWorld server using the existing channel. */
  public FeatureEngineeringClient(Channel channel) {
    // 'channel' here is a Channel, not a ManagedChannel, so it is not this code's responsibility to
    // shut it down.

    // Passing Channels to code makes code easier to test and makes it easier to reuse Channels.
    blockingStub = FeatureEngineerGrpc.newBlockingStub(channel);
  }

  /** Say hello to server. */
  public void engineerFeatures(List<Event> myEvents) {
    logger.info("Engineer Features " + " ...");
    //HelloRequest request = HelloRequest.newBuilder().setName(name).build();
    io.grpc.examples.featureengineering.Event.Builder builder = Event.newBuilder().setF1(1);
    builder.setF2(2);
    builder.setF3(3);
    builder.setF4(4);
    Event evt1 = builder.build();
    EventList.Builder builder2 = EventList.newBuilder();
    builder2.addEvent(evt1);
    builder2.addEvent(evt1);
    EventList fe = builder2.build();;
    FEEvent response;
    try {
      response = blockingStub.engineerFeatures(fe);
    } catch (StatusRuntimeException e) {
      logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
      return;
    }
    Map<String,Integer> mymap = response.getResultMap();
    logger.info("Greeting: " + response.getResultMap());
    logger.info("F1:" + mymap.get("f1"));
    logger.info("F2:" + mymap.get("f2"));
    logger.info("F3:" + mymap.get("f3"));
    logger.info("F4:" + mymap.get("f4"));
    
    
  }

  /**
   * Greet server. If provided, the first element of {@code args} is the name to use in the
   * greeting. The second argument is the target server.
   */
  public static void main(String[] args) throws Exception {
    // Access a service running on the local machine on port 50051
    String target = "localhost:50053";
    // Allow passing in the user and target strings as command line arguments
    if (args.length > 0) {
      if ("--help".equals(args[0])) {
        System.err.println("Usage: [target]");
        System.err.println("");
        System.err.println("  target  The server to connect to. Defaults to " + target);
        System.exit(1);
      }
     
    }
    if (args.length > 0) {
      target = args[0];
    }

    // Create a communication channel to the server, known as a Channel. Channels are thread-safe
    // and reusable. It is common to create channels at the beginning of your application and reuse
    // them until the application shuts down.
    ManagedChannel channel = ManagedChannelBuilder.forTarget(target)
        // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
        // needing certificates.
        .usePlaintext()
        .build();
    try {
      FeatureEngineeringClient client = new FeatureEngineeringClient(channel);
      client.engineerFeatures(new ArrayList<Event>());
    } finally {
      // ManagedChannels use resources like threads and TCP connections. To prevent leaking these
      // resources the channel should be shut down when it will no longer be used. If it may be used
      // again leave it running.
      channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
    }
  }
}
