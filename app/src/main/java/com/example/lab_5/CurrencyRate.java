package com.example.lab_5;

public class CurrencyRate {
    private final String name;
    private final String code;
    private final double rate;

    public CurrencyRate(String name, String code, double rate) {
        this.name = name;
        this.code = code;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public double getRate() {
        return rate;
    }
}
