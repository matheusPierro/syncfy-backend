package br.com.system.syncfy.model.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ViaCepApi {

    public static String getCEPData(String cep) throws IOException {
        String urlStr = "https://viacep.com.br/ws/" + cep + "/json/";
        URL url = new URL(urlStr);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        int responseCode = connection.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            return response.toString();
        } else {
            throw new IOException("Não foi possível obter os dados do CEP. Código de resposta: " + responseCode);
        }
    }

    public static void main(String[] args) {
        String cep = "02337030";
        try {
            String cepData = getCEPData(cep);
            System.out.println(cepData); // Imprime a resposta da API no console
        } catch (IOException e) {
            System.out.println("Erro ao obter os dados do CEP: " + e.getMessage());
        }
    }
}
