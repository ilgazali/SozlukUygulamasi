package com.example.sozlukuygulamasi;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class KelimelerDao {

    public ArrayList<Kelimeler> tumKelimeler(DataBase database){

        ArrayList<Kelimeler> kelimelerArrayList = new ArrayList<>();
        SQLiteDatabase db = database.getWritableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM kelimeler ",null);

        while(c.moveToNext()){

            Kelimeler b = new Kelimeler(c.getInt(c.getColumnIndex("kelime_id")),c.getString(c.getColumnIndex("ingilizce")),c.getString(c.getColumnIndex("turkce")));
            kelimelerArrayList.add(b);
        }

        return kelimelerArrayList;
    }

    public ArrayList<Kelimeler> kelimeAra(DataBase database, String aramaKelime){
        ArrayList<Kelimeler> kelimelerArrayList = new ArrayList<>();
        SQLiteDatabase db = database.getWritableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM kelimeler WHERE ingilizce like '%"+aramaKelime+"%'",null);

        while(c.moveToNext()){

            Kelimeler b = new Kelimeler(c.getInt(c.getColumnIndex("kelime_id")),c.getString(c.getColumnIndex("ingilizce")),c.getString(c.getColumnIndex("turkce")));
            kelimelerArrayList.add(b);
        }

        return kelimelerArrayList;
    }

}
