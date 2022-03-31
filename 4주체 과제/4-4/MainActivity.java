package com.example.cbnu_androidopensourceproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView text1, text2;
    Switch switchAgree;
    RadioGroup rGroup1;
    RadioButton rdoQ, rdoR, rdoS;
    ImageView imgAndroid;
    Button btnExit, btnRetry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("안드로이드 사진 보기");

        text1 = (TextView) findViewById(R.id.Text1);
        switchAgree = (Switch) findViewById(R.id.SwitchAgree);

        text2 = (TextView) findViewById(R.id.Text2);
        rGroup1 = (RadioGroup) findViewById(R.id.Rgroup1);
        rdoQ = (RadioButton) findViewById(R.id.RdoQ);
        rdoR = (RadioButton) findViewById(R.id.RdoR);
        rdoS = (RadioButton) findViewById(R.id.RdoS);

        btnExit = (Button) findViewById(R.id.BtnExit);
        btnRetry = (Button) findViewById(R.id.BtnRetry);
        imgAndroid = (ImageView) findViewById(R.id.ImgAndroid);

        btnExit.setVisibility(android.view.View.INVISIBLE);
        btnRetry.setVisibility(android.view.View.INVISIBLE);

        switchAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switchAgree.isChecked())  {
                    text2.setVisibility(android.view.View.VISIBLE);
                    rGroup1.setVisibility(android.view.View.VISIBLE);
                    btnExit.setVisibility(android.view.View.VISIBLE);
                    btnRetry.setVisibility(android.view.View.VISIBLE);
                    imgAndroid.setVisibility(android.view.View.VISIBLE);
                } else {
                    text2.setVisibility(android.view.View.INVISIBLE);
                    rGroup1.setVisibility(android.view.View.INVISIBLE);
                    btnExit.setVisibility(android.view.View.INVISIBLE);
                    btnRetry.setVisibility(android.view.View.INVISIBLE);
                    imgAndroid.setVisibility(android.view.View.INVISIBLE);
                }
            }
        });

        rdoQ.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                imgAndroid.setImageResource(R.drawable.android_q);
            }
        });

        rdoR.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                imgAndroid.setImageResource(R.drawable.android_r);
            }
        });

        rdoS.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                imgAndroid.setImageResource(R.drawable.android);
            }
        });

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnRetry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rGroup1.clearCheck();
            }
        });
    }
}