package com.francis;

import io.grpc.ServerBuilder;

import java.io.IOException;

public class ServerMain {
    //protoc -I ./ -I "D:\program\golang\work\src" --java_out=. --java-grpc_out=.  user.proto
    public static void main(String[] args) throws IOException, InterruptedException {
        ServerBuilder.forPort(50051).addService(new Server())
                .build().start().awaitTermination();
    }
}
