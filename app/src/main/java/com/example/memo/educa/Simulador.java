package com.example.memo.educa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Simulador extends AppCompatActivity {
    private Button btnProyeccion;
    private Button btnPosibleA;
    private Button btnAhorro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simulador);

        btnProyeccion = (Button)findViewById(R.id.btn_proyeccion);
        btnPosibleA=(Button)findViewById(R.id.btn_posa);
        btnAhorro=(Button)findViewById(R.id.btn_ahorro);

        btnProyeccion.setOnClickListener(new View.OnClickListener(){
            public void onClick(View w) {
                Intent intent= new Intent(Simulador.this, Proyeccion.class);

                //Iniciamos la nueva actividad
                startActivity(intent);
            }
        });
        btnPosibleA.setOnClickListener(new View.OnClickListener(){
            public void onClick(View w) {
                Intent intent= new Intent(Simulador.this, Sim2.class);

                //Iniciamos la nueva actividad
                startActivity(intent);
            }
        });


        btnAhorro.setOnClickListener(new View.OnClickListener(){
            public void onClick(View w) {
                Intent intent= new Intent(Simulador.this, Real.class);

                //Iniciamos la nueva actividad
                startActivity(intent);
            }
        });


    }


}
