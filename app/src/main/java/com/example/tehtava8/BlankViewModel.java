package com.example.tehtava8;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;




public class BlankViewModel extends AndroidViewModel {
    private  Repository re;
    public BlankViewModel(@NonNull Application application) {
        super(application);
        re = new Repository(application);



    }
    public void insert(String teksti){
        re.insert();
    }


}
