package com.example.cbnu_androidopensourceproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edit1, edit2;
    Button btnAdd, btnSub, btnMul, btnDiv, btnRem;
    TextView textResult;
    String num1, num2;
    Double result;

    Button[] numButtons;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기");

        edit1 = (EditText) findViewById(R.id.Edit1);
        edit2 = (EditText) findViewById(R.id.Edit2);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnMul = (Button) findViewById(R.id.btnMul);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnRem = (Button) findViewById(R.id.btnRem);
        textResult = (TextView) findViewById(R.id.textResult);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    result = Double.parseDouble(num1) + Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                } catch(NumberFormatException e) {
                    textResult.setText("유효하지 않은 값입니다.");
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    result = Double.parseDouble(num1) - Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                } catch(NumberFormatException e) {
                    textResult.setText("유효하지 않은 값입니다.");
                }
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    result = Double.parseDouble(num1) * Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                } catch(NumberFormatException e) {
                    textResult.setText("유효하지 않은 값입니다.");
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    if(num2.equals("0"))
                        Toast.makeText(getApplicationContext(), "0으로 나눌 수 없습니다.",
                                Toast.LENGTH_SHORT).show();
                    else {
                        result = Double.parseDouble(num1) / Double.parseDouble(num2);
                        textResult.setText("계산 결과 : " + result.toString());
                    }
                } catch(NumberFormatException e) {
                    textResult.setText("유효하지 않은 값입니다.");
                }
            }
        });

        btnRem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    Integer result = Integer.parseInt(num1) % Integer.parseInt(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                } catch (NumberFormatException e) {
                    textResult.setText("유효하지 않은 값입니다.");
                }

            }
        });
    }
}