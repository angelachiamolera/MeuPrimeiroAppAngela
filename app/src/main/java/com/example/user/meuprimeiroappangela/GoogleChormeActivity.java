package com.example.user.meuprimeiroappangela;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class GoogleChormeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_chorme_v2);

        WebView myWebView = (WebView) findViewById(R.id.wv_google);
        myWebView.loadUrl("https://www.google.com");
    }


}
