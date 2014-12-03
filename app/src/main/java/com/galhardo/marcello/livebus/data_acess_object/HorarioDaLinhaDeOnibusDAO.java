package com.galhardo.marcello.livebus.data_acess_object;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import com.galhardo.marcello.livebus.model.HorarioDaLinhaDeOnibus;

import java.util.ArrayList;

/**
 * Created by marcello on 27/11/14.
 */
public class HorarioDaLinhaDeOnibusDAO {

    public static String NOME_DA_TABELA = "horario_da_linha_de_onibus";
    public static String CREATE_SCRIPT = " CREATE TABLE " + NOME_DA_TABELA
                                       + " ("
                                       + "    _id INTEGER PRIMARY KEY"
                                       + "   ,horario TEXT"
                                       + "   ,tipo INTEGER"
                                       + "   ,id_linha_de_onibus"
                                       + " )";
    public static String DROP_SCRIPT = "DROP TABLE IF EXISTS " + NOME_DA_TABELA;
    private int COLUNA_ID = 0;
    private int COLUNA_HORARIO = 1;
    private int COLUNA_TIPO = 2;
    private int COLUNA_ID_LINHA_DE_ONIBUS = 3;
    private SQLiteDatabase database;

    public HorarioDaLinhaDeOnibusDAO(SQLiteDatabase database) {
        this.database = database;
    }

    public ArrayList<HorarioDaLinhaDeOnibus> obterTodosOsHorariosDeIdaAondeLinhaDeOnibusE(long idLinhaDeOnibus) {
        String sql = " SELECT"
                   + "   *"
                   + " FROM"
                   + "   " + NOME_DA_TABELA
                   + " WHERE"
                   + "       id_linha_de_onibus = " + idLinhaDeOnibus
                   + "   AND tipo = " + HorarioDaLinhaDeOnibus.IDA;

        return obterTodosOsHorariosAondeLinhaDeOnibusE(sql);
    }

    public ArrayList<HorarioDaLinhaDeOnibus> obterTodosOsHorariosDeVoltaAondeLinhaDeOnibusE(long idLinhaDeOnibus) {
        String sql = " SELECT"
                   + "   *"
                   + " FROM"
                   + "   " + NOME_DA_TABELA
                   + " WHERE"
                   + "       id_linha_de_onibus = " + idLinhaDeOnibus
                   + "   AND tipo = " + HorarioDaLinhaDeOnibus.VOLTA;

        return obterTodosOsHorariosAondeLinhaDeOnibusE(sql);
    }

    public ArrayList<HorarioDaLinhaDeOnibus> obterTodosOsHorariosCircularAondeLinhaDeOnibusE(long idLinhaDeOnibus) {
        String sql = " SELECT"
                + "   *"
                + " FROM"
                + "   " + NOME_DA_TABELA
                + " WHERE"
                + "       id_linha_de_onibus = " + idLinhaDeOnibus
                + "   AND tipo = " + HorarioDaLinhaDeOnibus.CIRCULAR;

        return obterTodosOsHorariosAondeLinhaDeOnibusE(sql);
    }

    private ArrayList<HorarioDaLinhaDeOnibus> obterTodosOsHorariosAondeLinhaDeOnibusE(String sql) {
        Cursor cursor = this.database.rawQuery(sql, null);
        cursor.moveToFirst();
        ArrayList<HorarioDaLinhaDeOnibus> linhasDeOnibus = new ArrayList<HorarioDaLinhaDeOnibus>();
        for (int i = 0; i < cursor.getCount(); i++) {
            HorarioDaLinhaDeOnibus horarioDaLinhaDeOnibus = new HorarioDaLinhaDeOnibus();
            horarioDaLinhaDeOnibus.set_id(cursor.getLong(COLUNA_ID));
            horarioDaLinhaDeOnibus.setHorario(cursor.getString(COLUNA_HORARIO));
            horarioDaLinhaDeOnibus.setTipo(cursor.getInt(COLUNA_TIPO));
            linhasDeOnibus.add(horarioDaLinhaDeOnibus);
            cursor.moveToNext();
        }
        cursor.close();
        return linhasDeOnibus;
    }
}
