package com.jil.AndroidLayout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by jil on 28/7/2017.
 */

public class FrameActivity extends android.support.v4.app.Fragment {

    public FrameActivity() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.frame_layout, container, false);
        return rootView;
    }
}