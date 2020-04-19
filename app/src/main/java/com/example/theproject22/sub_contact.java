package com.example.theproject22;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class sub_contact extends AppCompatActivity {
TabLayout tabLayout;
ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_contact);
        tabLayout=findViewById(R.id.main_tab);
        viewPager=findViewById(R.id.view_pager);

        Pager_Adater adapter=new Pager_Adater(getSupportFragmentManager());
         adapter.addTab(new MyTab("lectures",lec_frag.newInstance(1,"lecturs")));

        adapter.addTab(new MyTab("sheetes",lec_frag.newInstance(2,"sheetes")));
                adapter.addTab(new MyTab("vedioes",lec_frag.newInstance(3,"vedioes")));
       viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
    }

