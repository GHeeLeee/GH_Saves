package com.example.movie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class MovieDetailedScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        int uiOptions = getWindow().getDecorView().getSystemUiVisibility();
        int newUiOptions = uiOptions;
        boolean isImmersiveModeEnabled = ((uiOptions | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY) == uiOptions);
        if (isImmersiveModeEnabled) {
            Log.i("Is on?", "Turning immersive mode mode off. ");
        } else {
            Log.i("Is on?", "Turning immersive mode mode on.");
        }
        newUiOptions ^= View.SYSTEM_UI_FLAG_HIDE_NAVIGATION;
        newUiOptions ^= View.SYSTEM_UI_FLAG_FULLSCREEN;
        newUiOptions ^= View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
        getWindow().getDecorView().setSystemUiVisibility(newUiOptions);


        setContentView(R.layout.activity_movie_detailed_screen);

        Button Btn = findViewById(R.id.back_btn);
        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MovieDetailedScreenActivity.this, MyInformationActivity.class);
                startActivity(intent);
                /*intent.putExtra("name", "mike");
                setResult(RESULT_OK, intent);
                finish();*/
            }
        });

        Button Btn2 = findViewById(R.id.Changebtn);
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MovieDetailedScreenActivity.this, SeatChoiceActivity2.class);
                startActivity(intent);
                /*intent.putExtra("name", "mike");
                setResult(RESULT_OK, intent);
                finish();*/
            }
        });
    }
}
