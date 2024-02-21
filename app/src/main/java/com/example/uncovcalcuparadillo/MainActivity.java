package com.example.uncovcalcuparadillo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView Pagename;
    EditText num1;
    EditText num2;
    TextView textresult;
    TextView Resultvalue;
    Button addition;
    Button subtraction;
    Button multiplication;
    Button division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pagename = (TextView) findViewById(R.id.txtpagename);
        num1 = (EditText) findViewById(R.id.txtnum1);
        num2 = (EditText) findViewById(R.id.txtnum2);
        textresult = (TextView) findViewById(R.id.txtresult);
        Resultvalue = (TextView) findViewById(R.id.txtresultvalue);
        addition = (Button) findViewById(R.id.btnADD);
        subtraction = (Button) findViewById(R.id.btnSUB);
        multiplication = (Button) findViewById(R.id.btnMulti);
        division = (Button) findViewById(R.id.btnDIV);

        addition.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = Double.parseDouble(num1.getText().toString());
                double n2 = Double.parseDouble(num2.getText().toString());
                double humana = n1+n2;

                String mamanilester = String.valueOf(humana);

                Resultvalue.setText(mamanilester);
            }
        }));
        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = Double.parseDouble(num1.getText().toString());
                double n2 = Double.parseDouble(num2.getText().toString());
                double result = n1-n2;

                Resultvalue.setText(String.valueOf(result));
            }
        });
        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = Double.parseDouble(num1.getText().toString());
                double n2 = Double.parseDouble(num2.getText().toString());
                double result = n1*n2;

                Resultvalue.setText((String.valueOf(result)));
            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = Double.parseDouble(num1.getText().toString());
                double n2 = Double.parseDouble(num2.getText().toString());
                double result = n1/n2;

                Resultvalue.setText((String.valueOf(result)));
            }
        });

    }

}
