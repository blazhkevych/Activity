package com.example.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // 7 активностей жизненного цикла
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });*/
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    public void startFirstActivity(View view) {
        // Создаем объект Intent для вызова новой активности
        Intent intent = new Intent(this, FirstActivity.class); // Intent - это объект, который предоставляет доступ к другим компонентам приложения. И переводится как намерение.
        // Добавляем параметры в Intent
        intent.putExtra("key_1", "FirstActivity");
        // запуск activity
        startActivity(intent);
    }

    public void startSecondActivity(View view) {
        // Создаем объект Intent для вызова новой активности
        Intent intent = new Intent(this, SecondActivity.class); // Intent - это объект, который предоставляет доступ к другим компонентам приложения. И переводится как намерение.
        // Добавляем параметры в Intent
        intent.putExtra("key_2", "SecondActivity");
        // запуск activity
        startActivity(intent);
    }
}