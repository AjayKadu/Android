package com.sunbeam;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MyAdapter extends FragmentStateAdapter {
    public MyAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new FirstFragment();
            case 1:
                return  new SecondFragment();
            case 2:
                return new ThirdFragment();
            case 3:
                return new FourtFragment();
        }
        return null;
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
