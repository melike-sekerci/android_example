package com.example.whatsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class mesajAdapter extends BaseAdapter {
    List<mesajModel> list;
    Context context; //olusturdugumuz layout tasarımına erismek icin

    public mesajAdapter(List<mesajModel> list, Context context) {
        this.list = list;
        this.context = context;
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
        View layout= LayoutInflater.from(context).inflate(R.layout.layout,parent,false);
        ImageView imgbir=layout.findViewById(R.id.kisiResmi);
        TextView kisiİsmibir=layout.findViewById(R.id.kisibir);
        TextView icerikBir=layout.findViewById(R.id.icerikbir);
        ImageView imgİki=layout.findViewById(R.id.kisiResmiiki);
        TextView kisiİsmiİki=layout.findViewById(R.id.kisiiki);
        TextView icerikiİki=layout.findViewById(R.id.icerikiki);
        ImageView imgUc=layout.findViewById(R.id.kisiResmiuc);
        TextView kisiİsmiUc=layout.findViewById(R.id.kisiuc);
        TextView icerikUc=layout.findViewById(R.id.icerikuc);
        ImageView imgDort=layout.findViewById(R.id.kisiResmidort);
        TextView kisiİsmiDort=layout.findViewById(R.id.kisidort);
        TextView icerikDort=layout.findViewById(R.id.icerikdort);
        ImageView imgbes=layout.findViewById(R.id.kisiResmibes);
        TextView kisiİsmibes=layout.findViewById(R.id.kisibes);
        TextView icerikBes=layout.findViewById(R.id.icerikbes);
        ImageView imgAlti=layout.findViewById(R.id.kisiResmialti);
        TextView kisiİsmiAlti=layout.findViewById(R.id.kisialti);
        TextView icerikAlti=layout.findViewById(R.id.icerikalti);
        imgbir.setImageResource(list.get(position).getResimid());
        kisiİsmibir.setText(list.get(position).getKisi());
        icerikBir.setText(list.get(position).getMesajİcerik());



        return layout;
    }
}
