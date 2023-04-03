package com.example.quanlytrasua.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;


import com.example.quanlytrasua.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;


public class DisplayStatisticFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        return inflater.inflate(R.layout.displaystatistic_layout, container, false);
    }
}
