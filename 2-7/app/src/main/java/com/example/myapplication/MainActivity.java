package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;
import android.content.Intent;
import android.net.Uri;

public class MainActivity extends AppCompatActivity {
    Button button1;
    Button button2;
    RadioButton radioButton1;
    RadioButton radioButton2;
    Boolean radioButton1Checked;
    Boolean radioButton2Checked;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioButton1Checked=false;
        radioButton2Checked=false;

        button1=(Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "버튼을 눌렀어요",
                        Toast.LENGTH_SHORT).show();
            }
        });

        button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.naver.com"));
                startActivity(intent);
            }
        });

        imageView=(ImageView)findViewById(R.id.imageView);
        radioButton1=(RadioButton) findViewById(R.id.radioButton1);
        radioButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                radioButton1Checked=!radioButton1Checked;
                radioButton1.setChecked(radioButton1Checked);
                if(radioButton1Checked)
                    imageView.setImageResource(R.drawable.seulgi_2);
            }
        });

        radioButton2=(RadioButton) findViewById(R.id.radioButton2);
        radioButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                radioButton2Checked=!radioButton2Checked;
                radioButton2.setChecked(radioButton2Checked);
                if(radioButton2Checked)
                    imageView.setImageResource(R.drawable.seulgi_1);
            }
        });
    }
}