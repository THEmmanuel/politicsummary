package com.politicsummary.android.politicsummary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView politicsummary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        politicsummary = (WebView) findViewById(R.id.WebView);
        politicsummary.setWebViewClient(new WebViewClient());
        politicsummary.loadUrl("http://politicsummary.com");
        WebSettings webSettings = politicsummary.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if (politicsummary.canGoBack()){
            politicsummary.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}