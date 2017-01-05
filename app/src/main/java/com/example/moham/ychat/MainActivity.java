package com.example.moham.ychat;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.moham.ychat.Fragments.YchatFragment;

public class MainActivity extends SingleActivityFragments {


    @Override
    public Fragment CreateFragment() {
        return YchatFragment.newInstance();
    }
}
