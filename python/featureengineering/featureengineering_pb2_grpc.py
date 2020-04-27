# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
import grpc

import featureengineering_pb2 as featureengineering__pb2


class FeatureEngineerStub(object):
    """The feature engineering service definition.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.engineerFeatures = channel.unary_unary(
                '/featureengineering.FeatureEngineer/engineerFeatures',
                request_serializer=featureengineering__pb2.EventList.SerializeToString,
                response_deserializer=featureengineering__pb2.FEEvent.FromString,
                )


class FeatureEngineerServicer(object):
    """The feature engineering service definition.
    """

    def engineerFeatures(self, request, context):
        """Calculate engineered features
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_FeatureEngineerServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'engineerFeatures': grpc.unary_unary_rpc_method_handler(
                    servicer.engineerFeatures,
                    request_deserializer=featureengineering__pb2.EventList.FromString,
                    response_serializer=featureengineering__pb2.FEEvent.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'featureengineering.FeatureEngineer', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class FeatureEngineer(object):
    """The feature engineering service definition.
    """

    @staticmethod
    def engineerFeatures(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/featureengineering.FeatureEngineer/engineerFeatures',
            featureengineering__pb2.EventList.SerializeToString,
            featureengineering__pb2.FEEvent.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)
