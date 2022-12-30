#!/bin/bash
# Copyright 2022 Listware

INCLUDES="-I."

protoFiles="$(find ./ -iname \*.proto)"


rm -rf ./sdk/*

echo "Generating .pb.go files..."

protoc --proto_path=proto $INCLUDES \
	--go_opt=paths=source_relative \
	--go-grpc_opt=paths=source_relative \
	--go_out=./sdk \
	--go-grpc_out=./sdk \
	$protoFiles

rm -rf ./java/*

echo "Generating .java files..."

# /usr/local/bin/protoc-gen-grpc-java: https://repo1.maven.org/maven2/io/grpc/protoc-gen-grpc-java/1.9.1/protoc-gen-grpc-java-1.9.1-linux-x86_64.exe
protoc --proto_path=proto $INCLUDES \
    --java_out=./java \
    --grpc-java_out=./java \
    --plugin=protoc-gen-grpc-java=/usr/local/bin/protoc-gen-grpc-java \
    $protoFiles

echo "Done!"
