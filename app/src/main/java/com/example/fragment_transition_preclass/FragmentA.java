package com.example.fragment_transition_preclass;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentA extends Fragment {

    private static final String TAG = FragmentA.class.getSimpleName();
    @Override
    public void onAttach( Context context) {
        super.onAttach(context);
        printLogs("onAttach");
    }
    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        printLogs("onCreate");
    }
    @Override
    public void onActivityCreated( Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        printLogs("onActivityCreated");
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        printLogs("onCreateView");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a, container, false);
    }
    @Override
    public void onViewCreated( View view,  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        printLogs("onViewCreated");
    }
    @Override
    public void onStart() {
        super.onStart();
        printLogs("onStart");
    }
    @Override
    public void onResume() {
        super.onResume();
        printLogs("onResume");
    }
    @Override
    public void onPause() {
        super.onPause();
        printLogs("onPause");
    }
    @Override
    public void onStop() {
        super.onStop();
        printLogs("onStop");
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        printLogs("onDestroyView");
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        printLogs("onDestroy");
    }
    @Override
    public void onDetach() {
        super.onDetach();
        printLogs("onDetach");
    }
    private void printLogs(String message) {
        Log.d(TAG, message);
    }
}