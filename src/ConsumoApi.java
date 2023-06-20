import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoApi {
    public String buscaVeiculosMarcas(String veiculo, int marca){
        String veiculoMarca = "https://parallelum.com.br/fipe/api/v1/" + veiculo + "/marcas/" + marca + "/modelos";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(veiculoMarca)).build();
        HttpResponse<String> response;

        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            
        }
        return "";
    }
    
}
