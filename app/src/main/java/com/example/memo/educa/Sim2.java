package com.example.memo.educa;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Sim2 extends AppCompatActivity implements View.OnClickListener{

    EditText Ingresos, Gastos;
    TextView Total;
    Button AGastos, Finalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sim2);

        Ingresos = (EditText) findViewById(R.id.Ingresos);
        Gastos = (EditText) findViewById(R.id.Gastos);
        Total = (TextView) findViewById(R.id.Total);
        AGastos = (Button) findViewById(R.id.AGastos);
        Finalizar = (Button) findViewById(R.id.Finalizar);
    }

    @Override
    public void onClick(View v) {
        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(Ingresos.getWindowToken(), 0);
        InputMethodManager imm2 = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        imm2.hideSoftInputFromWindow(Gastos.getWindowToken(), 0);

        String ing = Ingresos.getText().toString();
        String gasto = Gastos.getText().toString();

        int Ent1 = Integer.parseInt(ing);
        int Ent2 = Integer.parseInt(gasto);
        int Ax = 0;

        switch (v.getId()) {
            case R.id.Gastos:
                Ax=Ent1-Ent2;
                Ent1 = Ax;
                Total.setText("$ " + Ent1);
                break;
            case R.id.Finalizar:
                Total.setText("$ " + Ent1);
                break;
        }
        Total.setText("$ " + Ent1);

    }


}
