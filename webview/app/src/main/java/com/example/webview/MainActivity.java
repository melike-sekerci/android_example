package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
     WebView wb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla();
        goster();
    }
    public void tanimla()
    {
        wb=findViewById(R.id.webView);
    }
    public void goster(){
        wb.getSettings().setJavaScriptEnabled(true);
        wb.loadUrl("https://www.google.com.tr");
    }
    public void gosterhtml(){
        String htmlKod="<html><head>WebView HTML ORNEGI</head><body><h1>HTML ORNEGI</h1></body></html>";
        wb.loadData(htmlKod,"text/html","UTF-8");
    }
}
