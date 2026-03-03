package br.com.alura.currencyconverter.services;

import br.com.alura.currencyconverter.models.CurrencyDTO;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Properties;

public class CurrencyQuery {
    public CurrencyDTO searchCurrency(String baseCode, String targetCode) throws IOException, InterruptedException {
        Properties properties = new Properties(); // Set up properties to keep the API Key secure
        try (FileInputStream fis = new FileInputStream("config.properties")) {
            properties.load(fis); // Load properties from the file
        } catch (IOException e) {
            System.out.println("Error loading config.properties");
        }

        String apiKey = properties.getProperty("rate.apikey");
        String url = "https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + baseCode + "/" + targetCode;

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create();

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return gson.fromJson(response.body(), CurrencyDTO.class); // Simplified parsing with CurrencyDTO
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}