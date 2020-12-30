package com.example.libray;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class singUp extends AppCompatActivity {
    TextView textSingUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);
        tanimla();
        tikla();
    }

    public void tanimla() {
        textSingUp = findViewById(R.id.textSingUp);
    }

    public void gecisYap() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void tikla() {
        textSingUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gecisYap();
            }
        });
    }

}
