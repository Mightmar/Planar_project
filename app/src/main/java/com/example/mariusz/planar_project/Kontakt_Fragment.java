package com.example.mariusz.planar_project;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Mariusz on 2015-05-18.
 */
public class Kontakt_Fragment extends Fragment {
    View rootviev;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootviev = inflater.inflate(R.layout.kontakt_layout,container,false);
        return rootviev;
    }
}
