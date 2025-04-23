package com.ejercicio.screenmatch.principal;

import com.ejercicio.screenmatch.exceptions.ErrorEnConversionDeDuracionException;
import com.ejercicio.screenmatch.modelos.Titulo;
import com.ejercicio.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalConBusqueda {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner lectura = new Scanner(System.in);
        List<Titulo> titulos = new ArrayList<>();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();


        while (true) {
            System.out.println("Ingrese el nombre de la película que desea buscar:");
            var busqueda = lectura.nextLine();

            if(busqueda.equalsIgnoreCase("salir")) {
                System.out.println("Saliendo del programa...");
                break;
            }

            String direction = "http://www.omdbapi.com/?t=" +
                    busqueda.replace(" ", "+") +
                    "&apikey=d33d3103";

            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(direction))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);

                TituloOmdb miTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println(miTituloOmdb);

                Titulo miTitulo = new Titulo(miTituloOmdb);
                System.out.println("Titulo ya convertido: " + miTitulo);
                titulos.add(miTitulo);
            } catch (NumberFormatException e) {
                System.out.println("No se encontró la película");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Error en la URI, verifique la dirección");
            } catch (ErrorEnConversionDeDuracionException e) {
                System.out.println(e.getMessage());
            }

        }
        System.out.println(titulos);
        FileWriter escritura = new FileWriter("titulos.json");
        escritura.write(gson.toJson(titulos));
        escritura.close();
        System.out.println("Finalizó la ejecución del programa");
    }
}
