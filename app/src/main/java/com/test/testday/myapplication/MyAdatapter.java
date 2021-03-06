package com.test.testday.myapplication;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class MyAdatapter extends FragmentPagerAdapter {
    private final List<String> lists;
    private final Activity context;
    private final List<Fragment> fragments;

    public MyAdatapter(List<String> lists, Activity context, List<Fragment> fragments, FragmentManager fm) {
        super(fm);
        this.lists=lists;
        this.context=context;
        this.fragments=fragments;
    }

    @Override
    public int getCount() {
        return lists.size();
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return lists.get(position);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }
}