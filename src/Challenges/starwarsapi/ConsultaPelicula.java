package starwarsapi;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaPelicula {

    public Pelicula buscaPelicula(int numeroDePelicula) {
        URI direccion = URI.create("https://swapi.py4e.com/api/films/" + numeroDePelicula);

        // Configurar el cliente para seguir redirecciones
        HttpClient client = HttpClient.newBuilder()
                .followRedirects(HttpClient.Redirect.ALWAYS)
                .build();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            // Verificar el código de estado HTTP
            if (response.statusCode() != 200) {
                throw new RuntimeException("Error en la API: Código de estado " + response.statusCode());
            }

            if (response.body() == null || response.body().isEmpty()) {
                throw new RuntimeException("La respuesta de la API está vacía o es nula");
            }

            Pelicula pelicula = new Gson().fromJson(response.body(), Pelicula.class);

            if (pelicula == null) {
                throw new RuntimeException("No se pudo mapear la respuesta a la clase Pelicula");
            }

            return pelicula;
        } catch (Exception e) {
            throw new RuntimeException("Error al buscar la película: " + e.getMessage(), e);
        }
    }
}