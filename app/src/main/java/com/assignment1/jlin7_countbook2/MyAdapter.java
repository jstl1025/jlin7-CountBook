/*
Adapter suppose to show a list of counter on the main screen of app

Issue: changed the code several times, when running app stops
 */

package com.assignment1.jlin7_countbook2;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>  {
    private List<Counter> mCounters;

    public class ViewHolder  extends RecyclerView.ViewHolder{
        public TextView mTextView;
        public ViewHolder(TextView v) {
            super(v);
            mTextView = v;
        }
    }

    public MyAdapter(List<Counter> myCunters){
        mCounters=myCunters;
    }

    @Override
    public int getItemCount(){
        return mCounters.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType){
        Context context = viewGroup.getContext();
        View counterView = LayoutInflater.from(context).inflate(R.layout.item_contact, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder((TextView) counterView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position){
        Counter counter = mCounters.get(position);
        TextView mTextView = viewHolder.mTextView;
        mTextView.setText(Counter.getName());
    }
}
