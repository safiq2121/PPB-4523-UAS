package com.example.aplikasimenumakanan;

public class daftarpesan {
    private String pesanan;
    private String nama;
    private String key;

    public String getNim() {
        return pesanan;
    }

    public void setdata(String data) {
        this.pesanan = data;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String toPrint() {
        return null;
    }
}