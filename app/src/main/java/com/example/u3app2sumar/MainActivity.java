package com.example.u3app2sumar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnSumar;
    private TextView txtResultado;
    private TextView txtNum1;
    private TextView txtNum2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Accesar a los controles de la App
        txtResultado = (TextView) findViewById(R.id.txtResultado);
        txtNum1 = (EditText) findViewById(R.id.txtNum1);
        txtNum2 = (EditText) findViewById(R.id.txtNum2);
    }
    public void hacerClick (View vista){
        int num1,num2 = 0;
        int resultado = 0;
        //Convertir string a int para sumar
        num1 = Integer.parseInt(String.valueOf(txtNum1.getText()));
        num2 = Integer.parseInt(String.valueOf(txtNum2.getText()));

        resultado = num1 + num2;

        //Poner el resultado en el control
        txtResultado.setText(" "+ resultado);
    }
}