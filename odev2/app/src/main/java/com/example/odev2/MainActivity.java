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
    TextView TextView;
    EditText editText;
    Button buton;
    Spinner spinner;
    LinearLayout line;
    public static final String RENKINT = "renkint";
    public String text;
    public static final String SHARED_PREF = "shared";
    public static final String TEXT = "text";
    public int renk;
    boolean girilen = true;
    public int renkInt;
    String color[] = {"CAMGÖBEGİ", "YEŞİL", "KIRMIZI"};
    public String getString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
        buton = findViewById(R.id.button);
        spinner = findViewById(R.id.spincolor);
        line = findViewById(R.id.line1);

        tikla();

        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREF, MODE_PRIVATE);
        text = sharedPreferences.getString(TEXT, "");
        TextView.setText(text);
        renk = sharedPreferences.getInt(RENKINT, renk);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, color);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (((renk == 0 || renk == 1 || renk == 2) && girilen == false)) {
                    if (position == 0) {
                        line.setBackgroundColor(Color.CYAN);
                        renkInt = 0;
                    } else if (position == 1) {
                        line.setBackgroundColor(Color.GREEN);
                        renkInt = 1;
                    } else if (position == 2) {
                        line.setBackgroundColor(Color.RED);
                        renkInt = 2;
                    }
                } else {
                    if (renk == 0) {
                        line.setBackgroundColor(Color.CYAN);
                    } else if (renk == 1) {
                        line.setBackgroundColor(Color.GREEN);
                    } else if (renk == 2) {
                        line.setBackgroundColor(Color.RED);
                    }
                    girilen = false;
                }
                SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREF, MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putInt(RENKINT, renkInt);
                editor.apply();
                Toast.makeText(getApplicationContext(), " Renk kaydedildi", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }

    public void tikla() {
        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getString = editText.getText().toString();
                TextView.setText(getString);
                SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREF, MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(TEXT, TextView.getText().toString());
                editor.apply();
                Toast.makeText(getApplicationContext(), " Text  kaydedildi", Toast.LENGTH_LONG).show();
            }
        });
    }
}
