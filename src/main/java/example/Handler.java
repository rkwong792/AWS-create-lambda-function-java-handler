package example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.S3Event;

public class Handler implements RequestHandler<S3Event, String> {
    public String handleRequest(S3Event event, Context context) {
        System.out.println("event received");
        return "";
    }
}
