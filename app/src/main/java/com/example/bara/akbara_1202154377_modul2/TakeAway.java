package com.example.bara.akbara_1202154377_modul2;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class TakeAway extends AppCompatActivity {

    private TextInputLayout a,b,c,d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);

        //mensetting toolbar yang akan muncul di atas dengan nama Dine In
        //Toolbar mToolbar = (Toolbar) findViewById(R.id.appbar_dinein);
        //setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Dine In");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        c = (Spinner) findViewById(R.id.notable);

        //memanggil array untuk menampung data yang ada pada spinner nantinya
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.labels_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //jika spinner tidak kosong maka akan menset isi adapter dengan isi yang kita sudah masukkan di string.xml
        if (c != null){
            c.setAdapter(adapter);
        }
    }

    public void pilihpesanan(View view) {

        a = (TextInputLayout) findViewById(R.id.nama);

        //membuat string test agar spinner dapat dipilih
        String test = c.getSelectedItem().toString();

        if (a ==null){
            Toast.makeText(this,"Diisi dahulu", Toast.LENGTH_LONG).show();
        }
        //jika dipilih Table 1 akan muncul toast kalau memilih Table 1
        else if (test.equalsIgnoreCase("Table 1")){
            String nama = a.getEditText().getText().toString();
            Toast.makeText(this,"Anda " + nama + " Memilih Table 1",Toast.LENGTH_LONG).show();
        }
        else if (test.equalsIgnoreCase("Table 2")){
            String nama = a.getEditText().getText().toString();
            Toast.makeText(this,"Anda " + nama + " Memilih Table 2",Toast.LENGTH_LONG).show();
        }
        else if (test.equalsIgnoreCase("Table 3")){
            String nama = a.getEditText().getText().toString();
            Toast.makeText(this,"Anda " + nama + " Memilih Table 3",Toast.LENGTH_LONG).show();
        }
        else if (test.equalsIgnoreCase("Table 4")){
            String nama = a.getEditText().getText().toString();
            Toast.makeText(this,"Anda " + nama + " Memilih Table 4",Toast.LENGTH_LONG).show();
        }
        else if (test.equalsIgnoreCase("Table 5")){
            String nama = a.getEditText().getText().toString();
            Toast.makeText(this,"Anda " + nama + " Memilih Table 5",Toast.LENGTH_LONG).show();
        }

        //mengirimkan nama dan jumlah ke dalam intent agar bisa di get pada class yang di tuju
        Intent a = new Intent(DineIn.this,ListPesanan.class);
        startActivity(a);
    }
}
