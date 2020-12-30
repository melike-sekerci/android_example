package com.example.progressdiyalog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
// uygulama arka planda bir şeylerle meşgulken kullanıcıyı o sırada bilgi verir arka planda olan şeylerle
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
