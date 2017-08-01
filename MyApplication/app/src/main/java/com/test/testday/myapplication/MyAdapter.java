package com.test.testday.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/7/31.
 */
public class MyAdapter extends RecyclerView.Adapter {

    private final List<String> stringLists;

    public MyAdapter() {

        stringLists = getLists();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        TextView  textView=new TextView(parent.getContext());
        textView.setPadding(30,10,0,10);
        MyViewHolder myViewHolder=new  MyViewHolder(textView);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        MyViewHolder  myViewHolder=  (MyViewHolder)holder   ;
        myViewHolder.textView.setText(stringLists.get(position));
    }

    @Override
    public int getItemCount() {
        return stringLists.size();
    }

    public List<String> getLists() {
        List<String>  lists=new ArrayList<>();
        for (int i=0;i<50;i++)
        {
            lists.add("item"+i);
        }
        return lists;
    }

    private class MyViewHolder extends RecyclerView.ViewHolder {
        public   TextView textView;

        public MyViewHolder(View itemView) {
            super(itemView);
              textView=  (TextView) itemView;
        }
    }
}
