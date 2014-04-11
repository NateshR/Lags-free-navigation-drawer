package com.vsrstudio.example.drawer.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import com.vsrstudio.example.drawer.R;
import com.vsrstudio.example.drawer.adapters.ContentAdapter;

public class ContentFragment extends Fragment {

    public ContentFragment() {
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment, container, false);

        int position = getArguments().getInt("positions");

        GridView grid = (GridView) rootView.findViewById(R.id.content_grid);
        grid.setAdapter(new ContentAdapter(rootView.getContext(), position));

        return rootView;
    }

}
