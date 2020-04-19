package com.example.theproject22;

import androidx.fragment.app.Fragment;

public class MyTab {
    String tab_name;
    Fragment fragment;

    public MyTab(String tab_name, Fragment fragment) {
        this.tab_name = tab_name;
        this.fragment = fragment;
    }

    public String getTab_name() {
        return tab_name;
    }

    public void setTab_name(String tab_name) {
        this.tab_name = tab_name;
    }

    public Fragment getFragment() {
        return fragment;
    }

    public void setFragment(Fragment fragment) {
        this.fragment = fragment;
    }
}
