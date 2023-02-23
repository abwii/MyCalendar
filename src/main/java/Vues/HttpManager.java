package Vues;

import org.json.JSONObject;
import org.json.JSONArray;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpManager {
    public void postTest(String url, JSONArray payload) throws Exception
    {
        var request = HttpRequest.newBuilder()
                .uri(new URL(url).toURI())
                .POST(HttpRequest.BodyPublishers.ofString(payload.toString()))
                .header("Content-Type", "application/json")
                .build();

        var response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

    }
}
