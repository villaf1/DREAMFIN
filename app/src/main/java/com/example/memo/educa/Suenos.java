package com.example.memo.educa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class Suenos extends AppCompatActivity {
    private Spinner opciones;
    private List<String> lista;
    String seleccion;
    int cont=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sueno);
        //DatosPorDefecto();

        opciones = (Spinner) findViewById(R.id.opciones);
        lista = new ArrayList<String>();
        opciones = (Spinner) this.findViewById(R.id.opciones);
        lista.add("Universisdad");
        lista.add("Viajar ");
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, lista);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        opciones.setAdapter(adaptador);




        opciones.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
            if(cont>0) {

                seleccion = arg0.getItemAtPosition(arg2).toString();
                if(seleccion.equals("Viaje"))
                {
                    Intent i = new Intent (Suenos.this, frase.class);
                    i.putExtra("opc", seleccion);
                }
                else
                {
                    //envia varo
                }
            }
        }
        @Override
        public void onNothingSelected(AdapterView<?> arg0) {
        }
    });

    }

    }




