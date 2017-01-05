package com.example.moham.ychat.Activities;

import android.support.v4.app.Fragment;

import com.example.moham.ychat.Fragments.LoginFragment;
import com.example.moham.ychat.SingleActivityFragments;

/**
 * Created by moham on 05/01/2017.
 */

public class LoginActivtiy extends SingleActivityFragments {
    @Override
    public Fragment CreateFragment() {
        return LoginFragment.newInstance();
    }
}
