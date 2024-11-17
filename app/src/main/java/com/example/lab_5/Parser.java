package com.example.lab_5;

import org.json.JSONObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Parser {

    public static List<CurrencyRate> parseJson(String json) {
        List<CurrencyRate> rates = new ArrayList<>();
        try {
            JSONObject jsonObject = new JSONObject(json);
            JSONObject ratesObject = jsonObject.getJSONObject("rates");

            Iterator<String> keys = ratesObject.keys();
            while (keys.hasNext()) {
                String code = keys.next();
                double rate = ratesObject.getDouble(code);
                String name = getCurrencyName(code);
                rates.add(new CurrencyRate(name, code, rate));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rates;
    }

    private static String getCurrencyName(String code) {
        switch (code) {
            case "USD": return "United States Dollar";
            case "EUR": return "Euro";
            case "GBP": return "British Pound";
            case "AUD": return "Australian Dollar";
            case "CAD": return "Canadian Dollar";
            case "CNY": return "Chinese Yuan";
            case "IDR": return "Indonesian Rupiah";
            case "INR": return "Indian Rupee";
            case "JPY": return "Japanese Yen";
            case "KRW": return "South Korean Won";
            case "MYR": return "Malaysian Ringgit";
            case "NZD": return "New Zealand Dollar";
            case "PHP": return "Philippine Peso";
            case "SGD": return "Singapore Dollar";
            case "THB": return "Thai Baht";
            case "TWD": return "New Taiwan Dollar";
            case "VND": return "Vietnamese Dong";
            case "CHF": return "Swiss Franc";
            case "DKK": return "Danish Krone";
            case "EGP": return "Egyptian Pound";
            case "ILS": return "Israeli New Sheqel";
            case "JOD": return "Jordanian Dinar";
            case "LBP": return "Lebanese Pound";
            case "NOK": return "Norwegian Krone";
            case "SEK": return "Swedish Krona";
            case "ZAR": return "South African Rand";
            case "BGN": return "Bulgarian Lev";
            case "BRL": return "Brazilian Real";
            case "CLP": return "Chilean Peso";
            case "CZK": return "Czech Koruna";
            case "HUF": return "Hungarian Forint";
            case "ISK": return "Icelandic Krona";
            case "MXN": return "Mexican Peso";
            case "PLN": return "Polish Zloty";
            case "RON": return "Romanian New Leu";
            case "TRY": return "Turkish Lira";
            case "UAH": return "Ukrainian Hryvnia";
            case "AED": return "U.A.E Dirham";
            case "MDL": return "Moldova Lei";
            case "RSD": return "Serbian Dinar";
            case "RUB": return "Russian Rouble";
            case "AMD": return "Armenia Dram";
            case "AZN": return "Azerbaijan Manat";
            case "BDT": return "Bangladeshi Taka";
            case "DOP": return "Dominican Peso";
            case "DZD": return "Algerian Dinar";
            case "GEL": return "Georgian Lari";
            case "IQD": return "Iraqi Dinar";
            case "KGS": return "Kyrgyzstan Som";
            case "KZT": return "Kazakhstani Tenge";
            case "LYD": return "Libyan Dinar";
            case "MAD": return "Moroccan Dirham";
            case "PKR": return "Pakistani Rupee";
            case "SAR": return "Saudi Riyal";
            default: return code; // return the code if name is not found
        }
    }
}
