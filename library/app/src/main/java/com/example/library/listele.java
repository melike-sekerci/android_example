package com.example.library;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.List;

public class listele extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listele);
        Database db = new Database(getApplicationContext());
        List<Kullanici> kullanicilar = db.listele();
        final ArrayAdapter<Kullanici> adaptor;
        adaptor = new ArrayAdapter<Kullanici>(this,android.R.layout.simple_expandable_list_item_1, kullanicilar);
        setListAdapter(adaptor);
    }

}
