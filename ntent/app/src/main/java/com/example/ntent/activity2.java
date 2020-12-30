package com.example.ntent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class activity2 extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);
        tanimla();
        tikla();
    }
    public void tanimla(){
        textView=findViewById(R.id.text);
    }
    public void gecisYap(){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    public void tikla(){
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gecisYap();
            }
        });

    }
}
