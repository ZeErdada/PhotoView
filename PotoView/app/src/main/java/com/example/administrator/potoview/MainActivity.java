package com.example.administrator.potoview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import uk.co.senab.photoview.PhotoView;
import uk.co.senab.photoview.PhotoViewAttacher;

/**
 * 1、复制photoView 到libs下，添加
 * 2、布局清单文件中，添加phothoView控件,src加载一张图片就可以实现放大缩小
 * 3、photoView设置点击事件，实现单击退出Activity
 */
public class MainActivity extends AppCompatActivity {

    private PhotoView pv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pv = (PhotoView) findViewById(R.id.pv);
        pv.setOnPhotoTapListener(new PhotoViewAttacher.OnPhotoTapListener() {
            @Override
            public void onPhotoTap(View view, float v, float v1) {
               finish();
            }
        });
    }
}
