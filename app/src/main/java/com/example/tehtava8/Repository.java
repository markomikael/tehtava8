package com.example.tehtava8;

import android.app.Application;
import android.content.Intent;
import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.room.Insert;
import androidx.room.Room;

import java.util.List;

class Repository {

     private tauluDao td;
     private LiveData<List<MyEntity>> listLiveData;
     private Tietokanta t;
    private MyEntity me;

    Repository(Application application){

         Tietokanta db = Room.databaseBuilder(application.getApplicationContext()
                 ,Tietokanta.class,"tietoa").allowMainThreadQueries().fallbackToDestructiveMigration().build();
         this.td = db.tauluDao();
         this.listLiveData = td.haeLista();

     }

     public LiveData<List<MyEntity>> haeLista(){
         return listLiveData;
     }

     public void insert(){



     }


}
