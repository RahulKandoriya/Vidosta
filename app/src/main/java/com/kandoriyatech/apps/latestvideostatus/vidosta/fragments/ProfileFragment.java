package com.kandoriyatech.apps.latestvideostatus.vidosta.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.kandoriyatech.apps.latestvideostatus.vidosta.R;
import com.kandoriyatech.apps.latestvideostatus.vidosta.adapters.item_adapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment implements item_adapter.ItemClickListener  {

    String[] data = {"Feeling Happy", "Feeling Sad", "Feeling Angry", "Feeling Great", "Feeling Excited", "Feeling Funny", "Feeling Happy", "Feeling Sad","Feeling Happy", "Feeling Sad", "Feeling Angry", "Feeling Great"};
    private RecyclerView.Adapter adapter;
    private NavController navController;


    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);


        RecyclerView recyclerView = view.findViewById(R.id.rvNumbers);
        int numberOfColumns = 2;
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), numberOfColumns));
        adapter = new item_adapter(getContext(), data);
        ((item_adapter) adapter).setClickListener(this);
        recyclerView.setAdapter(adapter);

        navController = Navigation.findNavController(getActivity(), R.id.nav_host_fragment);

        //recyclerView.addItemDecoration(new DividerItemDecoration(getContext(),
        //                DividerItemDecoration.VERTICAL));
        //        DividerItemDecoration itemDecorator = new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL);
        //        itemDecorator.setDrawable(ContextCompat.getDrawable(getContext(), R.drawable.divider));



        return view;
    }

    @Override
    public void onItemClick(View view, int position) {

        navController.navigate(R.id.action_homeFragment_to_videoDetailsFragment);

    }

}
