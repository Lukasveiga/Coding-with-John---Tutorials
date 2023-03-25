package Tutorials.restApiTest;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RestApiTutorial {

    public static void main(String[] args) throws Exception {

        Transcript transcript = new Transcript();
        transcript.setAudio_url("https://raw.githubusercontent.com/johnmarty3/JavaAPITutorial/main/Thirsty.mp4");
        Gson gson = new Gson();
        String jsonRequest = gson.toJson(transcript);

        System.out.println(jsonRequest);

        HttpRequest postRequest = (HttpRequest) HttpRequest.newBuilder()
                .uri(new URI("https://api.assemblyai.com/v2/transcript"))
                .header("authorization", "606b7bed6ff548e99c4015755dbf6da1")
                .POST(HttpRequest.BodyPublishers.ofString(jsonRequest))
                .build();

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpResponse<String> postResponse = httpClient.send(postRequest, HttpResponse.BodyHandlers.ofString());

        System.out.println(postResponse.body());

        transcript = gson.fromJson(postResponse.body(), Transcript.class);
        System.out.println(transcript.getId());

        HttpRequest getRequest = (HttpRequest) HttpRequest.newBuilder()
                .uri(new URI("https://api.assemblyai.com/v2/transcript/" + transcript.getId()))
                .header("authorization", "606b7bed6ff548e99c4015755dbf6da1")
                .build();

        while(true){
            HttpResponse<String> getResponse = httpClient.send(getRequest, HttpResponse.BodyHandlers.ofString());
            transcript = gson.fromJson(getResponse.body(), Transcript.class);

            System.out.println(transcript.getStatus());
            if(transcript.getStatus().equalsIgnoreCase("completed")){
                break;
            }

            Thread.sleep(1000);
        }

        System.out.println(transcript.getText());
    }
}
