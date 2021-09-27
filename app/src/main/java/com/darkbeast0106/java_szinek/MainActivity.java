package com.darkbeast0106.java_szinek;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private RelativeLayout layout;
    private TextView textView;
    private Random rnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        layout.setOnClickListener(view -> {
            int red = rnd.nextInt(256);
            int green = rnd.nextInt(256);
            int blue = rnd.nextInt(256);
            layout.setBackgroundColor(Color.rgb(red,green,blue));
            textView.setText(getString(R.string.formatum,red,green,blue));
            if (red < 150 && green < 150 && blue < 150) {
                textView.setTextColor(Color.WHITE);
            } else {
                textView.setTextColor(Color.BLACK);
            }
        });
    }

    private void init(){
        layout = findViewById(R.id.layout);
        textView = findViewById(R.id.text_view);
        rnd = new Random();
    }
}