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
