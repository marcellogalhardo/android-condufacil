package com.galhardo.marcello.livebus.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.galhardo.marcello.livebus.model.HorarioDaLinhaDeOnibus;

import java.util.ArrayList;

/**
 * Created by marcello on 27/11/14.
 */
public class HorarioDaLinhaDeOnibusDAO {

    public static String NOME_DA_TABELA = "horario_da_linha_de_onibus";
    public static String CREATE_SCRIPT =   "CREATE TABLE " + NOME_DA_TABELA
                                         + "("
                                         + "   _id INTEGER PRIMARY KEY"
                                         + "  ,horarioDaIda TEXT"
                                         + "  ,horarioDaVolta TEXT"
                                         + "  ,id_linha_de_onibus"
                                         + ")";
    public static String DROP_SCRIPT = "DROP TABLE IF EXISTS " + NOME_DA_TABELA;
    private int COLUNA_ID = 0;
    private int COLUNA_HORARIO_DA_IDA = 1;
    private int COLUNA_HORARIO_DA_VOLTA = 2;
    private int COLUNA_ID_LINHA_DE_ONIBUS = 3;
    private SQLiteDatabase database;

    public HorarioDaLinhaDeOnibusDAO(SQLiteDatabase database) {
        this.database = database;
    }

    public ArrayList<HorarioDaLinhaDeOnibus> obterTodosAondeLinhaDeOnibusE(long idLinhaDeOnibus) {
        StringBuilder sql = new StringBuilder();
        sql.append(" SELECT");
        sql.append("   *");
        sql.append(" FROM");
        sql.append("   " + NOME_DA_TABELA);
        sql.append(" WHERE");
        sql.append("   id_linha_de_onibus = " + idLinhaDeOnibus);

        Cursor cursor = this.database.rawQuery(sql.toString(), null);

        cursor.moveToFirst();
        ArrayList<HorarioDaLinhaDeOnibus> linhasDeOnibus = new ArrayList<HorarioDaLinhaDeOnibus>();
        for (int i = 0; i < cursor.getCount(); i++) {
            HorarioDaLinhaDeOnibus horarioDaLinhaDeOnibus = new HorarioDaLinhaDeOnibus();
            horarioDaLinhaDeOnibus.set_id(cursor.getLong(COLUNA_ID));
            horarioDaLinhaDeOnibus.setHorarioDaIda(cursor.getString(COLUNA_HORARIO_DA_IDA));
            horarioDaLinhaDeOnibus.setHorarioDaVolta(cursor.getString(COLUNA_HORARIO_DA_VOLTA));
            linhasDeOnibus.add(horarioDaLinhaDeOnibus);
            cursor.moveToNext();
        }
        cursor.close();
        return linhasDeOnibus;
    }
}
