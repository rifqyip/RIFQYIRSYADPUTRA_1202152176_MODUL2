package com.example.android.rifqyirsyadputra_1202152176_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class ActivityOrder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(this,"RIFQY IRSYAD PUTRA_1202152176",Toast.LENGTH_SHORT).show();
        setContentView(R.layout.activity_order);
    }

    public void onClickOrder(View view) {
        if (((RadioButton)findViewById(R.id.rbt_DineIn)).isChecked()){
            Intent intent = new Intent(this, ActivityDineIn.class);
            startActivity(intent);
        }else if (((RadioButton)findViewById(R.id.rbt_TakeAway)).isChecked()){
            Intent intent = new Intent(this, ActivityTakeAway.class);
            startActivity(intent);
        }else{
            Toast.makeText(this,"Pilih order terlebih dahulu",Toast.LENGTH_SHORT).show();
        }
    }


}
