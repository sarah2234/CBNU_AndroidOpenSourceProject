package com.example.cbnu_androidopensourceproject;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText edit1, edit2;
    Button btnAdd, btnSub, btnMul, btnDiv;
    Button[] numButtons = new Button[10];
    Integer[] numBtnIDs = { R.id.BtnNum0, R.id.BtnNum1, R.id.BtnNum2, R.id.BtnNum3,
            R.id.BtnNum4, R.id.BtnNum5, R.id.BtnNum6, R.id.BtnNum7,
            R.id.BtnNum8, R.id.BtnNum9};
    TextView textResult;
    String num1, num2;
    Integer result;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setTitle("테이블 레이아웃 계산기");

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);

        LinearLayout baseLayout = new LinearLayout(this);
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(baseLayout, params);

        TextView name = new TextView(this);
        name.setText("2020039075 이승현");
        baseLayout.addView(name);

        EditText editText = new EditText(this);
        baseLayout.addView(editText);

        Button button = new Button(this);
        button.setBackgroundColor(Color.YELLOW);
        button.setText("버튼입니다.");
        baseLayout.addView(button);

        TextView text = new TextView(this);
        baseLayout.addView(text);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(editText.getText());
            }
        });
        }
    }
