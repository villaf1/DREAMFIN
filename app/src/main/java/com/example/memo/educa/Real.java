package com.example.memo.educa;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Real extends AppCompatActivity implements View.OnClickListener {
     Spinner opcion;
     List<String> lista;
    EditText ARea, TAhorr;
    TextView ah, falt, falta;
    String seleccion;
    int cont=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_real);
        ARea = (EditText) findViewById(R.id.AReal);
        TAhorr = (EditText) findViewById(R.id.TAhorro);
        ah=(TextView) findViewById(R.id.aho);
        falt = (TextView) findViewById(R.id.falta);
        falta = (TextView) findViewById(R.id.faltap);

        opcion = (Spinner) findViewById(R.id.opcion);
        lista = new ArrayList<String>();
        opcion = (Spinner) this.findViewById(R.id.opcion);

        lista.add("Tecnológico de Monterrey");
        lista.add("Instituto Iberoamericana");
        lista.add("Universidad de La Salle Bajío");
        lista.add("Instituto Tecnológico Autónomo de México");


        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, lista);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        opcion.setAdapter(adaptador);

        opcion.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                seleccion=parent.getItemAtPosition(position).toString();

                if(cont>0) {

                    carga();
                }
                cont++;//break;

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        }



    @Override
    public void onClick(View v) {

    }

    public void carga(){

        String n1 = ARea.getText().toString();
        String n2 = TAhorr.getText().toString();

        int Entn1 = Integer.parseInt(n1);
        int Entn2 = Integer.parseInt(n2);



        switch(seleccion){
            case "TecnológicodeMonterrey":
                operaciones(117140,Entn1,Entn2);
                break;
            case "InstitutoIberoamericana":
                operaciones(163440,Entn1,Entn2);
                break;
            case "UniversidaddeLaSalleBajío":
                operaciones(866050,Entn1,Entn2);
                break;
            case "InstitutoTecnológicoAutónomodeMéxico":
                operaciones(821358,Entn1,Entn2);
                break;

    }}

    public void operaciones(int colegia, int ahorro, int tiempo){
        int ahorroT;
        int faltaT;
        double porcenta;

        ahorroT=ahorro*tiempo;
        ah.setText(ahorroT);

        faltaT=colegia-ahorroT;
        falta.setText(faltaT);

        porcenta=(ahorroT*100)/colegia;
        falta.setText((int) porcenta);

    }
}
