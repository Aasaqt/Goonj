package com.goonj.android.goonj1;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.webkit.WebSettings;
import android.webkit.WebView;

/**
 * Created by aasaqt on 7/1/15.
 */
public class RegisterActivity extends BaseActivity {
    WebView webView;

    public RegisterActivity(){}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.register);
        getActionBar().setTitle("Register");
        webView = (WebView) findViewById(R.id.webView);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.loadUrl("https://docs.google.com/forms/d/15s4jfZHBcspxvxGApppjzj6emvgdxyEN_SPbmuRxAPw/viewform?c=0&w=1");

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

}
