package com.example.fragmentruntime;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager=getSupportFragmentManager();
        if(findViewById(R.id.fragment_container)!=null){
            if (savedInstanceState!=null){
                return;
            }
            PrimaryFragment primaryFragment=new PrimaryFragment();
            FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.fragment_container,primaryFragment,null);
            fragmentTransaction.commit();
        }
    }

}
