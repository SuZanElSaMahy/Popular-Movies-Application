package com.example.dell2014.popularmovies;

import android.content.Context;
import android.database.Cursor;

import com.example.dell2014.popularmovies.Data.MoviesContract;


public class Utilities {


    public static int IsFavorite(Context context, int id) {
        Cursor cursor = context.getContentResolver().query(
                MoviesContract.MoviesEntry.CONTENT_URI,
                null,   // projection
                MoviesContract.MoviesEntry.COLUMN_MOVIE_ID + " = ?", // selection
                new String[] { Integer.toString(id) },   // selectionArgs
                null    // sort order
        );
        int numRows = cursor.getCount();
        cursor.close();
        return numRows;
    }

}
