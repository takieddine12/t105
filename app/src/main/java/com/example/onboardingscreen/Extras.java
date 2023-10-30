package com.example.onboardingscreen;

import static android.content.Context.MODE_PRIVATE;

import android.content.Context;
import android.content.SharedPreferences;

public class Extras {

    public static void showFirstTime(Context context){
        SharedPreferences preferences = context.getSharedPreferences("my_preferences", MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean("is_first_time", false);
        editor.apply();
    }
}
/*
    // Set Width / height based on device screen width
        if (screenWidth >= 1080) {
            // Large screen (e.g., large phones)
            mWidth = 650;
            mHeight = 800;
            width  = 800;
            height = 800;
        } else if (screenWidth >= 720) {
            // Normal screen (e.g., most phones)
            mWidth = 550;
            mHeight = 600;
            width  = 700;
            height = 700;
        } else {
            // Small screen (e.g., small phones)
            mWidth = 450;
            mHeight = 500;
            width  = 500;
            height = 500;
        }
 */