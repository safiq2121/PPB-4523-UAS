package com.example.aplikasimenumakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class pesan extends AppCompatActivity {
    EditText nama,makanan;
    Button btnsave,btnview,kembali2;
    DatabaseReference   reference;
    daftarpesan daftarpesan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesan);

        nama=findViewById(R.id.namapb);
        makanan=findViewById(R.id.makanan);
        btnsave=findViewById(R.id.tblsave);
        btnview=findViewById(R.id.tblview);
        kembali2=findViewById(R.id.kembali2);
        daftarpesan=new daftarpesan();

        reference= FirebaseDatabase.getInstance().getReference().child("pesanan");

        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                daftarpesan.setdata(nama.getText().toString().trim());
                daftarpesan.setdata(makanan.getText().toString().trim());
                reference.push().setValue(daftarpesan);
                Toast.makeText(pesan.this, "Data tersimpan", Toast.LENGTH_SHORT).show();
            }
        });

        btnview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(pesan.this,list_data_pesanan.class);
                startActivity(intent);
            }
        });
        kembali2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });
    }
}