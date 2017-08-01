package com.test.testday.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/**
 * Created by Administrator on 2017/7/31.
 */

public class CoordinatorLayoutStyleOneActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinator_style_one);

        findViewById();

    }

    private void findViewById() {
        RecyclerView recyclerView= (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new  MyAdapter());
    }

    public static  void  start(Context  context)
    {
        Intent  intent=new Intent(context,CoordinatorLayoutStyleOneActivity.class);
        context.startActivity(intent);
    }


    /**
     * 总结：
     *
     * 小点一：
     * FloatingActionButton  依附AppBarLayout ，经测试必须这么写
     * app:layout_anchor="@id/tab"   如果依附于其他不会消失，原理就是
     * app:layout_behavior="@string/appbar_scrolling_view_behavior"  里面写了代码根据高度来隐藏显示
     *
     * 小点二：
     * app:expandedTitleMarginEnd="64dp"
     *app:expandedTitleMarginStart="48dp"
     *控制CollapsingToolbarLayout  title的大小
     *
     *
     * 小点三：
     *   app:contentScrim="?attr/colorPrimary"   用设置view在折叠或者收缩的时候过渡颜色
     *   可以不设置看下效果
     */
}
