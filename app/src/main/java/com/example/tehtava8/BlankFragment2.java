package com.example.tehtava8;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class BlankFragment2 extends Fragment {

    private BlankFragment2ViewModel mViewModel;

    ListView lv;
    ArrayAdapter <String> stringArrayAdapter;

    public static BlankFragment2 newInstance() {
        return new BlankFragment2();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        ViewModelProvider viewModelProvider = new ViewModelProvider(this);
       mViewModel= viewModelProvider.get(BlankFragment2ViewModel.class);
        Observer os = new Observer() {
            @Override
            public void onChanged(Object o) {
                stringArrayAdapter.addAll(String.valueOf(mViewModel.haeLista()));


            }
        };

        View v = inflater.inflate(R.layout.blank_fragment2_fragment, container, false);
        this.lv = v.findViewById(R.id.lista);
                stringArrayAdapter = new ArrayAdapter<>(getActivity().getApplicationContext(),
                android.R.layout.simple_list_item_1);
        lv.setAdapter(stringArrayAdapter);





        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(BlankFragment2ViewModel.class);
        // TODO: Use the ViewModel
    }

}
