package com.example.tehtava8;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

public class BlankFragment2ViewModel extends AndroidViewModel {
    LiveData<List<MyEntity>> lista;

    public BlankFragment2ViewModel(@NonNull Application application) {
        super(application);
        Repository re = new Repository(application);
         lista = re.haeLista();



    }
    LiveData<List<MyEntity>> haeLista() {
        return lista;
    }


}
