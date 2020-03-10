package com.example.tehtava8;

import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.room.Room;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class BlankFragment extends Fragment {

    private BlankViewModel mViewModel;
    private tauluDao td;
    private EditText et;
    private Button b;

    public static BlankFragment newInstance() {
        return new BlankFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {


        ViewModelProvider viewModelProvider = new ViewModelProvider(this);
        mViewModel= viewModelProvider.get(BlankViewModel.class);
        View v = inflater.inflate(R.layout.blank_fragment, container, false);
        b = v.findViewById(R.id.nappula);
        et = v.findViewById(R.id.edittext);



        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String x = et.getText().toString();


                mViewModel.insert(x);


            }
        });

        return v;





    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);




        // TODO: Use the ViewModel
    }

}
