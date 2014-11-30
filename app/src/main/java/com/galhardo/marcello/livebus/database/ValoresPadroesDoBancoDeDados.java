package com.galhardo.marcello.livebus.database;

import java.util.ArrayList;

public class ValoresPadroesDoBancoDeDados {
    public static ArrayList<String> obterInsertLinhaDeOnibus() {
        ArrayList<String> insertSql = new ArrayList<String>();
        insertSql.add("INSERT INTO " + LinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (0, 'Viação Teresópolis', 'Magé', 'Teresópolis');");
        insertSql.add("INSERT INTO " + LinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (1, 'Viação Teresópolis', 'Guapimirim', 'Teresópolis');");
        insertSql.add("INSERT INTO " + LinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (2, 'Viação Teresópolis', 'Niterói', 'Teresópolis');");
        insertSql.add("INSERT INTO " + LinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (3, 'Viação Teresópolis', 'Nova Iguaçu', 'Teresópolis');");
        insertSql.add("INSERT INTO " + LinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (4, 'Viação Reginas', 'Guapimirim', 'Central do Brasil');");
        insertSql.add("INSERT INTO " + LinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (5, 'Viação Reginas', 'Guapimirim', 'Castelo');");
        insertSql.add("INSERT INTO " + LinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (6, 'Viação Reginas', 'Guapimirim', 'Duque de Caxias');");
        insertSql.add("INSERT INTO " + LinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (7, 'Viação Reginas', 'Guapimirim', 'Praça Mauá');");
        return insertSql;
    }

    public static ArrayList<String> obterInsertHorarioDaLinhaDeOnibus() {
        ArrayList<String> insertSql = new ArrayList<String>();
        // Viação Teresópolis: Magé - Teresópolis
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '07:00 seg a sáb'  , '05:00 seg a sáb'  , 0);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '08:00 diário'     , '05:45 seg a sex*' , 0);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '09:00 diário'     , '06:00 diário'     , 0);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '11:00 diário'     , '07:30 seg a sáb'  , 0);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '13:00 diário'     , '09:30 diário'     , 0);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '15:00 diário'     , '10:30 diário'     , 0);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '16:00 diário'     , '12:30 diário'     , 0);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '17:00 seg a sab'  , '14:30 diário'     , 0);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '17:30 domingo'    , '15:30 diário'     , 0);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '18:30 seg a sáb'  , '17:15 diário'     , 0);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '19:30 diário'     , '18:00 diário'     , 0);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '22:00 diário'     , null               , 0);");

        // Viação Teresópolis: Guapimirim - Teresópolis
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '06:30 seg a sáb'  , '06:15 seg a sáb'  , 1);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '07:30 seg a sáb'  , '06:45 seg a sáb*' , 1);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '08:30 seg a sáb'  , '07:15 seg a sáb'  , 1);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '09:30 seg a sáb'  , '08:15 seg a sáb'  , 1);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '10:30 diário'     , '09:15 diário'     , 1);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '11:30 diário'     , '10:15 seg a sáb'  , 1);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '12:30 diário'     , '11:15 diário'     , 1);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '13:30 seg a sáb'  , '12:15 diário'     , 1);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '14:30 diário'     , '13:15 diário'     , 1);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '15:30 diário'     , '14:15 seg a sáb'  , 1);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '16:30 diário'     , '15:15 diário'     , 1);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '18:00 diário'     , '16:15 diário'     , 1);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '19:00 diário'     , '17:15 diário'     , 1);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '20:00 sáb e dom'  , '19:45 seg a sex'  , 1);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '21:00 seg a sex'  , '20:45 sáb e dom'  , 1);");

        // Viação Teresópolis: Niterói - Teresópolis
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '06:00 seg a sáb'  , '06:00 seg a sex'  , 2);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '07:00 diário*'    , '07:00 diário'     , 2);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '09:00 diário'     , '09:00 diário'     , 2);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '12:00 diário'     , '12:00 diário'     , 2);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '15:00 diário'     , '15:00 diário'     , 2);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '17:10 diário'     , '17:30 diário*'    , 2);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '19:00 diário'     , '19:00 seg a sáb'  , 2);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, null               , '19:15 domingo'    , 2);");

        // Viação Teresópolis: Nova Iguaçu - Teresópolis
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '06:00 diário'     , '09:00 diário'     , 3);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '14:45 diário'     , '18:00 diário'     , 3);");

        // Viação Reginas: Guapimirim - Central do Brasil
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '04:00 (reta)'     , '05:40'            , 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '04:25 (reta)'     , '06:20'            , 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '04:50'            , '07:10'            , 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '05:05'            , '07:40'            , 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '05:20'            , '08:10'            , 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '05:30'            , '08:30'            , 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '05:40'            , '08:50'            , 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '05:50'            , '09:20'            , 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '06:00'            , '09:50'            , 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '06:10'            , '10:20'            , 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '06:30'            , '11:00'            , 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '06:50'            , '11:40'            , 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '07:10'            , '12:10'            , 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '07:50'            , '12:40'            , 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '08:20'            , '13:10'            , 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '09:00'            , '13:40'            , 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '09:40'            , '14:00'            , 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '10:10'            , '14:10'            , 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '10:30'            , '14:20'            , 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '10:50'            , '14:40'            , 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '11:20'            , '15:10'            , 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '11:50'            , '15:30'            , 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '12:20'            , '16:00'            , 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '13:00'            , '16:30'            , 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '13:40'            , '17:00'            , 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '14:20'            , '17:20'            , 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '15:00'            , '17:30'            , 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '15:30'            , '18:00'            , 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '16:00'            , '18:20'            , 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '16:20'            , '18:40'            , 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '16:40'            , '19:00'            , 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '17:00'            , '19:30'            , 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '17:20'            , '20:00'            , 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '17:40'            , '20:30'            , 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '18:00'            , '21:00'            , 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '18:30'            , '22:00'            , 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '19:10'            , '23:00'            , 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '20:50'            , null               , 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '21:10'            , null               , 4);");

        // Viação Reginas: Guapimirim - Castelo
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '04:40'            , '06:20'            , 5);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '05:20'            , '07:00'            , 5);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '05:40'            , '08:00'            , 5);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '06:20'            , '14:10'            , 5);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '07:00'            , '15:10'            , 5);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '08:00'            , '16:10'            , 5);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '09:00'            , '16:40'            , 5);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '10:00'            , '17:15'            , 5);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '16:15'            , '18:20'            , 5);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '17:15'            , '19:15'            , 5);");

        // Viação Reginas: Guapimirim - Duque de Caxias
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '04:00'            , '06:00'            , 6);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '05:00'            , '07:00'            , 6);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '06:00'            , '08:00'            , 6);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '07:00'            , '09:00'            , 6);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '08:00'            , '13:00'            , 6);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '09:00'            , '13:40'            , 6);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '10:00'            , '14:20'            , 6);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '11:00'            , '15:00'            , 6);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '15:00'            , '17:00'            , 6);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '15:40'            , '17:40'            , 6);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '16:20'            , '18:20'            , 6);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '07:00'            , '19:00'            , 6);");

        // Viação Reginas: Guapimirim - Praça Mauá
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '06:30'            , '18:30'            , 7);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, null               , '19:10'            , 7);");

        return insertSql;
    }
}