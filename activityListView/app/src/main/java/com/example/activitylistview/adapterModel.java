package com.example.activitylistview;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class adapterModel extends BaseAdapter {
    List<model> list;
    Context context;//layoutu tamamalamak için
    Activity activity;

    public adapterModel(List<model> list, Context context,Activity activity) {
        this.list = list;
        this.context = context;
        this.activity=activity;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = LayoutInflater.from(context).inflate(R.layout.layout, parent, false);
        TextView isim = convertView.findViewById(R.id.isim);
        TextView soyisim = convertView.findViewById(R.id.soyisim);
        TextView telNo = convertView.findViewById(R.id.telNo);
        LinearLayout linearLayout = convertView.findViewById(R.id.anaLayout);

        final String isimS = list.get(position).getIsim();
        final String soyisimS = list.get(position).getSoyisim();
        final String telNos = list.get(position).getNumara();

        isim.setText(isimS);
        soyisim.setText(soyisimS);
        telNo.setText(telNos);

        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Main2Activity.class);
                intent.putExtra("isim", isimS);
                intent.putExtra("soy", soyisimS);
                intent.putExtra("tel", telNos);

                activity.startActivity(intent);
            }
        });
        return convertView;
    }
}

