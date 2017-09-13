package com.wshomeup.viewpager.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wshomeup.viewpager.R;

public class fourFragment extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";

    public fourFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_four, container, false);
    }

    public static fourFragment newInstance(int sectionNumber) {
        fourFragment fragment = new fourFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }
}

