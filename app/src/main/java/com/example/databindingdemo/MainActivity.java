package com.example.databindingdemo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.example.databindingdemo.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);


    }

    @Override
    protected void onStart() {
        super.onStart();
        mBinding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        AnimalAdapter adapter = new AnimalAdapter(getApplicationContext(),usersList());
        mBinding.recyclerView.setAdapter(adapter);
    }

    private List<Animals> usersList(){
        List<Animals> animalsList = new ArrayList<>();
        String[] animals = {"Tiger","Monkey","Dog","Lion","Zebra","Horse","Cat"};
        String[] types = {"Carnivore","Herbivore","Omnivore","Carnivore","Herbivore","Herbivore","Omnivore"};
        int[] image = {R.drawable.tiger,R.drawable.monkey,R.drawable.dog,R.drawable.lion, R.drawable.zebra, R.drawable.horse, R.drawable.cat};

        for (int i=0;i<animals.length;i++){
            Animals users = new Animals(
                    animals[i],
                    types[i],
                    image[i]
            );
            animalsList.add(users);
        }

        return animalsList;
    }
}
