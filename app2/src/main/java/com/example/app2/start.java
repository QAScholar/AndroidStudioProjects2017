package com.example.app2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.util.Log;

public class start extends AppCompatActivity {

   public static final String EXTRA_MESSAGE = null;

   public static final String TAG="1st screen lifecycle";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);
        Log.d(TAG, "создание первого экрана");
        }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "запуск первого экрана");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "продолжение первого экрана");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "пауза первого экрана");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "остановка первого экрана");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "закрытие первого экрана");
    }
    public void sendMessage(View view) {
        Intent intent = new Intent(this, display_second_activity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    }

