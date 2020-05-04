package com.example.theproject22;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

public class Pager_Adater extends FragmentStatePagerAdapter {
ArrayList<MyTab>tabs=new ArrayList<>();


    public Pager_Adater( FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        return tabs.get(position).getFragment();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        return tabs.get(position).getTab_name();
    }
public void addTab (MyTab tab){

        tabs.add(tab);
}
    @Override
    public int getCount() {
        return tabs.size();
    }
}
