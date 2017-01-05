package com.example.moham.ychat.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.moham.ychat.R;

/**
 * Created by moham on 05/01/2017.
 */

public class YchatFragment extends Fragment {
    private Button mLoginButton;
    private Button mRegisterButton;

    public static YchatFragment newInstance(){
        return new YchatFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.ychat_fragment,container,false);
        mLoginButton= (Button) view.findViewById(R.id.login);
        mRegisterButton= (Button) view.findViewById(R.id.register);
        return  view;
    }

    private void login(){

    }

    private void reister(){

    }
}
