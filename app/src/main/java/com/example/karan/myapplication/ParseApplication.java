package com.example.karan.myapplication;

/**
 * Created by Karan on 10/8/15.
 */
import com.parse.Parse;
        import com.parse.ParseACL;

        import com.parse.ParseUser;

        import android.app.Application;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "aq7xNKq2HOfrCWByAc4qm8trnjMlynZSWTxY8bHQ", "fqdgMqWYvLx6CpYO2tZENZ5sYM5fwXZ4qMXWSI9h");

        ParseUser.enableAutomaticUser();
        ParseACL defaultACL = new ParseACL();

        defaultACL.setPublicReadAccess(true);

        ParseACL.setDefaultACL(defaultACL, true);
    }

}