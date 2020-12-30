package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AbsListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<mesaj> list;
    Recyclerview recyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tanimla() {

    }

    public void listeDoldur() {
        list = new ArrayList<>();
        mesaj m1 = new mesaj("melike", "naber", R.drawable.kadin1);
        mesaj m2 = new mesaj("memetcan", "nasılsın", R.drawable.adam1);
        mesaj m3 = new mesaj("asli", "merhaba", R.drawable.kadin2);
        list.add(m1);
        list.add(m2);
        list.add(m3);
    }
}
