package com.example.jinhui.testfresco;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;

/**
 *
 * https://www.fresco-cn.org/docs/index.html 中文网
 *
 * https://www.cnblogs.com/liushilin/p/5659301.html
 * drawee支持如下属性：
 * fresco:fadeDuration="300" // 淡入淡出的持续时间
 * fresco:actualImageScaleType="focusCrop"  // 实际图像的缩放类型
 * fresco:placeholderImage="@color/wait_color"  //占位图
 * fresco:placeholderImageScaleType="fitCenter" //占位图的缩放类型
 * fresco:failureImage="@drawable/error" //下载失败显示的图片
 * fresco:failureImageScaleType="centerInside" //失败图的缩放类型
 * fresco:retryImage="@drawable/retrying"
 * //图片加载失败时显示，提示用户点击重新加载，重复加载4次还是没有加载出来的时候才会显示failureImage的图片
 * fresco:retryImageScaleType="centerCrop" //重新加载的图片缩放类型
 * fresco:progressBarImage="@drawable/progress_bar" //进度条图片
 * fresco:progressBarImageScaleType="centerInside"
 * fresco:progressBarAutoRotateInterval="1000"
 * //进度图自动旋转间隔时间(单位：毫秒ms)
 * fresco:backgroundImage="@color/blue"
 * //背景图片，这里的背景图片首先被绘制
 * fresco:overlayImage="@drawable/watermark"
 * // 设置叠加图，在xml中只能设置一张叠加图片，如果需要多张图片的话，需要在java代码中设置哦
 * fresco:pressedStateOverlayImage="@color/red"
 * // 设置点击状态下的叠加图
 * fresco:roundAsCircle="false" //设置为圆形图
 * fresco:roundedCornerRadius="1dp" // 圆角半径
 * fresco:roundTopLeft="true" // 左上角是否为圆角
 * fresco:roundTopRight="false"
 * fresco:roundBottomLeft="false"
 * fresco:roundBottomRight="true"
 * fresco:roundWithOverlayColor="@color/corner_color"
 * fresco:roundingBorderWidth="2dp" //边框的宽度
 * fresco:roundingBorderColor="@color/border_color" //边框颜色
 *
 * 多图请求
 * 有时候需要加载很多图片，这个时候如果网络情况不是很好的情况下，一直显示占位图，体验也不是很好，我们可以先显示一个低分辨率的图片，等到大图加载完成之后，在显示真正的图片。
 * DraweeController controller = Fresco.newDraweeControllerBuilder()
 *     .setLowResImageRequest(ImageRequest.fromUri(lowResUri))
 *     .setImageRequest(ImageRequest.fromUri(highResUri))
 *     .setOldController(draweeView.getController())
 *     .build();
 * draweeView.setController(controller);
 */
public class MainActivity extends AppCompatActivity {

    SimpleDraweeView draweeView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Uri uri = Uri.parse("https://avatars0.githubusercontent.com/u/24784194?s=460&v=4");
        draweeView = (SimpleDraweeView) findViewById(R.id.my_image_view);
//        draweeView.setImageURI(uri);
        DraweeController controller = Fresco.newDraweeControllerBuilder()
                .setUri(uri)
                .setAutoPlayAnimations(true)
                .build();
        draweeView.setController(controller);
    }
}
