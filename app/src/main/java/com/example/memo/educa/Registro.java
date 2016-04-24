package com.example.memo.educa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Registro extends AppCompatActivity {
    private Button btncontinuar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro);

        btncontinuar=(Button)findViewById(R.id.continuar);

        btncontinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creamos el Intent
                Intent intent= new Intent(Registro.this, Registro2.class);

                //Creamos la información a pasar entre actividades
                    startActivity(intent);
            }
        });

    }
}
