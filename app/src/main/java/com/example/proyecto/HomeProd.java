package com.example.proyecto;

import static com.example.proyecto.R.id.editSum;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HomeProd extends AppCompatActivity {
    private Button btnSum;
    private EditText editNum1, editNum2, editSum;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proyecto_productos);

        btnSum = (Button) findViewById(R.id.btnSum);
        editNum1 = (EditText) findViewById(R.id.editNum1);
        editNum2 = (EditText) findViewById(R.id.editNum2);
        editSum = (EditText) findViewById(R.id.editSum);
        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //obtencion de datos con gettext y conversion a int
                int num1 = Integer.parseInt(editNum1.getText().toString().trim());
                int num2 = Integer.parseInt(editNum2.getText().toString().trim());
                // Se realiza la acción de Suma
                int suma = num1 + num2;
                // Inserta el resultado en en la caja con el setText
                editSum.setText(String.valueOf(suma));


            }
        });
    }
}