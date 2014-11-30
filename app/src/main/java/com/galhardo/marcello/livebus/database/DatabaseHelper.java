package com.galhardo.marcello.livebus.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String NOME_DO_BANCO_DE_DADOS = "live_bus.db";
    private static int VERSAO_DO_BANCO_DE_DADOS = 2;

    public DatabaseHelper(Context context) {
        super(context, NOME_DO_BANCO_DE_DADOS, null, VERSAO_DO_BANCO_DE_DADOS);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(LinhaDeOnibusDAO.CREATE_SCRIPT);
        for (String insert : ValoresPadroesDoBancoDeDados.obterInsertLinhaDeOnibus()) {
            db.execSQL(insert);
        }
        db.execSQL(HorarioDaLinhaDeOnibusDAO.CREATE_SCRIPT);
        for (String insert : ValoresPadroesDoBancoDeDados.obterInsertHorarioDaLinhaDeOnibus()) {
            db.execSQL(insert);
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(LinhaDeOnibusDAO.DROP_SCRIPT);
        db.execSQL(HorarioDaLinhaDeOnibusDAO.DROP_SCRIPT);
        onCreate(db);
    }

}
