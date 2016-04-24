package com.example.memo.educa;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.content.*;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;


public class Login extends AppCompatActivity {

        private EditText Email;
        private EditText Contrasena;
        private Button btnAceptar;
        private String email="user";
        private String contrasena="user";
        private Button btnRegistro;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_login);

            //Obtenemos una referencia a los controles de la interfaz
            Email = (EditText)findViewById(R.id.email);
            Contrasena=(EditText)findViewById(R.id.contrasena);
            btnAceptar = (Button)findViewById(R.id.btnAceptar);
            btnRegistro=(Button)findViewById(R.id.btnregistro);

            //Implementamos el evento click del botón
            btnAceptar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Creamos el Intent El cual mostrara la siguiente pantalla de inicio
                    Intent intent= new Intent(Login.this, Main.class);

                    //Creamos la información a pasar entre actividades
                    Bundle b = new Bundle();
                    b.putString("Email", Email.getText().toString());
                    if (Email.getText().toString().equals(email)&& Contrasena.getText().toString().equals(contrasena))
                    {
                        //Añadimos la información al intent
                        intent.putExtras(b);

                        //Iniciamos la nueva actividad
                        startActivity(intent);
                    }
                    else {
                        Toast.makeText(Login.this,"Usuario/Contraseña Inválida", Toast.LENGTH_SHORT).show();
                    }

                }
            });//cierre del listener btnAceptar

            //Accion del boton Registro
            btnRegistro.setOnClickListener(new View.OnClickListener(){
                public void onClick(View w) {
                    Intent intent= new Intent(Login.this, Registro.class);

                    Email.getText();

                    //Iniciamos la nueva actividad
                    startActivity(intent);
                }
            });

        }
}

