package com.example.user.meuprimeiroappangela;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;

public class GoogleChormeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_chorme_v2);

        WebView myWebView = findViewById(R.id.wv_google);
        myWebView.loadUrl("https://www.google.com");

        Button myButton = findViewById(R.id.btn_calculadora);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(GoogleChormeActivity.this, "Opa botao funcionando", Toast.LENGTH_LONG).show();

                Intent calculadoraActivity = new Intent(GoogleChormeActivity.this, CalculadoraActivity.class);
                startActivity(calculadoraActivity);
            }
        });
    }
}
