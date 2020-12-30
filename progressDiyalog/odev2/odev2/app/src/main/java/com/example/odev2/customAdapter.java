package com.example.odev2;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

import java.util.List;

public class customAdapter extends ArrayAdapter<SpinData> {
    private Context context;
    private List<SpinData> spinData;

    public customAdapter(@NonNull Context context, int resource, List<SpinData> spinData) {
        super(context, resource, spinData);
        this.context = context;
        this.spinData = spinData;

    }

    @RequiresApi(api = Build.VERSION_CODES.O_MR1)
    private View mCustomSpinner(int position, @NonNull View myView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View customView = layoutInflater.inflate(R.layout.spinneritem, parent, false);
        LinearLayout linearLayout = customView.findViewById(R.id.lien2);

        return customView;
    }
}
