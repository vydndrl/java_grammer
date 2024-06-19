package C07ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class C0705JsonParsing3 {
    public static void main(String[] args) throws IOException, InterruptedException {
//        Spring에서는 RestTemplate 을 통해 Http 요청하고
//        여기서는 java에 내장 된 Http 클라이언트 사용
        ObjectMapper objectMapper = new ObjectMapper();
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
                .GET()
                .build();
        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());

        String posts = response.body();


        JsonNode jsonList = objectMapper.readTree(posts);
        List<Post> postList = new ArrayList<>();

        for (JsonNode j : jsonList) {
            postList.add(objectMapper.readValue(j.toString(), Post.class));
        }

//        List<Post> 객체를 json으로 직렬화
        String postJason = objectMapper.writeValueAsString(postList);
        System.out.println("postList = " + postList);
    }
}

class Post {
    private int userId;
    private int id;
    private String title;
    private String body;

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "userId=" + userId + ", id=" + id + ", title='" + title + '\'' + ", body='" + body;
    }
}