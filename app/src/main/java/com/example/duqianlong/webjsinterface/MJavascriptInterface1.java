package com.example.duqianlong.webjsinterface;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

/**
 * Created by Duqianlong on 2019/10/10.
 */

public class MJavascriptInterface1 {

    private Context context;

    public MJavascriptInterface1(Context context) {
        // TODO Auto-generated constructor stub
        this.context = context;
    }
    @JavascriptInterface
    public void setcamera(){
        Toast.makeText(context, "开始拍照", Toast.LENGTH_SHORT).show();
    }
    @JavascriptInterface
    public void setgallery(){
        Toast.makeText(context, "开始调图库", Toast.LENGTH_SHORT).show();
    }
}
