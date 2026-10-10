package com.pg.functions;

import com.microsoft.azure.functions.ExecutionContext;
import com.microsoft.azure.functions.HttpMethod;
import com.microsoft.azure.functions.HttpRequestMessage;
import com.microsoft.azure.functions.HttpResponseMessage;
import com.microsoft.azure.functions.HttpStatus;
import com.microsoft.azure.functions.annotation.AuthorizationLevel;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.HttpTrigger;

import java.util.Optional;

/**
 * Placeholder function so the project builds and deploys. Replace with real functions.
 */
public class Placeholder {

    @FunctionName("placeholder")
    public HttpResponseMessage run(
            @HttpTrigger(
                name = "req",
                methods = { HttpMethod.GET },
                authLevel = AuthorizationLevel.FUNCTION)
                HttpRequestMessage<Optional<String>> request,
            final ExecutionContext context) {
        return request.createResponseBuilder(HttpStatus.OK).body("ok").build();
    }
}