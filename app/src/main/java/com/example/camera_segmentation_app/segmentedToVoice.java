package com.example.camera_segmentation_app;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class segmentedToVoice {

    public int segmentedToVoice(Bitmap mSegmImage) {
        Bitmap mBitmap = BitmapFactory.decodeFile("TestImg.png");
        // colour for floor = (30, 208, 85)

        int img_width;
        int img_height;
        img_width = mBitmap.getWidth();
        img_height = mBitmap.getHeight();

        System.out.println(img_width + img_height);




        return 0;
    }

}
