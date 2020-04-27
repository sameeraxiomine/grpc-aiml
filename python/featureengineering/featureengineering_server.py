
from concurrent import futures
import logging

import grpc

import featureengineering_pb2
import featureengineering_pb2_grpc
from featureengineering_service import engineer_features

class FeatureEngineering(featureengineering_pb2_grpc.FeatureEngineerServicer):

    def engineerFeatures(self, request, context):

        output = engineer_features(request.event)
        return featureengineering_pb2.FEEvent(result=output)


def serve():
    server = grpc.server(futures.ThreadPoolExecutor(max_workers=10))
    featureengineering_pb2_grpc.add_FeatureEngineerServicer_to_server(FeatureEngineering(), server)
    server.add_insecure_port('[::]:50053')
    server.start()
    server.wait_for_termination()


if __name__ == '__main__':
    logging.basicConfig()
    serve()
