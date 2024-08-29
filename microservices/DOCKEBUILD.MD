docker build . -t ghcr.io/foxgooodman/device-service:latest

echo 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 | docker login ghcr.io -u foxgooodman --password-stdin

docker push ghcr.io/foxgooodman/device-service:latest