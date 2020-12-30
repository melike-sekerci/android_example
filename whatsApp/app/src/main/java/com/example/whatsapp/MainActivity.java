package com.example.whatsapp;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.widget.ListView;

        import java.util.ArrayList;
        import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    List<mesajModel> liste;
    mesajAdapter adp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla();
        listeDoldur();
    }
    public void tanimla(){
        listView=findViewById(R.id.listView);
    }
    public void listeDoldur(){
         liste=new ArrayList<>();
         mesajModel m1=new mesajModel("naber","asli",R.drawable.kadin1);
        mesajModel m2=new mesajModel("naber","memetcan",R.drawable.adam1);
        mesajModel m3=new mesajModel("naber","esra",R.drawable.kadin2);
        mesajModel m4=new mesajModel("naber","melike",R.drawable.kadin3);
        mesajModel m5=new mesajModel("naber","hikmet",R.drawable.adam2);
        mesajModel m6=new mesajModel("naber","halil",R.drawable.adam3);
        liste.add(m1);
        liste.add(m2);
        liste.add(m3);
        liste.add(m4);
        liste.add(m5);
        liste.add(m6);
        adp=new mesajAdapter(liste,this);
        listView.setAdapter(adp);

    }
}
