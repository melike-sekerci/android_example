package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox phpchb;
    CheckBox javachb;
    CheckBox jschb;
    CheckBox csharpchb;
    CheckBox pyhtonchb;
    TextView yazi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla();
        mesajVer();
    }
    public void tanimla(){
        phpchb=findViewById(R.id.php);
        javachb=findViewById(R.id.java);
        jschb=findViewById(R.id.js);
        csharpchb=findViewById(R.id.cs);
        pyhtonchb=findViewById(R.id.python);
        yazi=findViewById(R.id.yazi);
    }
    public void mesajVer(){
        javachb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (javachb.isChecked()){
                    Toast.makeText(getApplicationContext(),javachb.getText()+" tıklandı.",Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(getApplicationContext(),javachb.getText()+" iptal edildi.",Toast.LENGTH_LONG).show();
                }
            }
        });
        phpchb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (phpchb.isChecked()){
                    Toast.makeText(getApplicationContext(),phpchb.getText()+" tıklandı.",Toast.LENGTH_LONG).show();

                }
                else{
                    Toast.makeText(getApplicationContext(),phpchb.getText()+" iptal edildi.",Toast.LENGTH_LONG).show();

                }
            }
        });
        jschb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(jschb.isChecked()){
                    Toast.makeText(getApplicationContext(),jschb.getText()+" tıklandı.",Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),jschb.getText()+" iptal edildi.",Toast.LENGTH_LONG).show();
                }
            }
        });
        csharpchb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (csharpchb.isChecked()){
                    Toast.makeText(getApplicationContext(),csharpchb.getText()+" tıklandı.",Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),csharpchb.getText()+" iptal edildi.",Toast.LENGTH_LONG).show();
                }
            }
        });
        pyhtonchb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pyhtonchb.isChecked()){
                    Toast.makeText(getApplicationContext(),pyhtonchb.getText()+" tıklandı.",Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),pyhtonchb.getText()+" iptal edildi.",Toast.LENGTH_LONG).show();
                }
            }
        });
    }

}
