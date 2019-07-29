package com.kandoriyatech.apps.latestvideostatus.vidosta.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.kandoriyatech.apps.latestvideostatus.vidosta.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class VideoDetailsFragment extends Fragment {


    public VideoDetailsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_video_details, container, false);

        ImageView backImageView;

        backImageView = view.findViewById(R.id.backImageView);


        final NavController navController = Navigation.findNavController(getActivity(), R.id.nav_host_fragment);


        backImageView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                navController.popBackStack();

            }

        });

        return view;
    }

}
