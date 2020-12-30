package com.example.toastmesaj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanımla();
        tıkla();


    }
    private void tanımla(){
        img=findViewById(R.id.image);
        btn=findViewById(R.id.btn);

    }
    private void tıkla(){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int rnd=(int)(Math.random()*5+1);
                System.out.println(""+rnd);
                degistir(rnd);
                Toast.makeText(getApplicationContext(),String.valueOf(rnd)+" numaralı resim gösteriliyor.",Toast.LENGTH_LONG).show();
            }
        });
    }
    public void degistir(int sayi){
        if(sayi==1){
            img.setImageResource(R.drawable.bir);
        }
        else if(sayi==2){
            img.setImageResource(R.drawable.iki);
        }
        else if(sayi==3){
            img.setImageResource(R.drawable.uc);
        }
        else if(sayi==4){
            img.setImageResource(R.drawable.dort);
        }
        else {
            img.setImageResource(R.drawable.bes);
        }
    }
}
