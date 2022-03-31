package com.example.cbnu_androidopensourceproject;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button upBtn, downBtn;
    ImageView image1, image2;
    HorizontalScrollView scrollView1, scrollView2;
    BitmapDrawable bitmapLandscape, bitmapNone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("실습 과제");

        scrollView1 = (HorizontalScrollView) findViewById(R.id.scrollView);
        scrollView2 = (HorizontalScrollView) findViewById(R.id.scrollView2);
        scrollView1.setHorizontalScrollBarEnabled(true);
        scrollView2.setHorizontalScrollBarEnabled(true);

        image1 = (ImageView) findViewById(R.id.imageView);
        bitmapLandscape = (BitmapDrawable) getResources().getDrawable(R.drawable.landscape);
        int bitmapWidth = bitmapLandscape.getIntrinsicWidth();
        int bitmapHeight = bitmapLandscape.getIntrinsicHeight();
        image1.setImageDrawable(bitmapLandscape);
        image1.getLayoutParams().width = bitmapWidth;
        image1.getLayoutParams().height = bitmapHeight;

        image2 = (ImageView) findViewById(R.id.imageView2);
        bitmapNone = (BitmapDrawable) getResources().getDrawable(R.drawable.none);
        bitmapWidth = bitmapNone.getIntrinsicWidth();
        bitmapHeight = bitmapNone.getIntrinsicHeight();
        image2.setImageDrawable(bitmapNone);
        image2.getLayoutParams().width = bitmapWidth;
        image2.getLayoutParams().height = bitmapHeight;

        upBtn = (Button) findViewById(R.id.button);
        downBtn = (Button) findViewById(R.id.button2);

        upBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                image1.setImageDrawable(bitmapLandscape);
                image2.setImageDrawable(bitmapNone);

                int bitmapWidth = bitmapLandscape.getIntrinsicWidth();
                int bitmapHeight = bitmapLandscape.getIntrinsicHeight();
                image2.getLayoutParams().width = bitmapWidth;
                image2.getLayoutParams().height = bitmapHeight;
            }
        });

        downBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                image2.setImageDrawable(bitmapLandscape);
                image1.setImageDrawable(bitmapNone);

                int bitmapWidth = bitmapLandscape.getIntrinsicWidth();
                int bitmapHeight = bitmapLandscape.getIntrinsicHeight();
                image2.getLayoutParams().width = bitmapWidth;
                image2.getLayoutParams().height = bitmapHeight;
            }
        });
    }
}