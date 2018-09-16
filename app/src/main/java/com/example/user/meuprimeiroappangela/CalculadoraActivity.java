package com.example.user.meuprimeiroappangela;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculadoraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        TextView resultado = findViewById(R.id.textview_resultado);

        Button btn1 = findViewById(R.id.btn_1);
        Button btn2 = findViewById(R.id.btn_2);
        Button btn3 = findViewById(R.id.btn_3);
        Button btn4 = findViewById(R.id.btn_4);
        Button btn5 = findViewById(R.id.btn_5);
        Button btn6 = findViewById(R.id.btn_6);
        Button btn7 = findViewById(R.id.btn_7);
        Button btn8 = findViewById(R.id.btn_8);
        Button btn9 = findViewById(R.id.btn_9);
        Button btn0 = findViewById(R.id.btn_0);

        Button btnMais = findViewById(R.id.btn_mais);
        Button btnMenos = findViewById(R.id.btn_menos);
        Button btnDivisao = findViewById(R.id.btn_divisao);
        Button btnMultiplicacao = findViewById(R.id.btn_multiplicacao);
        Button btnIgual = findViewById(R.id.btn_igual);

        onClickButtons(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnMais, btnMenos, btnDivisao, btnMultiplicacao, btnIgual, resultado);
    }

    private void onClickButtons(Button btn1, Button btn2, Button btn3, Button btn4, Button btn5, Button btn6, Button btn7, Button btn8, Button btn9, Button btn0, Button btnMais, Button btnMenos, Button btnDivisao, Button btnMultiplicacao, Button btnIgual, final TextView resultado) {
        btnMais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String stringResultado = resultado.getText().toString();
                resultado.setText(stringResultado+"+");
            }
        });

        btnMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String stringResultado = resultado.getText().toString();
                resultado.setText(stringResultado+"-");
            }
        });

        btnDivisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String stringResultado = resultado.getText().toString();
                resultado.setText(stringResultado+"/");
            }
        });

        btnMultiplicacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String stringResultado = resultado.getText().toString();
                resultado.setText(stringResultado+"*");
            }
        });

        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String stringResultado = resultado.getText().toString();
                resultado.setText(stringResultado+"=");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String stringResultado = resultado.getText().toString();
                resultado.setText(stringResultado+"1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String stringResultado = resultado.getText().toString();
                resultado.setText(stringResultado+"2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String stringResultado = resultado.getText().toString();
                resultado.setText(stringResultado+"3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String stringResultado = resultado.getText().toString();
                resultado.setText(stringResultado+"4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String stringResultado = resultado.getText().toString();
                resultado.setText(stringResultado+"5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String stringResultado = resultado.getText().toString();
                resultado.setText(stringResultado+"6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String stringResultado = resultado.getText().toString();
                resultado.setText(stringResultado+"7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String stringResultado = resultado.getText().toString();
                resultado.setText(stringResultado+"8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String stringResultado = resultado.getText().toString();
                resultado.setText(stringResultado+"9");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String stringResultado = resultado.getText().toString();
                resultado.setText(stringResultado+"0");
            }
        });
    }
}
