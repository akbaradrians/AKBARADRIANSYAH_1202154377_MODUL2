package com.example.bara.akbara_1202154377_modul2;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {

    private TextView a,b,f;
    private ImageView d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_makanan);

        //melakukan insiasi pada id nya

        a = (TextView) findViewById(R.id.namamakanan);

        b = (TextView) findViewById(R.id.harga);

        f = (TextView) findViewById(R.id.komposisi);

        d = (ImageView) findViewById(R.id.gambar);

        //mensetting toolbar yang akan muncul di atas dengan nama List Makanan
        Toolbar mToolbar = (Toolbar) findViewById(R.id.appbar_detail);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Detail Makanan");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //melakukan get data dari menu fitur sebelumnya sudah membawa data yang dikirim
        Intent c = getIntent();

        String menu = c.getStringExtra("judul");
        String hrga = c.getStringExtra("harga");
        String kmposisi= c.getStringExtra("komposisi");
        Integer gmbr = c.getIntExtra("gambar",0);

        //melakukan set tex maupun setImageResource untuk data yang sudah di bawa dari layout sbeelumnya
        a.setText(menu);
        b.setText(hrga);
        f.setText(kmposisi);
        d.setImageResource(gmbr);


    }
}
