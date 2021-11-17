package com.appsxone.simplerecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.Holder> {
    Context mContext;
    ArrayList<String> mArrayListString;

    public Adapter(Context mContext, ArrayList<String> mArrayListString) {
        this.mContext = mContext;
        this.mArrayListString = mArrayListString;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.view_item, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        holder.mTextView.setText(mArrayListString.get(position));
    }

    @Override
    public int getItemCount() {
        return mArrayListString.size();
    }

    public static class Holder extends RecyclerView.ViewHolder {
        TextView mTextView;

        public Holder(View itemView) {
            super(itemView);
            mTextView = itemView.findViewById(R.id.tv_item);
        }
    }
}