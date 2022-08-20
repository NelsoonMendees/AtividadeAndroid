package com.example.calculadora;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText txtNumeroUm;
    private EditText txtNumeroDois;
    private TextView txtViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNumeroUm = findViewById(R.id.txtNumeroUm);
        txtNumeroDois = findViewById(R.id.txtNumeroDois);
        txtViewResultado = findViewById(R.id.txtViewResultado);
    }

    public void Soma(View view) {
        float numUm = Float.parseFloat(txtNumeroUm.getText().toString());
        float numDois = Float.parseFloat(txtNumeroDois.getText().toString());

        txtViewResultado.setText(String.valueOf(numUm + numDois));
    }

    public void Subtracao(View view) {
        float numUm = Float.parseFloat(txtNumeroUm.getText().toString());
        float numDois = Float.parseFloat(txtNumeroDois.getText().toString());

        txtViewResultado.setText(String.valueOf(numUm - numDois));
    }

    public void Multiplicar(View view) {
        float numUm = Float.parseFloat(txtNumeroUm.getText().toString());
        float numDois = Float.parseFloat(txtNumeroDois.getText().toString());

        txtViewResultado.setText(String.valueOf(numUm * numDois));
    }

    public void Divisao(View view) {
        float numUm = Float.parseFloat(txtNumeroUm.getText().toString());
        float numDois = Float.parseFloat(txtNumeroDois.getText().toString());

        if (numUm == 0 || numDois == 0) {
            txtViewResultado.setText("Erro");
        } else {
            txtViewResultado.setText(String.valueOf(numUm / numDois));
        }
    }

    public void Limpar(View view){
        txtNumeroUm.setText("");
        txtNumeroDois.setText("");
        txtViewResultado.setText("0");
    }
}