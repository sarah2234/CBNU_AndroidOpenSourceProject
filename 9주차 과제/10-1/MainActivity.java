package com.example.project10_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    Button btnNewActivity;
    RadioGroup radioGroup;
    RadioButton secondbtn;
    RadioButton thirdbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNewActivity=(Button) findViewById(R.id.btnNewActivity);
        radioGroup=findViewById(R.id.radioGroup);
        secondbtn=findViewById(R.id.secondButton);
        thirdbtn=findViewById(R.id.thirdButton);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.secondButton:
                        btnNewActivity.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent=new Intent(getApplicationContext(), second.class);
                                startActivity(intent);
                            }
                        });
                        break;
                    case R.id.thirdButton:
                        btnNewActivity.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent=new Intent(getApplicationContext(), ThirdActivity.class);
                                startActivity(intent);
                            }
                        });
                }
            }
        });

    }
}