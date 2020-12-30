package com.example.ntent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
     Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla();
        tikla();
    }
    public void tanimla(){
        button=findViewById(R.id.button);
    }
    public void gecisYap(){
        Intent intent= new Intent(this,activity2.class);
        startActivity(intent);
    }
    public void tikla(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gecisYap();
            }
        });
    }

}
