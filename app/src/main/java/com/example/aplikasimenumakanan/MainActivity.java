package com.example.aplikasimenumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button kembali,pesan;
    RecyclerView recyclerView;

    ArrayList<setMakanan> datamenu;

    GridLayoutManager gridLayoutManager;

    DataMakanan adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        kembali=findViewById(R.id.kembali);
        pesan=findViewById(R.id.pesan);
        pesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),pesan.class));
            }
        });
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),halaman_depan.class));
            }
        });
        addData();
        gridLayoutManager = new GridLayoutManager(this,1);
        recyclerView.setLayoutManager(gridLayoutManager);

        adapter = new DataMakanan(datamenu);
        recyclerView.setAdapter(adapter);
    }

    public void addData(){
        datamenu = new ArrayList<>();
        datamenu.add(new setMakanan("nasi goeng","FotoMakanan1","Rp.21.000","ayam geprek","Harga:   Rp.21.000",R.drawable.ayam));
        datamenu.add(new setMakanan("kari ayam","FotoMakanan2","Rp.13.000","kari ayam","Harga:   Rp.13.000",R.drawable.kariayam));
        datamenu.add(new setMakanan("masi goreng ","FotoMakanan3","Rp.17.000","Tahu Asin","Harga   Rp.17.000",R.drawable.nasgor));
        datamenu.add(new setMakanan("salat + keju","FotoMakanan4","Rp.15.000","salat + keju","Harga:   Rp.15.000",R.drawable.salad));
        datamenu.add(new setMakanan("tahu bulat","FotoMakanan5","Rp.3000","tahu bulat","Harga:   Rp.3000",R.drawable.tahubulat));
    }

}