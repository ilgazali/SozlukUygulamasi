package com.example.sozlukuygulamasi;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DataBase extends SQLiteOpenHelper {

    public DataBase(@Nullable Context context) {
        super(context, "sozluk.sqlite",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS 'kelimeler'(\n" +
                "\t`kelime_id` INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                "\t`ingilizce` TEXT,\n" +
                "\t`turkce` TEXT\n" + ")");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS kelimeler");
        onCreate(sqLiteDatabase);
    }
}
