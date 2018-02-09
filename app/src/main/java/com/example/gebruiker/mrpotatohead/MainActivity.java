package com.example.gebruiker.mrpotatohead;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    // creates ImageView objects for every layer of the image
    ImageView arms;
    ImageView hat;
    ImageView eyes;
    ImageView eyebrows;
    ImageView nose;
    ImageView glasses;
    ImageView shoes;
    ImageView mustache;
    ImageView mouth;
    ImageView ears;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // find the corresponding ID for every layer
        arms = findViewById(R.id.armsView);
        hat = findViewById(R.id.hatView);
        eyes = findViewById(R.id.eyesView);
        eyebrows = findViewById(R.id.eyebrowsView);
        nose = findViewById(R.id.noseView);
        glasses = findViewById(R.id.glassesView);
        shoes = findViewById(R.id.shoesView);
        mustache = findViewById(R.id.mustacheView);
        mouth = findViewById(R.id.mouthView);
        ears = findViewById(R.id.earsView);

        // if changes have been made in the app and then is switched to landscape mode for example
        // get the saved state for every layer
        if (savedInstanceState != null) {
            arms.setVisibility(savedInstanceState.getInt("arms"));
            hat.setVisibility(savedInstanceState.getInt("hat"));
            eyes.setVisibility(savedInstanceState.getInt("eyes"));
            eyebrows.setVisibility(savedInstanceState.getInt("eyebrows"));
            nose.setVisibility(savedInstanceState.getInt("nose"));
            glasses.setVisibility(savedInstanceState.getInt("glasses"));
            shoes.setVisibility(savedInstanceState.getInt("shoes"));
            mustache.setVisibility(savedInstanceState.getInt("mustache"));
            mouth.setVisibility(savedInstanceState.getInt("mouth"));
            ears.setVisibility(savedInstanceState.getInt("ears"));
        }
    }

    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState); // always call super

        // saves the Visibility parameter in order to get it later
        outState.putInt("arms", arms.getVisibility());
        outState.putInt("hat", hat.getVisibility());
        outState.putInt("eyes", eyes.getVisibility());
        outState.putInt("eyebrows", eyebrows.getVisibility());
        outState.putInt("nose", nose.getVisibility());
        outState.putInt("glasses", glasses.getVisibility());
        outState.putInt("shoes", shoes.getVisibility());
        outState.putInt("mustache", mustache.getVisibility());
        outState.putInt("mouth", mouth.getVisibility());
        outState.putInt("ears", ears.getVisibility());
    }


    public void checkClicked(View v) {
        // creates a Checkbox object for View v
        CheckBox checkbox = (CheckBox) v;

        // in case of every possible id of View v ...
        switch (v.getId()) {
            // ... change the corresponding view ...
            case R.id.armsBox:
                // ... to Visible or Invisible, depending on previous state
                if (checkbox.isChecked()) {
                    arms.setVisibility(View.VISIBLE);
                } else {
                    arms.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.earsBox:
                if (checkbox.isChecked()) {
                    ears.setVisibility(View.VISIBLE);
                } else {
                    ears.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.eyesBox:
                if (checkbox.isChecked()) {
                    eyes.setVisibility(View.VISIBLE);
                } else {
                    eyes.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.noseBox:
                if (checkbox.isChecked()) {
                    nose.setVisibility(View.VISIBLE);
                } else {
                    nose.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.mustacheBox:
                if (checkbox.isChecked()) {
                    mustache.setVisibility(View.VISIBLE);
                } else {
                    mustache.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.shoesBox:
                if (checkbox.isChecked()) {
                    shoes.setVisibility(View.VISIBLE);
                } else {
                    shoes.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.hatBox:
                if (checkbox.isChecked()) {
                    hat.setVisibility(View.VISIBLE);
                } else {
                    hat.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.mouthBox:
                if (checkbox.isChecked()) {
                    mouth.setVisibility(View.VISIBLE);
                } else {
                    mouth.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.eyebrowsBox:
                if (checkbox.isChecked()) {
                    eyebrows.setVisibility(View.VISIBLE);
                } else {
                    eyebrows.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.glassesBox:
                if (checkbox.isChecked()) {
                    glasses.setVisibility(View.VISIBLE);
                } else {
                    glasses.setVisibility(View.INVISIBLE);
                }
                break;

        }
    }
}


