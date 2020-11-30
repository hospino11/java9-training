package com.java.nine.training.features.http2;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.CompletableFuture;
import java.util.logging.Level;
import java.util.logging.Logger;

import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

public class Http2Example {

    private static final Logger LOGGER = Logger.getLogger(Http2Example.class.getName());

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(new URI("https://postman-echo.com/get")).GET().build();

        // Async call is performed in another thread and this call does not block the program execution
        CompletableFuture<HttpResponse<String>> responseAsync = httpClient.sendAsync(request, HttpResponse.BodyHandler.asString());
        responseAsync.thenAcceptAsync(stringHttpResponse -> {
            LOGGER.log(Level.INFO, "Status code async: {0}", stringHttpResponse.statusCode());
            LOGGER.log(Level.INFO, "Response body async: {0}", stringHttpResponse.body());
            LOGGER.log(Level.INFO, "Headers async: {0}", stringHttpResponse.headers().map());
        });

        LOGGER.log(Level.INFO, "Async call performed");
        LOGGER.log(Level.INFO, "Executing sync call");

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandler.asString());
        // Store response as file
        //HttpResponse<Path> response = httpClient.send(request, HttpResponse.BodyHandler.asFile(Paths.get("sample.json")));

        LOGGER.log(Level.INFO, "Status code: {0}", response.statusCode());
        LOGGER.log(Level.INFO, "Response body: {0}", response.body());
        LOGGER.log(Level.INFO, "Headers: {0}", response.headers().map());

        LOGGER.log(Level.INFO, "Execution finished");
    }
}
