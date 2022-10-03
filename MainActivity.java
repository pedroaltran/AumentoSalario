package com.example.salarycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button button_calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_calcular = (Button) findViewById(R.id.button);

        button_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double salario, novo_salario = 0;
                EditText vlr = (EditText) findViewById(R.id.salario);
                salario = Double.parseDouble(vlr.getText().toString());
                RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

                int op = radioGroup.getCheckedRadioButtonId();
                if(op == R.id.radiobtn1)
                    novo_salario = salario + (salario*0.40);
                else
                    if(op == R.id.radiobtn2)
                        novo_salario = salario + (salario*0.45);
                    else
                        if(op == R.id.radiobtn3)
                            novo_salario = salario + (salario*0.5);

                TextView textView = findViewById(R.id.txtTotal);
                textView.setText(String.valueOf(novo_salario));
            }
        });

    }
}