package com.example.moham.ychat;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by moham on 05/01/2017.
 */

public  abstract class SingleActivityFragments extends AppCompatActivity {
    public abstract Fragment CreateFragment();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager  fragmentManager=getSupportFragmentManager();

        Fragment  fragment=fragmentManager.findFragmentById(R.id.Fragment_Container);

        if (fragment==null){
            fragment=CreateFragment();
            fragmentManager.beginTransaction().add(R.id.Fragment_Container,fragment).commit();
        }
    }
}
