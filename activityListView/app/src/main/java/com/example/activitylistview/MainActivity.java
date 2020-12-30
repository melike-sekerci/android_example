package com.example.activitylistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<model> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        modelOlustur();
    }

    public void modelOlustur() {
        list = new ArrayList<>();
        model m1 = new model("melike", "sekerci", "123");
        model m2 = new model("esra", "sekerci", "456");
        model m3 = new model("memetcan", "sekerci", "789");
        model m4 = new model("aslı", "sekerci", "741");
        list.add(m1);
        list.add(m2);
        list.add(m3);
        list.add(m4);
    }

}
