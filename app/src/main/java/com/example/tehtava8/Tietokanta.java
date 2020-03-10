package com.example.tehtava8;


import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database (entities = {MyEntity.class},version = 4,exportSchema = false)
public abstract class Tietokanta extends RoomDatabase {

    public  static final String NIMI = "tietoa";
    public abstract  tauluDao tauluDao();












}


