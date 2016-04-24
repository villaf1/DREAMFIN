package com.example.memo.educa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main extends AppCompatActivity {
    private Button btnConsulta;
    private Button btnSimulador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);


    btnConsulta = (Button)findViewById(R.id.btn_consulta);
    btnSimulador=(Button)findViewById(R.id.btn_simulador);

    btnSimulador.setOnClickListener(new View.OnClickListener(){
        public void onClick(View w) {
            Intent intent= new Intent(Main.this, Simulador.class);

            //Iniciamos la nueva actividad
            startActivity(intent);
        }
    });
        btnConsulta.setOnClickListener(new View.OnClickListener(){
            public void onClick(View w) {
                Intent intent= new Intent(Main.this, Navegacion.class);

                //Iniciamos la nueva actividad
                startActivity(intent);
            }
        });
    }
}
