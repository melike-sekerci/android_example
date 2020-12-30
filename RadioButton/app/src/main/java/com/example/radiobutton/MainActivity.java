package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton btn1;
    RadioButton btn2;
    RadioButton btn3;
    RadioButton btn4;
    RadioButton btn5;
    ImageView imgage;
    RadioGroup radioGroup;
    Button buton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanımla();
        idAl();

    }
    public void tanımla(){
        btn1=findViewById(R.id.btnbir);
        btn2=findViewById(R.id.btniki);
        btn3=findViewById(R.id.btnuc);
        btn4=findViewById(R.id.btndort);
        btn5=findViewById(R.id.btnbes);
        imgage=findViewById(R.id.img);
        radioGroup =findViewById(R.id.radioGroup);
        buton=findViewById(R.id.button);
    }
    public void idAl(){
        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int gelenid=radioGroup.getCheckedRadioButtonId();
                resimdegis(gelenid);
            }
        });

    }
    public void resimdegis(int id){
        if(id==R.id.btnbir){
            imgage.setImageResource(R.drawable.bir);
            Toast.makeText(getApplicationContext(),"resim 1",Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.btniki){
            imgage.setImageResource(R.drawable.iki);
            Toast.makeText(getApplicationContext(),"resim 2",Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.btnuc){
            imgage.setImageResource(R.drawable.uc);
            Toast.makeText(getApplicationContext(),"resim 3",Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.btndort){
            imgage.setImageResource(R.drawable.dort);
            Toast.makeText(getApplicationContext(),"resim 4",Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.btnbes){
            imgage.setImageResource(R.drawable.bes);
            Toast.makeText(getApplicationContext(),"resim 5",Toast.LENGTH_SHORT).show();
        }
    }

    public void tıkla(){
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgage.setImageResource(R.drawable.bir);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 imgage.setImageResource(R.drawable.iki);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgage.setImageResource(R.drawable.uc);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgage.setImageResource(R.drawable.dort);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgage.setImageResource(R.drawable.bes);
            }
        });

    }



}
