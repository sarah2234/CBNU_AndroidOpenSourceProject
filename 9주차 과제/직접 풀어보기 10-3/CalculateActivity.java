package com.cookandroid.doitmyself_10_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class CalculateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);

        Intent intent = getIntent();
        int num1 = intent.getIntExtra("Num1", 0);
        int num2 = intent.getIntExtra("Num2", 0);
        int result = 0;
        switch(intent.getIntExtra("operatorRadioButtonId", 0)) {
            case R.id.radioAdd:
                result = num1 + num2;
                break;
            case R.id.radioSub:
                result = num1 - num2;
                break;
            case R.id.radioMul:
                result = num1 * num2;
                break;
            case R.id.radioDiv:
                result = num1 / num2;
                break;
        }

        Intent outIntent = new Intent(getApplicationContext(), MainActivity.class);
        outIntent.putExtra("result", result);
        setResult(RESULT_OK, outIntent);
        finish();
    }
}