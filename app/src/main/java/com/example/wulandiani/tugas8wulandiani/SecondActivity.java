package com.example.wulandiani.tugas8wulandiani;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tanggal,waktu,ruangan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String rua = getIntent().getStringExtra("ruangan");
        String tgl = getIntent().getStringExtra("tanggal");
        String wkt = getIntent().getStringExtra("waktu");

        ruangan = (TextView) findViewById(R.id.tvBilling);
        tanggal = (TextView) findViewById(R.id.tvTanggal);
        waktu = (TextView) findViewById(R.id.tvWaktu);

        ruangan.setText("Ruangan: "+rua);
        tanggal.setText("Tanggal: "+tgl);
        waktu.setText("Waktu: "+wkt);

    }

}