import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ConsultaMoeda {
    public void buscaMoeda(String moedaOrigem, String moedaDestino, double valor) {

        // iremos formatar uma string para realizarmos a busca.
        // https://www.exchangerate-api.com/docs/pair-conversion-requests
        String url = "https://v6.exchangerate-api.com/v6/40a3f2e0a263634e4be24b93/pair/"
                + moedaOrigem
                + "/"
                + moedaDestino
                + "/"
                + valor;

        // https://docs.oracle.com/en/java/javase/17/docs/api/java.net.http/java/net/http/HttpRequest.html
       try {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(resposta -> {
                    // Faz o parse do JSON com Gson
                    JsonObject json = JsonParser.parseString(resposta).getAsJsonObject();
                    // System.out.println(json);
                    double resultado = json.get("conversion_result").getAsDouble();

                    System.out.println("Valor convertido: " + valor + " " + moedaOrigem + " => " + moedaDestino + " = "
                            + resultado);

                })
                .join(); // Espera o processo assíncrono terminar

       } catch (Exception e) {
        System.out.println("Não foi possivel realizar a conversão");
       }
        
    }
}