package com.example.lab_5;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private EditText filterText;
    private CurrencyAdapter adapter;
    private List<CurrencyRate> currencyRates;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        filterText = findViewById(R.id.filterText);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        currencyRates = new ArrayList<>();
        adapter = new CurrencyAdapter(currencyRates);
        recyclerView.setAdapter(adapter);

        filterText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                adapter.filter(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {}
        });

        loadCurrencyData();
    }

    private void loadCurrencyData() {
        currencyRates.add(new CurrencyRate("Australian Dollar", "AUD", 1.54631548));
        currencyRates.add(new CurrencyRate("Canadian Dollar", "CAD", 1.40595502));
        currencyRates.add(new CurrencyRate("Chinese Yuan", "CNY", 7.23058742));
        currencyRates.add(new CurrencyRate("Euro", "EUR", 0.94704454));
        currencyRates.add(new CurrencyRate("U.K. Pound Sterling", "GBP", 0.78984514));
        currencyRates.add(new CurrencyRate("Hong Kong Dollar", "HKD", 7.78480484));
        currencyRates.add(new CurrencyRate("Indonesian Rupiah", "IDR", 15864.39898762));
        currencyRates.add(new CurrencyRate("Indian Rupee", "INR", 84.41491643));
        currencyRates.add(new CurrencyRate("Japanese Yen", "JPY", 155.42573978));
        currencyRates.add(new CurrencyRate("South Korean Won", "KRW", 1397.22542222));
        currencyRates.add(new CurrencyRate("Malaysian Ringgit", "MYR", 4.47234765));
        currencyRates.add(new CurrencyRate("New Zealand Dollar", "NZD", 1.70470967));
        currencyRates.add(new CurrencyRate("Philippine Peso", "PHP", 58.79270375));
        currencyRates.add(new CurrencyRate("Singapore Dollar", "SGD", 1.34213912));
        currencyRates.add(new CurrencyRate("Thai Baht", "THB", 34.86178242));
        currencyRates.add(new CurrencyRate("New Taiwan Dollar", "TWD", 32.51223013));
        currencyRates.add(new CurrencyRate("Vietnamese Dong", "VND", 25391.69162198));
        currencyRates.add(new CurrencyRate("Swiss Franc", "CHF", 0.88771640));
        currencyRates.add(new CurrencyRate("Danish Krone", "DKK", 7.04985647));
        currencyRates.add(new CurrencyRate("Egyptian Pound", "EGP", 49.37250027));
        currencyRates.add(new CurrencyRate("Israeli New Sheqel", "ILS", 3.74053202));
        currencyRates.add(new CurrencyRate("Jordanian Dinar", "JOD", 0.70902237));
        currencyRates.add(new CurrencyRate("Lebanese Pound", "LBP", 93575.00000000));
        currencyRates.add(new CurrencyRate("Norwegian Krone", "NOK", 11.07198759));
        currencyRates.add(new CurrencyRate("Swedish Krona", "SEK", 10.96662426));
        currencyRates.add(new CurrencyRate("United States Dollar", "USD", 1.0));
        currencyRates.add(new CurrencyRate("Euro", "EUR", 0.94704454));
        currencyRates.add(new CurrencyRate("British Pound", "GBP", 0.78984514));
        currencyRates.add(new CurrencyRate("Australian Dollar", "AUD", 1.54631548));
        currencyRates.add(new CurrencyRate("Canadian Dollar", "CAD", 1.40595502));
        currencyRates.add(new CurrencyRate("Chinese Yuan", "CNY", 7.23058742));
        currencyRates.add(new CurrencyRate("South African Rand", "ZAR", 18.19290554));
        currencyRates.add(new CurrencyRate("Bulgarian Lev", "BGN", 1.84831533));
        currencyRates.add(new CurrencyRate("Brazilian Real", "BRL", 5.79510953));
        currencyRates.add(new CurrencyRate("Chilean Peso", "CLP", 976.23001670));
        currencyRates.add(new CurrencyRate("Czech Koruna", "CZK", 23.89525660));
        currencyRates.add(new CurrencyRate("Hungarian Forint", "HUF", 384.7686619));
        currencyRates.add(new CurrencyRate("Icelandic Krona", "ISK", 137.70478720));
        currencyRates.add(new CurrencyRate("Mexican Peso", "MXN", 20.38404422));
        currencyRates.add(new CurrencyRate("Polish Zloty", "PLN", 4.08255330));
        currencyRates.add(new CurrencyRate("Romanian New Leu", "RON", 4.70324819));
        currencyRates.add(new CurrencyRate("Turkish Lira", "TRY", 34.42399549));
        currencyRates.add(new CurrencyRate("Ukrainian Hryvnia", "UAH", 41.27569833));
        currencyRates.add(new CurrencyRate("U.A.E Dirham", "AED", 3.67552713));
        currencyRates.add(new CurrencyRate("Moldova Lei", "MDL", 18.05129448));
        currencyRates.add(new CurrencyRate("Serbian Dinar", "RSD", 109.21724577));
        currencyRates.add(new CurrencyRate("Russian Rouble", "RUB", 99.82726553));
        currencyRates.add(new CurrencyRate("Armenia Dram", "AMD", 388.18506677));
        currencyRates.add(new CurrencyRate("Azerbaijan Manat", "AZN", 1.69979823));
        currencyRates.add(new CurrencyRate("Bangladeshi Taka", "BDT", 119.84080806));
        currencyRates.add(new CurrencyRate("Dominican Peso", "DOP", 60.09005869));
        currencyRates.add(new CurrencyRate("Algerian Dinar", "DZD", 133.32274244));
        currencyRates.add(new CurrencyRate("Georgian Lari", "GEL", 2.74450827));
        currencyRates.add(new CurrencyRate("Iraqi Dinar", "IQD", 1311.92118227));
        currencyRates.add(new CurrencyRate("Kyrgyzstan Som", "KGS", 85.92577174));
        currencyRates.add(new CurrencyRate("Kazakhstani Tenge", "KZT", 496.66241548));
        currencyRates.add(new CurrencyRate("Libyan Dinar", "LYD", 4.82706362));
        currencyRates.add(new CurrencyRate("Moroccan Dirham", "MAD", 9.84764774));
        currencyRates.add(new CurrencyRate("Pakistani Rupee", "PKR", 277.92295377));
        currencyRates.add(new CurrencyRate("Saudi Riyal", "SAR", 3.75567785));
        adapter.notifyDataSetChanged();
    }


    private class CurrencyAdapter extends RecyclerView.Adapter<CurrencyAdapter.ViewHolder> {

        private List<CurrencyRate> filteredList;
        private final List<CurrencyRate> originalList;

        public CurrencyAdapter(List<CurrencyRate> list) {
            this.originalList = list;
            this.filteredList = new ArrayList<>(list); // Start with all currencies
        }

        public void filter(String query) {
            query = query.toLowerCase();
            filteredList.clear();
            if (query.isEmpty()) {
                filteredList.addAll(originalList);
            } else {
                for (CurrencyRate rate : originalList) {
                    if (rate.getName().toLowerCase().contains(query) || rate.getCode().toLowerCase().contains(query)) {
                        filteredList.add(rate);
                    }
                }
            }
            notifyDataSetChanged();
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.currency_item, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            CurrencyRate rate = filteredList.get(position);
            holder.currencyName.setText(rate.getName());
            holder.currencyCode.setText(rate.getCode());
            holder.currencyRate.setText(String.valueOf(rate.getRate()));
        }

        @Override
        public int getItemCount() {
            return filteredList.size();
        }

        private class ViewHolder extends RecyclerView.ViewHolder {
            TextView currencyName, currencyCode, currencyRate;

            public ViewHolder(View itemView) {
                super(itemView);
                currencyName = itemView.findViewById(R.id.currencyName);
                currencyCode = itemView.findViewById(R.id.currencyCode);
                currencyRate = itemView.findViewById(R.id.currencyRate);
            }
        }
    }
}