protobuf-3.20.1\bin\protoc --plugin=protoc-gen-grpc-java="./protobuf-3.20.1/java/protoc-gen-grpc-java-1.46.0-windows-x86_64.exe" --grpc-java_out="./java" --proto_path="./definitions" "./definitions/DriveProcedure.proto"
protobuf-3.20.1\bin\protoc -I="./definitions" --java_out="./java" "./definitions/DriveProcedure.proto"
protobuf-3.20.1\bin\protoc -I="./definitions/request" --java_out="./java" "./definitions/request/Model.proto"
protobuf-3.20.1\bin\protoc -I="./definitions/response" --java_out="./java" "./definitions/response/Model.proto"