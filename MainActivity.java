package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView result;
    EditText num1, num2;
    Button add,sub,multiply,divide;
    float result_num;
    int n1,n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result=(TextView)findViewById(R.id.result);
        num1=(EditText)findViewById(R.id.num1);
        num2=(EditText)findViewById(R.id.num2);
        add=(Button)findViewById(R.id.add);
        sub=(Button)findViewById(R.id.sub);
        multiply=(Button) findViewById(R.id.multiply);
        divide=(Button)findViewById(R.id.divide);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=Integer.parseInt(num1.getText().toString());
                n2=Integer.parseInt(num2.getText().toString());
                result_num=n1+n2;
                result.setText(String.valueOf(result_num));
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=Integer.parseInt(num1.getText().toString());
                n2=Integer.parseInt(num2.getText().toString());
                result_num=n1-n2;
                result.setText(String.valueOf(result_num));
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=Integer.parseInt(num1.getText().toString());
                n2=Integer.parseInt(num2.getText().toString());
                result_num=n1*n2;
                result.setText(String.valueOf(result_num));
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=Integer.parseInt(num1.getText().toString());
                n2=Integer.parseInt(num2.getText().toString());
                result_num=n1/n2;
                result.setText(String.valueOf(result_num));
            }
        });

    }
}
