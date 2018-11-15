package com.example.jinhui.testfresco;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.facebook.drawee.view.SimpleDraweeView;

/**
 * https://www.cnblogs.com/liushilin/p/5659301.html
 *
 * https://www.fresco-cn.org/docs/index.html 中文网
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Uri uri = Uri.parse("https://avatars0.githubusercontent.com/u/24784194?s=460&v=4");
        SimpleDraweeView draweeView = (SimpleDraweeView) findViewById(R.id.my_image_view);
        draweeView.setImageURI(uri);
    }
}
