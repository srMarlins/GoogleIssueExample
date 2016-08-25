package com.srmarlins.mapissueexample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BlankFragment extends Fragment {

    public static final String INT = "int";

    public BlankFragment() {
        // Required empty public constructor
    }

    public static BlankFragment newInstance(int num) {
        BlankFragment fragment = new BlankFragment();
        Bundle args = new Bundle();
        args.putInt(INT, num);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blank, container, false);

        Bundle args = getArguments();
        if(args != null){
            TextView textView = (TextView) view.findViewById(R.id.textView);
            textView.setText(String.valueOf(args.getInt(INT)));
        }

        return view;
    }


}
