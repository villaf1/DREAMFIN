package com.example.memo.educa;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class frase extends AppCompatActivity {
    String frase1="Viaje", frase2="Universidad";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frase);
        TextView frase = (TextView) findViewById(R.id.frase);
        if(getIntent().getStringExtra("opcion").equals("Viajar"))
        {
            frase.setText(frase1);
        }
        else
            frase.setText(frase2);
    }
}

