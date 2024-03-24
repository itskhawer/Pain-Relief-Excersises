package com.example.painreliefexcersises;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    CardView backPain,neckPain,shoulderPain,wristPain,elbowPain,groinPain,hipPain,kneePain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //  Get Views
        backPain = findViewById(R.id.lower_back_card);
        neckPain = findViewById(R.id.neck_pain_card);
        shoulderPain = findViewById(R.id.shoulder_pain_card);
        wristPain = findViewById(R.id.wrist_pain_card);
        elbowPain = findViewById(R.id.elbow_pain_card);
        groinPain = findViewById(R.id.groin_pain_card);
        hipPain = findViewById(R.id.hip_pain_card);
        kneePain = findViewById(R.id.knee_pain_card);

        //  Setting onclick listeners
        backPain.setOnClickListener(v -> {
            Intent intent = new Intent(this, BackPain.class);
            startActivity(intent);
        });
        neckPain.setOnClickListener(v -> {
            Intent intent = new Intent(this, NeckPain.class);
            startActivity(intent);
        });
        shoulderPain.setOnClickListener(v -> {
            Intent intent = new Intent(this, ShoulderPain.class);
            startActivity(intent);
        });
        wristPain.setOnClickListener(v -> {
            Intent intent = new Intent(this, WristPain.class);
            startActivity(intent);
        });
        elbowPain.setOnClickListener(v -> {
            Intent intent = new Intent(this, ElbowPain.class);
            startActivity(intent);
        });
        groinPain.setOnClickListener(v -> {
            Intent intent = new Intent(this, GroinPain.class);
            startActivity(intent);
        });
        hipPain.setOnClickListener(v -> {
            Intent intent = new Intent(this, HipPain.class);
            startActivity(intent);
        });
        kneePain.setOnClickListener(v -> {
            Intent intent = new Intent(this, KneePain.class);
            startActivity(intent);
        });
    }


}