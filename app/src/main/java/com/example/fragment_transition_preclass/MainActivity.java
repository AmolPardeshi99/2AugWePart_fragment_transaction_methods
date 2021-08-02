package com.example.fragment_transition_preclass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mBtnAddA,mBtnAddB, mBtnRemoveA,
            mBtnRemoveB, mBtnReplaceA_B,mBtnReplaceB_A;
    private FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        fragmentManager = getSupportFragmentManager();

    }

    private void initViews() {
        mBtnAddA = findViewById(R.id.btnAddA);
        mBtnAddB = findViewById(R.id.btnAddB);
        mBtnRemoveA = findViewById(R.id.btnRemoveA);
        mBtnRemoveB = findViewById(R.id.btnRemoveB);
        mBtnReplaceA_B = findViewById(R.id.btnReplaceA_B);
        mBtnReplaceB_A = findViewById(R.id.btnReplaceB_A);
        mBtnAddA.setOnClickListener(this);
        mBtnAddB.setOnClickListener(this);
        mBtnRemoveA.setOnClickListener(this);
        mBtnRemoveB.setOnClickListener(this);
        mBtnReplaceA_B.setOnClickListener(this);
        mBtnReplaceB_A.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.btnAddA:
            addA(); break;
            case R.id.btnAddB:
                addB();break;
            case R.id.btnRemoveA:
                RemoveA();break;
            case R.id.btnRemoveB:
                RemoveB();break;
            case R.id.btnReplaceA_B:
                ReplaceA_B();break;
            case R.id.btnReplaceB_A:
                ReplaceB_A();break;
            case R.id.btnReplaceAwithBack:
                ReplaceAwithBack();break;
        }
    }
    private void ReplaceAwithBack() {
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        FragmentB fragmentB = new FragmentB();
        transaction.replace(R.id.flContainer,fragmentB,"fragmnetB").addToBackStack("fragB").commit();

    }
    private void ReplaceB_A() {
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        FragmentA fragmentA = new FragmentA();
        transaction.replace(R.id.flContainer,fragmentA,"fragmnetA").commit();

    }
    private void ReplaceA_B() {
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        FragmentB fragmentB = new FragmentB();
        transaction.replace(R.id.flContainer,fragmentB,"fragmnetB").commit();

    }
    private void RemoveB() {
        FragmentB fragmentB = (FragmentB) fragmentManager.findFragmentByTag("fragmnetB");
        if (fragmentB != null){
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.remove(fragmentB).commit();
        }

    }
    private void RemoveA() {
        FragmentA fragmentA = (FragmentA) fragmentManager.findFragmentByTag("fragmnetA");
        if (fragmentA != null){
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.remove(fragmentA).commit();
        }
    }
    private void addB() {
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        FragmentB fragmentB = new FragmentB();
        transaction.add(R.id.flContainer,fragmentB,"fragmnetB").commit();

    }
    private void addA() {
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        FragmentA fragmentA = new FragmentA();
        transaction.add(R.id.flContainer,fragmentA,"fragmnetA").commit();

    }
}