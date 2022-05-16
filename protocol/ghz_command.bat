ghz --insecure --async ^
  --proto ./definitions/DriveProcedure.proto ^
  --call drive_protocol.DriveProcedure.CreateFile ^
  -c 10 -n 10000 --rps 200 ^
  -D CreateFileRequestParam.json localhost:9090