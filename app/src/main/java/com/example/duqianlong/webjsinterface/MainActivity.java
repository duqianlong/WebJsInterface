package com.example.duqianlong.webjsinterface;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.webkit.WebView;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {
    private WebView mYweb;
    private Button mbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }


    private void initView() {
        mYweb = findViewById(R.id.mWeb);
        mYweb.getSettings().setJavaScriptEnabled(true);
        mYweb.addJavascriptInterface(new MJavascriptInterface1(getApplicationContext()), "camera");
        mYweb.loadUrl("file:///android_asset/button.html");


        /**
         * 给前端传值
         * */
        mbtn=findViewById(R.id.mbtn);
        mbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s="https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1570704614207&di=62d4b294565927ffff046716693ab0d6&imgtype=0&src=http%3A%2F%2Fimg.mp.itc.cn%2Fupload%2F20160415%2F59cca1073eaa49788e349c67e4a9c37e.jpg";
                        mYweb.loadUrl("javascript:testParams('"+s+"')");

            }
        });
    }


}
