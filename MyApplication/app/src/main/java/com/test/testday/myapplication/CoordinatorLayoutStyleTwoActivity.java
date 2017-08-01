package com.test.testday.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/7/31.
 */
public class CoordinatorLayoutStyleTwoActivity extends FragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_tab_layout);

        findViewById();
    }

    private void findViewById() {
        List<String>  lists = getTabList();
        TabLayout tabLayout= (TabLayout) findViewById(R.id.tablelayout);
        ViewPager viewPager= (ViewPager) findViewById(R.id.viewpager);


        List<Fragment> fragments=new ArrayList<>();
        for (int i=0;i<2;i++)
        {
            CurrencyFragment  currencyFragment=  CurrencyFragment.newInstance(lists.get(i));
            fragments.add(currencyFragment);
        }



        viewPager.setAdapter(new MyAdatapter(lists,this,fragments,getSupportFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);
    }

    public static void start(Activity mainActivity) {
        Intent  intent=new Intent(mainActivity,CoordinatorLayoutStyleTwoActivity.class);
        mainActivity.startActivity(intent);
    }

    public List<String> getTabList() {
        List<String>  list=new ArrayList<>();
        list.add("热门");
        list.add("推荐");
        return list;
    }

    /**
     * 小结一： Toolbar  设置背景颜色会影响 TabLayout  默认显示颜色，如果要想区分开来 必须重新给TabLayout 设置颜色
     * 小结二：  app:layout_scrollFlags  这个属性很强大用控制，view的滚动机制，可以好好琢磨下
     */
}
