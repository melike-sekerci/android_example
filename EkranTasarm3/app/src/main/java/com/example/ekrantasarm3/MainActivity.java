package com.example.ekrantasarm3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText txtInput=(EditText) this.findViewById(R.id.txtInput);
        final TextView txtNameSurname=(TextView) this.findViewById(R.id.txtNameSurname);
        Button btnSend=(Button) this.findViewById(R.id.btnSend);

        btnSend.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           String nameSurname=txtInput.getText().toString();
                                           txtNameSurname.setText(nameSurname);
                                           Toast.makeText(MainActivity.this,text:"Ad Soyad Gönderildi!",Toast.LENGTH_LONG).show();
                                       }
                                   }

        );
    }
}
