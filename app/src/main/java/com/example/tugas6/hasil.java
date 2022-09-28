package com.example.tugas6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class hasil extends AppCompatActivity {
    TextView tvangka, tvurutan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);
        tvangka = findViewById(R.id.hasil);
        tvurutan = findViewById(R.id.urutan);

        String bil = getIntent().getExtras().getString("angka");
        int bill = Integer.parseInt(bil);

        if (bill%2 == 0) {
            tvangka.setText(bill + " adalah bilangan genap");
        }
        else {
            tvangka.setText(bill + " adalah bilangan ganjil");
        }

        String cetak = "";
        if(bill%2==0) {
            for (int i = 0; i <= bill; i++) {
                if (i % 2 == 0)
                    cetak = cetak + i + " ";
                tvurutan.setText(cetak);
            }
        }
        else {
            for (int i = 0; i <= bill; i++) {
                if (i % 2 != 0)
                    cetak = cetak + i + " ";
                tvurutan.setText(cetak);
            }
        }
    }
}