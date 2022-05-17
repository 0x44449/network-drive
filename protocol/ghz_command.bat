ghz --insecure --async ^
  --proto ./definitions/DriveProcedure.proto ^
  --call drive_protocol.DriveProcedure.CreateFile ^
  --skipTLS --rps 200 --total 1000 --concurrency 20 ^
  --output=./ghz_result.html --format=html ^
  -D CreateFileRequestParam.json 127.0.0.1:9090
