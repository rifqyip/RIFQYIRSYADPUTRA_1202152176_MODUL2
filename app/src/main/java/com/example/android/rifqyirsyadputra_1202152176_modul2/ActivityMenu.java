package com.example.android.rifqyirsyadputra_1202152176_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.LinkedList;

public class ActivityMenu extends AppCompatActivity {

    private final LinkedList<String> makananj = new LinkedList<>();
    private final LinkedList<Integer> hargaj = new LinkedList<>();
    private final LinkedList<Integer> gambarj = new LinkedList<>();
    private int mCount = 0;

    private RecyclerView mRecyclerView;
    private MenuAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        dummiesData();
        // Get a handle to the RecyclerView.
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        // Create an adapter and supply the data to be displayed.
        mAdapter = new MenuAdapter(this, makananj, hargaj, gambarj);
        // Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // Give the RecyclerView a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void dummiesData(){
        for (int i = 0;i < 3; i++){
            makananj.add("Ayam Pedas");
            makananj.add("Ikan Pedas");
            makananj.add("Mie Goreng");
            makananj.add("Nasi Goreng");
            makananj.add("Pudding Coklat");
            makananj.add("Sayur Kangkung");
            makananj.add("Sop Jagung");

            hargaj.add(20000);
            hargaj.add(18000);
            hargaj.add(15000);
            hargaj.add(15000);
            hargaj.add(10000);
            hargaj.add(8000);
            hargaj.add(14000);


            gambarj.add(R.drawable.ayam_pedas);
            gambarj.add(R.drawable.ikan_pedas);
            gambarj.add(R.drawable.mie_goreng);
            gambarj.add(R.drawable.nasi_goreng);
            gambarj.add(R.drawable.pudding_coklat);
            gambarj.add(R.drawable.sayur_kangkung);
            gambarj.add(R.drawable.sop_jagung);

            //deskripsi.add("Nasi + Ayam dengan Saus Pedas Khas Mix Resto");
            //deskripsi.add("Nasi + Ikan Pedas Saus Pedas Khas Mix Resto");
            //deskripsi.add("Mie Goreng + Ayam Khas Mix Resto");
            //deskripsi.add("Nasi Goreng + Telur Khas Mix Resto");
            //deskripsi.add("Pudding Coklat dengan NuttelaKhas Mix Resto");
            //deskripsi.add("Sayur Kangkung Bergizi Khas Mix Resto");
            //deskripsi.add("Sop Jagung dengan Ayam & Telur Khas Mix Resto");
        }
    }
}
