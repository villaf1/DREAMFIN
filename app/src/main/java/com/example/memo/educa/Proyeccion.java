package com.example.memo.educa;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

public class Proyeccion extends AppCompatActivity implements View.OnClickListener {

    EditText Monto, Tiempo;
    TextView Resultado;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_educa);

        Monto = (EditText) findViewById(R.id.Monto);
        Tiempo = (EditText) findViewById(R.id.Tiempo);
        Resultado = (TextView) findViewById(R.id.Resultado);



    }

    @Override
    public void onClick(View v) {

        InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(Monto.getWindowToken(), 0);
        InputMethodManager imm2 = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        imm2.hideSoftInputFromWindow(Tiempo.getWindowToken(), 0);
        String n1 = Monto.getText().toString();
        String n2 = Tiempo.getText().toString();

        int Entn1 = Integer.parseInt(n1);
        int Entn2 = Integer.parseInt(n2);
        int Rta=0;

        switch (v.getId()){
            case R.id.Rdia:
                break;
            case R.id.Rsemana:
                Entn2 = Integer.parseInt(n2);
                Entn2=Entn2*7;
                break;
            case R.id.Rmes:
                Entn2 = Integer.parseInt(n2);
                Entn2=Entn2*30;
                break;
        }

        Rta=Entn1*Entn2;
        Resultado.setText("$ "+Rta);


    }
}
