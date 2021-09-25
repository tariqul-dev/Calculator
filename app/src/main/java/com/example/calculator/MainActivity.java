package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textViewFirstNumber;
    private  TextView textViewSecondNumber;
    private TextView textViewOperator;
    private TextView textViewResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewFirstNumber = findViewById(R.id.textViewFirstNumber);
        textViewSecondNumber = findViewById(R.id.textViewSecondNumber);
        textViewOperator = findViewById(R.id.textViewOperator);
        textViewResult = findViewById(R.id.textViewResult);


        findViewById(R.id.buttonOne).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewSecondNumber.setText(textViewSecondNumber.getText().toString() + '1');
            }
        });
        findViewById(R.id.buttonTwo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewSecondNumber.setText(textViewSecondNumber.getText().toString() + '2');
            }
        });

        findViewById(R.id.buttonThree).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewSecondNumber.setText(textViewSecondNumber.getText().toString() + '3');
            }
        });

        findViewById(R.id.buttonFour).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewSecondNumber.setText(textViewSecondNumber.getText().toString() + '4');
            }
        });

        findViewById(R.id.buttonFive).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewSecondNumber.setText(textViewSecondNumber.getText().toString() + '5');
            }
        });

        findViewById(R.id.buttonSix).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewSecondNumber.setText(textViewSecondNumber.getText().toString() + '6');
            }
        });

        findViewById(R.id.buttonSeven).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewSecondNumber.setText(textViewSecondNumber.getText().toString() + '7');
            }
        });

        findViewById(R.id.buttonEight).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewSecondNumber.setText(textViewSecondNumber.getText().toString() + '8');
            }
        });

        findViewById(R.id.buttonNine).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewSecondNumber.setText(textViewSecondNumber.getText().toString() + '9');
            }
        });

        findViewById(R.id.buttonZero).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewSecondNumber.setText(textViewSecondNumber.getText().toString() + '0');
            }
        });

        findViewById(R.id.buttonAdd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exchangeValue();
                textViewOperator.setText("+");

            }
        });

        findViewById(R.id.buttonSub).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exchangeValue();
                textViewOperator.setText("-");

            }
        });

        findViewById(R.id.buttonDiv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exchangeValue();
                textViewOperator.setText("/");

            }
        });

        findViewById(R.id.buttonMult).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exchangeValue();
                textViewOperator.setText("*");

            }
        });

        findViewById(R.id.buttonCancel).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewFirstNumber.setText("");
                textViewSecondNumber.setText("");
                textViewOperator.setText("");
                textViewResult.setText("");
            }
        });

        findViewById(R.id.buttonResult).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textViewFirstNumber.getText().toString().length() !=0 && textViewSecondNumber.getText().toString().length() !=0){
                    int x = Integer.parseInt(textViewFirstNumber.getText().toString());
                    int y = Integer.parseInt(textViewSecondNumber.getText().toString());
                    String operator = textViewOperator.getText().toString();
                    int result = 0;

                    switch (operator){
                        case "+":
                            result = x + y;
                            break;
                        case "-":
                            result = x - y;
                            break;
                        case "/":
                            try{
                               result = x / y;

                            }catch (ArithmeticException e){
                                Toast.makeText(getApplicationContext(), "Divide by zero exception", Toast.LENGTH_SHORT).show();
                            }
                            break;
                        case "*":
                            result = x * y;
                            break;
                        default: result = 0;
                        break;
                    }

                    textViewResult.setText(" =  " + String.valueOf(result));


                }
            }
        });
    }


    public void exchangeValue(){
        textViewFirstNumber.setText(textViewSecondNumber.getText().toString());
        textViewSecondNumber.setText("");
    }
}