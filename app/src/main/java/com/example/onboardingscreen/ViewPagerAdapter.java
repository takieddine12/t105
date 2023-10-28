package com.example.onboardingscreen;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.onboardingscreen.R;
import com.example.onboardingscreen.BoardingFragment;

public class ViewPagerAdapter  extends FragmentPagerAdapter {

    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new BoardingFragment("OnBoarding Title 1",R.raw.vid,position);
            case 1:
                return new BoardingFragment("OnBoarding Title 2", R.raw.vid,position);
            case 2:
                return new BoardingFragment("OnBoarding Title 3", R.raw.vid,position);
            case 3:
                return new BoardingFragment("OnBoarding Title 4", R.raw.vid,position);
            case 4:
                return new BoardingFragment("OnBoarding Title 5", R.raw.vid,position);
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 5;
    }

}
