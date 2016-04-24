package com.example.memo.educa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class Navegacion extends AppCompatActivity {

    private Button btnsiguiente;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.navegacion);

        WebView myWebView = (WebView) this.findViewById(R.id.webView);

        // Enable JavaScript WebSettings webSettings =
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Provide a WebViewClient for your WebView
        myWebView.setWebViewClient(new WebViewClient());

        myWebView.loadUrl("https://www.bancomer.com/index.jsp#");

        btnsiguiente=(Button)findViewById(R.id.continuar);

        btnsiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creamos el Intent
                Intent intent= new Intent(Navegacion.this, Main.class);

                //Creamos la información a pasar entre actividades
                startActivity(intent);
            }
        });
    }


}