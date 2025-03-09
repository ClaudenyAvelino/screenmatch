package screematch.principal;

import com.google.gson.Gson;
import screematch.modelos.Titulo;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main (String[] args) throws IOException, InterruptedException {
        Scanner entardada = new Scanner(System.in);
        String KEY = "";

        System.out.println("Informe o filme ou serie :");
        var busca = entardada.nextLine();

        String endereco = "https://www.omdbapi.com/?t=" + busca + "&apikey="+KEY;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println();

        String json = response.body();
        System.out.println(json);

        Gson gson = new Gson();
        Titulo meuTitulo = gson.fromJson(json, Titulo.class);
        System.out.println(meuTitulo);

    }
}
