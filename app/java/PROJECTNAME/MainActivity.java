package com.example.soratunagu;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Patterns;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    
    // Import webview
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get id
        webView = findViewById(R.id.web_view);

        // Add setting
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        // Zoom function
        webSettings.setBuiltInZoomControls(true);
        webSettings.setDisplayZoomControls(false);

        // Add client
        webView.setWebViewClient(new MyWebViewClient());
        webView.setWebChromeClient(new WebChromeClient(){
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                super.onProgressChanged(view, newProgress);
            }
        });

        // Load URL
        loadMyUrl("ii7get.com");

    }

    void loadMyUrl(String url){
        boolean matchUrl = Patterns.WEB_URL.matcher(url).matches();
        if(matchUrl){
            webView.loadUrl("ii7get.com");
        }else{
            webView.loadUrl("ii7get.com");
        }
    }

    class MyWebViewClient extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            // return super.shouldOverrideUrlLoading(view, request);
            return false;
        }

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
        }
    }

}
