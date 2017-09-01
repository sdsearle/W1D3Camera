package com.example.admin.w1d3camera;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Camera;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraManager;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import static android.R.attr.data;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_IMAGE_CAPTURE = 1;

    ImageView mypic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mypic = (ImageView) findViewById(R.id.mypic);
    }

    public void takePic(View view) {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }

    }

    public void toSliderActivity(View view) {
        Intent intent = new Intent(this,SliderActivity.class);
        startActivity(intent);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");

            mypic.setImageBitmap(imageBitmap);
        }
    }

}
