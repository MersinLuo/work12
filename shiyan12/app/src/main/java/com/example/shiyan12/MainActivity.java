package com.example.shiyan12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button web_button = (Button) findViewById(R.id.web_button);
        web_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WebView webView = (WebView) findViewById(R.id.web_view);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl("https://www.gdpu.edu.cn");
            }
        });


    }
}