package com.example.moham.ychat.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.moham.ychat.R;

/**
 * Created by moham on 05/01/2017.
 */

public class LoginFragment extends Fragment{

    private Button mLogin;
    private Button mForgetpassword;
    private EditText mPhone;
    private EditText mPassword;
    private TextView mSingup;
    public static LoginFragment newInstance(){
        return new LoginFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.login_fragment,container,false);
        mLogin= (Button) view.findViewById(R.id.login_main);
        mForgetpassword= (Button) view.findViewById(R.id.forget_password);
        mPhone = (EditText) view.findViewById(R.id.phone_number);
        mPassword= (EditText) view.findViewById(R.id.password);
        mSingup= (TextView) view.findViewById(R.id.sign_up_main);
        return view;
    }

    private void login(){

    }


    private void signUp(){

    }

    private void foregetPassword(){


    }
}
