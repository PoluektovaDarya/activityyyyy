package com.example.activityyyyy.;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "StartActivity";

    private Integer count = 46;

    // Вызывается при создании Активности
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Инициализация
        Log.d(TAG, "onCreate");
        Toast.makeText(this, "onCreate()", Toast.LENGTH_LONG).show();
    }

    // Вызывается, когда Активность стала видимой
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
        resetUI();
        Toast.makeText(this, "onStart()", Toast.LENGTH_LONG).show();
    }

    //Начало видимого состояния.

    @Override
    protected void onResume() {
        super.onResume();
        // Восстановление
        Log.d(TAG, "onResume");
        Toast.makeText(this, "onResume()", Toast.LENGTH_LONG).show();
    }

    // Вызывается перед выходом из активного состояния
    @Override
    protected void onPause() {
        // «Заморозить» обновления UI, потоки или «трудоемкие» процессы
        super.onPause();
        Log.d(TAG, "onPause");
        Toast.makeText(this, "onPause()", Toast.LENGTH_LONG).show();
    }

    // Вызывается перед выходом из видимого состояния
    @Override
    protected void onStop() {
        // «Заморозить» и сохранить
        super.onStop();
        Log.d(TAG, "onStop");
        Toast.makeText(this, "onStop()", Toast.LENGTH_LONG).show();
    }

    // Вызывается перед тем, как Активность снова становится видимой
    @Override
    protected void onRestart() {
        super.onRestart();
        // Восстановить
        Log.d(TAG, "onRestart");
        Toast.makeText(this, "onRestart()", Toast.LENGTH_LONG).show();
    }

    // Вызывается перед уничтожением активности
    @Override
    protected void onDestroy() {
        // Освободить
        super.onDestroy();
        Log.d(TAG, "onDestroy");
        Toast.makeText(this, "onDestroy()", Toast.LENGTH_LONG).show();
    }

    // Вызывается перед выходом из активного состояния,
    // позволяя сохранить состояние в объекте savedInstanceState
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("count", count);
        Log.d(TAG, "onSaveInstanceState");
        Toast.makeText(this, "onSaveInstanceState()", Toast.LENGTH_LONG).show();
    }

    // Вызывается после завершения метода onCreate
    // Используется для восстановления состояния UI
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null &&
                savedInstanceState.containsKey("count")) {
            count = savedInstanceState.getInt("count");
        }
        Log.d(TAG, "onRestoreInstanceState");
        Toast.makeText(this, "onRestoreInstanceState()", Toast.LENGTH_LONG).show();
    }

    private void resetUI() {
        ((TextView) findViewById(R.id.txt_counter)).setText(count.toString());
        Log.d(TAG, "resetUI");
    }

}