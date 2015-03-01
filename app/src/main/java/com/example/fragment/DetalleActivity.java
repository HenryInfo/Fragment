package com.example.fragment;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TextView;

public class DetalleActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_detalle);
        if (getResources().getConfiguration().orientation== Configuration.ORIENTATION_LANDSCAPE){
            finish();
            return;
        }

        String pais=getIntent().getStringExtra("pais");
        TextView view =(TextView)findViewById(R.id.txtPaisElegido);
        view.setText("detalle del pais "+pais+" ...");
    }
}
