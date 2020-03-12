package com.example.apimysql;

import java.util.ArrayList;

public class PegawaiResult {
    private ArrayList<Pegawai> result;

    public PegawaiResult(ArrayList<Pegawai> result) {
        this.result = result;
    }

    public ArrayList<Pegawai> getResult() {
        return result;
    }
}
