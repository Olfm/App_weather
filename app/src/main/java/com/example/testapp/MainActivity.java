package com.example.testapp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.testapp.R.layout.activity_main;

public class MainActivity extends Activity implements View.OnClickListener {

    TextView tvWeather;
    Button btnMoscow;
    Button btnDaily;
    Button btnRoma;
    Button btnSingapore;

    private static final String TAG = "myLogs";

    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);
        Log.d(TAG, "найдем View-элементы");
        tvWeather = findViewById(R.id.tvWeather);
        btnMoscow = findViewById(R.id.btnMoscow);
        btnDaily = findViewById(R.id.btnDaily);
        btnRoma = findViewById(R.id.btnRoma);
        btnSingapore = findViewById(R.id.btnSingapore);

        Log.d(TAG, "присваиваем обработчик кнопкам");
        btnMoscow.setOnClickListener(this);
        btnDaily.setOnClickListener(this);
        btnRoma.setOnClickListener(this);
        btnSingapore.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Log.d(TAG, "по id определяем кнопку, вызвавшую этот обработчик");
        switch (v.getId()) {
            case R.id.btnMoscow:
                Log.d(TAG, "кнопка  Москва");
                btnMoscow.setText("15 градусов");
                break;
            case R.id.btnDaily:
                Log.d(TAG, "кнопка  Дейли");
                btnDaily.setText("27 градусов");
                break;
            case R.id.btnRoma:
                Log.d(TAG, "кнопка  Рим");
                btnRoma.setText("21 градус");
                break;
            case R.id.btnSingapore:
                Log.d(TAG, "кнопка  Сингапур");
                btnSingapore.setText("17 градусов");
                break;
        }

    }
}

