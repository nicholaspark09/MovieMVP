package com.example.nicholaspark.moviemvp.Data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by nicholaspark on 9/28/16.
 */

public class MoviesDB extends SQLiteOpenHelper {

    private static final String TABLE = "movies";

    public static final String KEY_ID = "id";
    public static final String KEY_TITLE = "title";
    public static final String KEY_OVERVIEW = "overview";
    public static final String KEY_VOTE_AVERAGE = "vote_average";
    public static final String KEY_POSTER_PATH = "poster_path";
    public static final String KEY_POPULARITY = "popularity";
    public static final String KEY_ORIGINAL_TITLE = "original_title";
    public static final String KEY_RELEASE_DATE = "release_date";
    public static final String KEY_VOTE_COUNT = "vote_count";

    public MoviesDB(Context context){
        super(context,"findovie.db",null,1);
        onCreate(this.getWritableDatabase());
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE IF NOT EXISTS "+TABLE+"("
                +KEY_ID+" integer primary key,"
                +KEY_TITLE+" text default null,"
                +KEY_OVERVIEW+" text default null,"
                +KEY_VOTE_AVERAGE+" float,"
                +KEY_VOTE_COUNT+" integer default -1,"
                +KEY_POSTER_PATH+" text default null,"
                +KEY_POPULARITY+" float,"
                +KEY_ORIGINAL_TITLE+" text default null,"
                +KEY_RELEASE_DATE+" text default null)";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE);
        this.onCreate(db);
    }
}
