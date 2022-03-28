package com.android.s19110175;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.s19110175.calculator.Calculator;

public class LayoutActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;

    private Button btn_sub;
    private Button btn_add;
    private Button btn_mul;
    private Button btn_div;
    private Button btn_fact;
    private Button btn_log;
    private Button btn_exp;

    private TextView result;

    private Calculator cal = new Calculator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

    }

    public void init(){
        num1 = findViewById(R.id.num_1);
        num2 = findViewById(R.id.num_2);

        btn_add = findViewById(R.id.btn_add);
        btn_sub = findViewById(R.id.btn_sub);
        btn_mul = findViewById(R.id.btn_mul);
        btn_div = findViewById(R.id.btn_div);
        btn_exp = findViewById(R.id.btn_exp);
        btn_fact = findViewById(R.id.btn_fact);
        btn_log = findViewById(R.id.btn_log);

        result = findViewById(R.id.result);
    }

    public void add (View view){

        try{
            Integer n1 = Integer.parseInt(num1.getText().toString().trim());
            Integer n2 = Integer.parseInt(num2.getText().toString().trim());

            try {
                double r = cal.addTwoNumbers(n1, n2);
                result.setText(String.valueOf(r));
            }catch (Exception e){
                Toast.makeText(getApplicationContext(),"Input values have something error ! Please check again !", Toast.LENGTH_SHORT).show();
            }
        }catch (Exception e){
            Toast.makeText(getApplicationContext(),"Please input full number on edit text !", Toast.LENGTH_SHORT).show();
        }

    }

    public void sub (View view){
        try{
            Integer n1 = Integer.parseInt(num1.getText().toString().trim());
            Integer n2 = Integer.parseInt(num2.getText().toString().trim());

            try {
                double r = cal.subTwoNumbers(n1, n2);
                result.setText(String.valueOf(r));
            }catch (Exception e){
                Toast.makeText(getApplicationContext(),"Input values have something error ! Please check again !", Toast.LENGTH_SHORT).show();
            }
        }catch (Exception e){
            Toast.makeText(getApplicationContext(),"Please input full number on edit text !", Toast.LENGTH_SHORT).show();
        }
    }

    public void mul (View view){
        try{
            Integer n1 = Integer.parseInt(num1.getText().toString().trim());
            Integer n2 = Integer.parseInt(num2.getText().toString().trim());

            try {
                double r = cal.mulTwoNumbers(n1, n2);
                result.setText(String.valueOf(r));
            }catch (Exception e){
                Toast.makeText(getApplicationContext(),"Input values have something error ! Please check again !", Toast.LENGTH_SHORT).show();
            }
        }catch (Exception e){
            Toast.makeText(getApplicationContext(),"Please input full number on edit text !", Toast.LENGTH_SHORT).show();
        }
    }

    public void div (View view){
        try{
            Integer n1 = Integer.parseInt(num1.getText().toString().trim());
            Integer n2 = Integer.parseInt(num2.getText().toString().trim());

            try {
                double r = cal.divTwoNumbers(n1, n2);
                result.setText(String.valueOf(r));
            }catch (Exception e){
                Toast.makeText(getApplicationContext(),"Input values have something error ! Please check again !", Toast.LENGTH_SHORT).show();
            }
        }catch (Exception e){
            Toast.makeText(getApplicationContext(),"Please input full number on edit text !", Toast.LENGTH_SHORT).show();
        }
    }

    public void exp (View view){
        try{
            Integer n1 = Integer.parseInt(num1.getText().toString().trim());
            Integer n2 = Integer.parseInt(num2.getText().toString().trim());

            try {
                double r = cal.exponentialNumber(n1, n2);
                result.setText(String.valueOf(r));
            }catch (Exception e){
                Toast.makeText(getApplicationContext(),"Input values have something error ! Please check again !", Toast.LENGTH_SHORT).show();
            }
        }catch (Exception e){
            Toast.makeText(getApplicationContext(),"Please input full number on edit text !", Toast.LENGTH_SHORT).show();
        }
    }

    public void fact (View view){
        try{
            Integer n1 = Integer.parseInt(num1.getText().toString().trim());

            try {
                double r = cal.factorialNumber(n1);
                result.setText(String.valueOf(r));
            }catch (Exception e){
                Toast.makeText(getApplicationContext(),"Input values have something error ! Please check again !", Toast.LENGTH_SHORT).show();
            }
        }catch (Exception e){
            Toast.makeText(getApplicationContext(),"Please input full number on edit text !", Toast.LENGTH_SHORT).show();
        }
    }

    public void log (View view){
        try{
            Integer n1 = Integer.parseInt(num1.getText().toString().trim());
            Integer n2 = Integer.parseInt(num2.getText().toString().trim());

            try {
                double r = cal.logarithmNumber(n1, n2);
                result.setText(String.valueOf(r));
            }catch (Exception e){
                Toast.makeText(getApplicationContext(),"Input values have something error ! Please check again !", Toast.LENGTH_SHORT).show();
            }
        }catch (Exception e){
            Toast.makeText(getApplicationContext(),"Please input full number on edit text !", Toast.LENGTH_SHORT).show();
        }
    }
}