package com.example.databindingdemo;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.databindingdemo.databinding.RecyclerLayoutBinding;

import java.util.ArrayList;
import java.util.List;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.ViewHolder> {

    private Context context;
    private List<Animals> userList = new ArrayList<>();

    public AnimalAdapter(Context context, List<Animals> userList) {
        this.context = context;
        this.userList = userList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        RecyclerLayoutBinding mBinding = DataBindingUtil.inflate(LayoutInflater.from(context),R.layout.recycler_layout,viewGroup,false);

        ViewHolder holder = new ViewHolder(mBinding);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Animals animals = userList.get(i);
        viewHolder.mBinding.setAnimal(animals);

    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        RecyclerLayoutBinding mBinding ;
        public ViewHolder(@NonNull RecyclerLayoutBinding itemView) {
            super(itemView.getRoot());
            mBinding = itemView;
        }
    }
}
