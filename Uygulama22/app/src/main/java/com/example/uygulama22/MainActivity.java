package com.example.uygulama22;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView metin_alani;
    Button buton1;

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        metin_alani=(TextView) findViewById(R.id.txt1);
        buton1=(Button) findViewById(R.id.btn1);
        buton1.setOnClickListener(new View.OnclickListener(){
            @Override
            public void Onclick(View v){
                metin_alani.setTextSize(43);
                metin_alani.setText("Bilgisayar Bölümü");
                metin_alani.setBackgroundColor(Color.YELLOW);
                metin_alani.setTextColor(Color.BLUE);



        });


    }
}
