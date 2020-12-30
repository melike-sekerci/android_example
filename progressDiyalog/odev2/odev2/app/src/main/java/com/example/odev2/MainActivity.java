package com.example.odev2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    EditText editText;
    Button button;
    Spinner spincolor;
    LinearLayout line1;
    String items[] = new String[]{"EFLATUN", "SARI", "KIRMIZI"};
    public String getString;
    public static final String SHARED_PREF = "shared";
    public static final String TEXT = "text";
    public static final String RENKTEXT = "renkint";
    public String text;
    public int renktext;
    boolean girdi=true;
    public int rnkText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getString = editText.getText().toString();
                textView.setText(getString);
                SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREF, MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(TEXT, textView.getText().toString());
                editor.apply();
                Toast.makeText(getApplicationContext(), " Text Veri kaydedildi", Toast.LENGTH_LONG).show();
            }
        });
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREF, MODE_PRIVATE);
        text = sharedPreferences.getString(TEXT, "");
        textView.setText(text);
        renktext = sharedPreferences.getInt(RENKTEXT,renktext);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        spincolor.setAdapter(adapter);
           spincolor.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
               @Override
               public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                    if((renktext==0||renktext==1||renktext==2)&&girdi==true){
                            if (renktext==0){
                                line1.setBackgroundColor(Color.MAGENTA);
                            }
                            else if(renktext==1){
                                line1.setBackgroundColor(Color.YELLOW);
                            }
                            else if( renktext==2){
                                line1.setBackgroundColor(Color.RED);
                            }
                        girdi=false;
                    }
                    else {
                        if (position == 0) {
                            line1.setBackgroundColor(Color.MAGENTA);
                            rnkText = 0;
                        } else if (position == 1) {
                            line1.setBackgroundColor(Color.YELLOW);
                            rnkText = 1;
                        } else if (position == 2) {
                            line1.setBackgroundColor(Color.RED);
                            rnkText = 2;
                        }
               }
                   SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREF, MODE_PRIVATE);
                   SharedPreferences.Editor editor = sharedPreferences.edit();
                   editor.putInt(RENKTEXT,rnkText);
                   editor.apply();
                   Toast.makeText(getApplicationContext(), " Renk Veri kaydedildi", Toast.LENGTH_LONG).show();
               }
               @Override
               public void onNothingSelected(AdapterView<?> parent) {

               }

           });

    }
    public void tanimla() {
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);
        spincolor = findViewById(R.id.spincolor);
        line1 = findViewById(R.id.line1);

    }




}
