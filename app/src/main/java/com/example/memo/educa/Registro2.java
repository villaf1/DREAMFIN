package com.example.memo.educa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Registro2 extends AppCompatActivity {
    private Button btnregistrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro2);

        btnregistrar=(Button)findViewById(R.id.continuar);

        btnregistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creamos el Intent
                Intent intent= new Intent(Registro2.this, Main.class);

                //Creamos la información a pasar entre actividades
                startActivity(intent);
            }
        });
    }


}
