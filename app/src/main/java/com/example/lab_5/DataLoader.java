package com.example.lab_5;

import android.os.AsyncTask;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class DataLoader extends AsyncTask<Void, Void, List<CurrencyRate>> {

    private static final String API_URL = "https://your-api-url/latest?access_key=4f56425cb5e97ce3e02aa8ee";
    private final DataLoaderCallback callback;

    public interface DataLoaderCallback {
        void onDataLoaded(List<CurrencyRate> rates);
        void onError(Exception e);
    }

    public DataLoader(DataLoaderCallback callback) {
        this.callback = callback;
    }

    @Override
    protected List<CurrencyRate> doInBackground(Void... voids) {
        try {
            URL url = new URL(API_URL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder json = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                json.append(line);
            }

            return Parser.parseJson(json.toString());
        } catch (Exception e) {
            e.printStackTrace();
            callback.onError(e);
            return null;
        }
    }

    @Override
    protected void onPostExecute(List<CurrencyRate> rates) {
        if (rates != null) {
            callback.onDataLoaded(rates);
        }
    }
}
