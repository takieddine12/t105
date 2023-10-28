package com.example.onboardingscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import com.rd.PageIndicatorView;

public class MainActivity extends AppCompatActivity {


    private CardView skipCard,goCard;
    private ViewPagerAdapter viewPagerAdapter;
    private ViewPager viewPager;
    private PageIndicatorView pageIndicatorView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        skipCard = findViewById(R.id.skipCard);
        goCard = findViewById(R.id.goCard);
        viewPager = findViewById(R.id.viewPager);

        SharedPreferences preferences = getSharedPreferences("my_preferences", MODE_PRIVATE);
        boolean isFirstTime = preferences.getBoolean("is_first_time", true);

        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(viewPagerAdapter);

        if (!isFirstTime) {
            Intent intent = new Intent(this, NextActivity.class);
            startActivity(intent);
            finish();
        }

        skipCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Extras.showFirstTime(MainActivity.this);
                Intent intent = new Intent(MainActivity.this, NextActivity.class);
                startActivity(intent);
                finish();
            }
        });
        goCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Extras.showFirstTime(MainActivity.this);
                Intent intent = new Intent(MainActivity.this, NextActivity.class);
                startActivity(intent);
                finish();
            }
        });

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if(position == 4){
                    skipCard.setVisibility(View.GONE);
                    goCard.setVisibility(View.VISIBLE);
                } else {
                    skipCard.setVisibility(View.VISIBLE);
                    goCard.setVisibility(View.GONE);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}