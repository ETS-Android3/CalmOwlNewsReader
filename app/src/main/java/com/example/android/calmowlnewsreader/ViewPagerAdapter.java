package com.example.android.calmowlnewsreader;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.android.calmowlnewsreader.fragment.ScienceFragment;
import com.example.android.calmowlnewsreader.fragment.SportsFragment;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case Constants.FRAGMENT_SPORTS:
                return new SportsFragment();
            case Constants.FRAGMENT_SCIENCE:
                return new ScienceFragment();
            default:
                return new ScienceFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
