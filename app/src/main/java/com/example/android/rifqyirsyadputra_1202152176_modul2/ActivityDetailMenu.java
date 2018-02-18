package com.example.android.rifqyirsyadputra_1202152176_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityDetailMenu extends AppCompatActivity {

    TextView tv_makanan, tv_harga, tv_deskripsi;
    ImageView iv_gambar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);

        Intent intent = getIntent();
        String makanan = intent.getStringExtra("makanan");
        Integer harga = intent.getIntExtra("harga",0);
        Integer gambar = intent.getIntExtra("gambar",0);
        //String deskripsi = intent.getStringExtra("deskripsi");

        tv_makanan = (TextView)findViewById(R.id.tv_detailmakanan);
        tv_harga = (TextView)findViewById(R.id.tv_detailharga);
        iv_gambar = (ImageView)findViewById(R.id.iv_detailgambar);
        //tv_deskripsi = (TextView)findViewById(R.id.tv_deskripsi);

        tv_makanan.setText(makanan);
        tv_harga.setText("Rp. "+harga);
        iv_gambar.setImageResource(gambar);



    }


}
