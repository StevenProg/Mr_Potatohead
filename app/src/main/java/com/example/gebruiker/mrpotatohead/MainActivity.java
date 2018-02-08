package com.example.gebruiker.mrpotatohead;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ... = savedInstanceState.getInt("name");
        ... = savedInstanceState.getString("name");
    }

    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState); // always call super
        outState.putInt("name", value);
        outState.putString("name", value);
    }


    public void checkClicked(View v) {
        CheckBox checkbox = (CheckBox) v;
        switch (v.getId()) {
            case R.id.armsBox:

                if (checkbox.isChecked()) {
                    ImageView image = (ImageView) findViewById(R.id.armsView);
                    image.setVisibility(View.VISIBLE);
                } else {
                    ImageView image = (ImageView) findViewById(R.id.armsView);
                    image.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.earsBox:
                if (checkbox.isChecked()) {
                    ImageView image = (ImageView) findViewById(R.id.earsView);
                    image.setVisibility(View.VISIBLE);
                } else {
                    ImageView image = (ImageView) findViewById(R.id.earsView);
                    image.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.eyesBox:
                if (checkbox.isChecked()) {
                    ImageView image = (ImageView) findViewById(R.id.eyesView);
                    image.setVisibility(View.VISIBLE);
                } else {
                    ImageView image = (ImageView) findViewById(R.id.eyesView);
                    image.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.noseBox:
                if (checkbox.isChecked()) {
                    ImageView image = (ImageView) findViewById(R.id.noseView);
                    image.setVisibility(View.VISIBLE);
                } else {
                    ImageView image = (ImageView) findViewById(R.id.noseView);
                    image.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.mustacheBox:
                if (checkbox.isChecked()) {
                    ImageView image = (ImageView) findViewById(R.id.mustacheView);
                    image.setVisibility(View.VISIBLE);
                } else {
                    ImageView image = (ImageView) findViewById(R.id.mustacheView);
                    image.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.shoesBox:
                if (checkbox.isChecked()) {
                    ImageView image = (ImageView) findViewById(R.id.shoesView);
                    image.setVisibility(View.VISIBLE);
                } else {
                    ImageView image = (ImageView) findViewById(R.id.shoesView);
                    image.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.hatBox:
                if (checkbox.isChecked()) {
                    ImageView image = (ImageView) findViewById(R.id.hatView);
                    image.setVisibility(View.VISIBLE);
                } else {
                    ImageView image = (ImageView) findViewById(R.id.hatView);
                    image.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.mouthBox:
                if (checkbox.isChecked()) {
                    ImageView image = (ImageView) findViewById(R.id.mouthView);
                    image.setVisibility(View.VISIBLE);
                } else {
                    ImageView image = (ImageView) findViewById(R.id.mouthView);
                    image.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.eyebrowsBox:
                if (checkbox.isChecked()) {
                    ImageView image = (ImageView) findViewById(R.id.eyebrowsView);
                    image.setVisibility(View.VISIBLE);
                } else {
                    ImageView image = (ImageView) findViewById(R.id.eyebrowsView);
                    image.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.glassesBox:
                if (checkbox.isChecked()) {
                    ImageView image = (ImageView) findViewById(R.id.glassesView);
                    image.setVisibility(View.VISIBLE);
                } else {
                    ImageView image = (ImageView) findViewById(R.id.glassesView);
                    image.setVisibility(View.INVISIBLE);
                }
                break;

        }
    }
}


