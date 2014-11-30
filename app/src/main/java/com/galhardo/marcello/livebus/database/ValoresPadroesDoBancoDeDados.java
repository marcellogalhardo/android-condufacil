package com.galhardo.marcello.livebus.database;

import com.galhardo.marcello.livebus.data_acess_object.HorarioDaLinhaDeOnibusDAO;
import com.galhardo.marcello.livebus.data_acess_object.LinhaDeOnibusDAO;
import com.galhardo.marcello.livebus.model.HorarioDaLinhaDeOnibus;
import com.galhardo.marcello.livebus.model.LinhaDeOnibus;

import java.util.ArrayList;

public class ValoresPadroesDoBancoDeDados {

    public static ArrayList<String> obterInsertLinhaDeOnibus() {
        ArrayList<String> insertSql = new ArrayList<String>();
        insertSql.add("INSERT INTO " + LinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (0, 'Viação Teresópolis', 'Teresópolis', 'Magé');");
        insertSql.add("INSERT INTO " + LinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (1, 'Viação Teresópolis', 'Teresópolis', 'Guapimirim');");
        insertSql.add("INSERT INTO " + LinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (2, 'Viação Teresópolis', 'Teresópolis', 'Niterói');");
        insertSql.add("INSERT INTO " + LinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (3, 'Viação Teresópolis', 'Teresópolis', 'Nova Iguaçu');");

        insertSql.add("INSERT INTO " + LinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (4, 'Viação Reginas', 'Guapimirim', 'Central do Brasil');");
        insertSql.add("INSERT INTO " + LinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (5, 'Viação Reginas', 'Guapimirim', 'Castelo');");
        insertSql.add("INSERT INTO " + LinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (6, 'Viação Reginas', 'Guapimirim', 'Duque de Caxias');");
        insertSql.add("INSERT INTO " + LinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (7, 'Viação Reginas', 'Guapimirim', 'Praça Mauá');");

        insertSql.add("INSERT INTO " + LinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (8, 'Viação Paraíso Verde', 'Barreira', 'Centro (via Parada Modelo)');");
        insertSql.add("INSERT INTO " + LinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (9, 'Viação Paraíso Verde', 'Barreira', 'Citrolândia');");
        insertSql.add("INSERT INTO " + LinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (10, 'Viação Paraíso Verde', 'Caneca Fina', 'Capim');");
        insertSql.add("INSERT INTO " + LinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (11, 'Viação Paraíso Verde', 'Capim', 'Caneca Fina');");
        insertSql.add("INSERT INTO " + LinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (12, 'Viação Paraíso Verde', 'Capim', 'Limoeiro');");
        insertSql.add("INSERT INTO " + LinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (13, 'Viação Paraíso Verde', 'Centro', 'Vila Olímpia');");
        insertSql.add("INSERT INTO " + LinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (14, 'Viação Paraíso Verde', 'Centro', 'Paraíso');");
        insertSql.add("INSERT INTO " + LinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (15, 'Viação Paraíso Verde', 'Citrolândia', 'Barreira');");
        insertSql.add("INSERT INTO " + LinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (16, 'Viação Paraíso Verde', 'Citrolândia', 'Tranca-Rua');");
        insertSql.add("INSERT INTO " + LinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (17, 'Viação Paraíso Verde', 'Km 11', 'Limoeiro');");
        insertSql.add("INSERT INTO " + LinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (18, 'Viação Paraíso Verde', 'Limoeiro', 'Capim');");
        insertSql.add("INSERT INTO " + LinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (19, 'Viação Paraíso Verde', 'Limoeiro', 'Paraíso');");
        insertSql.add("INSERT INTO " + LinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (20, 'Viação Paraíso Verde', 'Limeiro', 'Km 11');");
        insertSql.add("INSERT INTO " + LinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (21, 'Viação Paraíso Verde', 'Parada Modelo', 'Centro (via Prefeitura)');");
        insertSql.add("INSERT INTO " + LinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (22, 'Viação Paraíso Verde', 'Paraíso', 'Centro (via Prefeitura)');");
        insertSql.add("INSERT INTO " + LinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (23, 'Viação Paraíso Verde', 'Paraíso', 'Limoeiro');");
        insertSql.add("INSERT INTO " + LinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (24, 'Viação Paraíso Verde', 'Tranca-Rua', 'Citrolândia');");
        insertSql.add("INSERT INTO " + LinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (25, 'Viação Paraíso Verde', 'Vila Olímpia', 'Centro (via Prefeitura)');");
        insertSql.add("INSERT INTO " + LinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (26, 'Viação Paraíso Verde', 'Vila Olímpia', 'Centro (via Quinta Mariana)');");
        return insertSql;
    }

    public static ArrayList<String> obterInsertHorarioDaLinhaDeOnibus() {
        ArrayList<String> insertSql = new ArrayList<String>();
        // Viação Teresópolis: Teresópolis - Magé (IDA)
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '07:00 seg a sáb'  , " + HorarioDaLinhaDeOnibus.IDA + ", 0);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '08:00 diário'     , " + HorarioDaLinhaDeOnibus.IDA + ", 0);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '09:00 diário'     , " + HorarioDaLinhaDeOnibus.IDA + ", 0);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '11:00 diário'     , " + HorarioDaLinhaDeOnibus.IDA + ", 0);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '13:00 diário'     , " + HorarioDaLinhaDeOnibus.IDA + ", 0);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '15:00 diário'     , " + HorarioDaLinhaDeOnibus.IDA + ", 0);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '16:00 diário'     , " + HorarioDaLinhaDeOnibus.IDA + ", 0);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '17:00 seg a sab'  , " + HorarioDaLinhaDeOnibus.IDA + ", 0);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '17:30 domingo'    , " + HorarioDaLinhaDeOnibus.IDA + ", 0);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '18:30 seg a sáb'  , " + HorarioDaLinhaDeOnibus.IDA + ", 0);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '19:30 diário'     , " + HorarioDaLinhaDeOnibus.IDA + ", 0);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '22:00 diário'     , " + HorarioDaLinhaDeOnibus.IDA + ", 0);");

        // Viação Teresópolis: Teresópolis - Magé (VOLTA)
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '05:00 seg a sáb'  , " + HorarioDaLinhaDeOnibus.VOLTA + ", 0);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '05:45 seg a sex*' , " + HorarioDaLinhaDeOnibus.VOLTA + ", 0);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '06:00 diário'     , " + HorarioDaLinhaDeOnibus.VOLTA + ", 0);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '07:30 seg a sáb'  , " + HorarioDaLinhaDeOnibus.VOLTA + ", 0);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '09:30 diário'     , " + HorarioDaLinhaDeOnibus.VOLTA + ", 0);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '10:30 diário'     , " + HorarioDaLinhaDeOnibus.VOLTA + ", 0);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '12:30 diário'     , " + HorarioDaLinhaDeOnibus.VOLTA + ", 0);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '14:30 diário'     , " + HorarioDaLinhaDeOnibus.VOLTA + ", 0);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '15:30 diário'     , " + HorarioDaLinhaDeOnibus.VOLTA + ", 0);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '17:15 diário'     , " + HorarioDaLinhaDeOnibus.VOLTA + ", 0);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '18:00 diário'     , " + HorarioDaLinhaDeOnibus.VOLTA + ", 0);");

        // Viação Teresópolis: Teresópolis - Guapimirim (IDA)
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '06:30 seg a sáb'  , " + HorarioDaLinhaDeOnibus.IDA + ", 1);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '07:30 seg a sáb'  , " + HorarioDaLinhaDeOnibus.IDA + ", 1);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '08:30 seg a sáb'  , " + HorarioDaLinhaDeOnibus.IDA + ", 1);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '09:30 seg a sáb'  , " + HorarioDaLinhaDeOnibus.IDA + ", 1);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '10:30 diário'     , " + HorarioDaLinhaDeOnibus.IDA + ", 1);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '11:30 diário'     , " + HorarioDaLinhaDeOnibus.IDA + ", 1);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '12:30 diário'     , " + HorarioDaLinhaDeOnibus.IDA + ", 1);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '13:30 seg a sáb'  , " + HorarioDaLinhaDeOnibus.IDA + ", 1);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '14:30 diário'     , " + HorarioDaLinhaDeOnibus.IDA + ", 1);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '15:30 diário'     , " + HorarioDaLinhaDeOnibus.IDA + ", 1);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '16:30 diário'     , " + HorarioDaLinhaDeOnibus.IDA + ", 1);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '18:00 diário'     , " + HorarioDaLinhaDeOnibus.IDA + ", 1);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '19:00 diário'     , " + HorarioDaLinhaDeOnibus.IDA + ", 1);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '20:00 sáb e dom'  , " + HorarioDaLinhaDeOnibus.IDA + ", 1);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '21:00 seg a sex'  , " + HorarioDaLinhaDeOnibus.IDA + ", 1);");

        // Viação Teresópolis: Teresópolis - Guapimirim (VOLTA)
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '06:15 seg a sáb'  , " + HorarioDaLinhaDeOnibus.VOLTA + ", 1);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '06:45 seg a sáb'  , " + HorarioDaLinhaDeOnibus.VOLTA + ", 1);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '07:15 seg a sáb'  , " + HorarioDaLinhaDeOnibus.VOLTA + ", 1);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '08:15 seg a sáb'  , " + HorarioDaLinhaDeOnibus.VOLTA + ", 1);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '09:15 diário'     , " + HorarioDaLinhaDeOnibus.VOLTA + ", 1);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '10:15 seg a sáb'  , " + HorarioDaLinhaDeOnibus.VOLTA + ", 1);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '11:15 diário'     , " + HorarioDaLinhaDeOnibus.VOLTA + ", 1);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '12:15 diário'     , " + HorarioDaLinhaDeOnibus.VOLTA + ", 1);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '13:15 diário'     , " + HorarioDaLinhaDeOnibus.VOLTA + ", 1);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '14:15 seg a sáb'  , " + HorarioDaLinhaDeOnibus.VOLTA + ", 1);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '15:15 diário'     , " + HorarioDaLinhaDeOnibus.VOLTA + ", 1);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '16:15 diário'     , " + HorarioDaLinhaDeOnibus.VOLTA + ", 1);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '17:15 diário'     , " + HorarioDaLinhaDeOnibus.VOLTA + ", 1);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '19:45 seg a sex'  , " + HorarioDaLinhaDeOnibus.VOLTA + ", 1);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '20:45 sáb e dom'  , " + HorarioDaLinhaDeOnibus.VOLTA + ", 1);");

        // Viação Teresópolis: Teresópolis - Niterói (IDA)
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '06:00 seg a sáb'  , " + HorarioDaLinhaDeOnibus.IDA + ", 2);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '07:00 diário'     , " + HorarioDaLinhaDeOnibus.IDA + ", 2);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '09:00 diário'     , " + HorarioDaLinhaDeOnibus.IDA + ", 2);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '12:00 diário'     , " + HorarioDaLinhaDeOnibus.IDA + ", 2);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '15:00 diário'     , " + HorarioDaLinhaDeOnibus.IDA + ", 2);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '17:10 diário'     , " + HorarioDaLinhaDeOnibus.IDA + ", 2);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '19:00 diário'     , " + HorarioDaLinhaDeOnibus.IDA + ", 2);");

        // Viação Teresópolis: Teresópolis - Niterói (VOLTA)
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '06:00 seg a sex'  ," + HorarioDaLinhaDeOnibus.VOLTA + ", 2);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '07:00 diário'     ," + HorarioDaLinhaDeOnibus.VOLTA + ", 2);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '09:00 diário'     ," + HorarioDaLinhaDeOnibus.VOLTA + ", 2);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '12:00 diário'     ," + HorarioDaLinhaDeOnibus.VOLTA + ", 2);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '15:00 diário'     ," + HorarioDaLinhaDeOnibus.VOLTA + ", 2);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '17:30 diário'     ," + HorarioDaLinhaDeOnibus.VOLTA + ", 2);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '19:00 seg a sáb'  ," + HorarioDaLinhaDeOnibus.VOLTA + ", 2);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '19:15 domingo'    ," + HorarioDaLinhaDeOnibus.VOLTA + ", 2);");

        // Viação Teresópolis: Teresópolis - Nova Iguaçu (IDA)
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '06:00 diário'     , " + HorarioDaLinhaDeOnibus.IDA + ", 3);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '14:45 diário'     , " + HorarioDaLinhaDeOnibus.IDA + ", 3);");

        // Viação Teresópolis: Teresópolis - Nova Iguaçu (VOLTA)
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '09:00 diário'     , " + HorarioDaLinhaDeOnibus.VOLTA + ", 3);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '18:00 diário'     , " + HorarioDaLinhaDeOnibus.VOLTA + ", 3);");

        // Viação Reginas: Guapimirim - Central do Brasil (IDA)
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '04:00 (reta)'     , " + HorarioDaLinhaDeOnibus.IDA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '04:25 (reta)'     , " + HorarioDaLinhaDeOnibus.IDA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '04:50'            , " + HorarioDaLinhaDeOnibus.IDA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '05:05'            , " + HorarioDaLinhaDeOnibus.IDA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '05:20'            , " + HorarioDaLinhaDeOnibus.IDA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '05:30'            , " + HorarioDaLinhaDeOnibus.IDA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '05:40'            , " + HorarioDaLinhaDeOnibus.IDA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '05:50'            , " + HorarioDaLinhaDeOnibus.IDA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '06:00'            , " + HorarioDaLinhaDeOnibus.IDA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '06:10'            , " + HorarioDaLinhaDeOnibus.IDA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '06:30'            , " + HorarioDaLinhaDeOnibus.IDA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '06:50'            , " + HorarioDaLinhaDeOnibus.IDA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '07:10'            , " + HorarioDaLinhaDeOnibus.IDA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '07:50'            , " + HorarioDaLinhaDeOnibus.IDA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '08:20'            , " + HorarioDaLinhaDeOnibus.IDA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '09:00'            , " + HorarioDaLinhaDeOnibus.IDA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '09:40'            , " + HorarioDaLinhaDeOnibus.IDA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '10:10'            , " + HorarioDaLinhaDeOnibus.IDA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '10:30'            , " + HorarioDaLinhaDeOnibus.IDA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '10:50'            , " + HorarioDaLinhaDeOnibus.IDA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '11:20'            , " + HorarioDaLinhaDeOnibus.IDA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '11:50'            , " + HorarioDaLinhaDeOnibus.IDA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '12:20'            , " + HorarioDaLinhaDeOnibus.IDA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '13:00'            , " + HorarioDaLinhaDeOnibus.IDA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '13:40'            , " + HorarioDaLinhaDeOnibus.IDA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '14:20'            , " + HorarioDaLinhaDeOnibus.IDA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '15:00'            , " + HorarioDaLinhaDeOnibus.IDA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '15:30'            , " + HorarioDaLinhaDeOnibus.IDA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '16:00'            , " + HorarioDaLinhaDeOnibus.IDA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '16:20'            , " + HorarioDaLinhaDeOnibus.IDA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '16:40'            , " + HorarioDaLinhaDeOnibus.IDA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '17:00'            , " + HorarioDaLinhaDeOnibus.IDA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '17:20'            , " + HorarioDaLinhaDeOnibus.IDA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '17:40'            , " + HorarioDaLinhaDeOnibus.IDA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '18:00'            , " + HorarioDaLinhaDeOnibus.IDA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '18:30'            , " + HorarioDaLinhaDeOnibus.IDA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '19:10'            , " + HorarioDaLinhaDeOnibus.IDA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '20:50'            , " + HorarioDaLinhaDeOnibus.IDA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '21:10'            , " + HorarioDaLinhaDeOnibus.IDA + ", 4);");

        // Viação Reginas: Guapimirim - Central do Brasil (VOLTA)
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '05:40'            , " + HorarioDaLinhaDeOnibus.VOLTA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '06:20'            , " + HorarioDaLinhaDeOnibus.VOLTA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '07:10'            , " + HorarioDaLinhaDeOnibus.VOLTA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '07:40'            , " + HorarioDaLinhaDeOnibus.VOLTA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '08:10'            , " + HorarioDaLinhaDeOnibus.VOLTA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '08:30'            , " + HorarioDaLinhaDeOnibus.VOLTA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '08:50'            , " + HorarioDaLinhaDeOnibus.VOLTA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '09:20'            , " + HorarioDaLinhaDeOnibus.VOLTA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '09:50'            , " + HorarioDaLinhaDeOnibus.VOLTA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '10:20'            , " + HorarioDaLinhaDeOnibus.VOLTA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '11:00'            , " + HorarioDaLinhaDeOnibus.VOLTA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '11:40'            , " + HorarioDaLinhaDeOnibus.VOLTA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '12:10'            , " + HorarioDaLinhaDeOnibus.VOLTA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '12:40'            , " + HorarioDaLinhaDeOnibus.VOLTA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '13:10'            , " + HorarioDaLinhaDeOnibus.VOLTA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '13:40'            , " + HorarioDaLinhaDeOnibus.VOLTA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '14:00'            , " + HorarioDaLinhaDeOnibus.VOLTA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '14:10'            , " + HorarioDaLinhaDeOnibus.VOLTA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '14:20'            , " + HorarioDaLinhaDeOnibus.VOLTA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '14:40'            , " + HorarioDaLinhaDeOnibus.VOLTA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '15:10'            , " + HorarioDaLinhaDeOnibus.VOLTA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '15:30'            , " + HorarioDaLinhaDeOnibus.VOLTA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '16:00'            , " + HorarioDaLinhaDeOnibus.VOLTA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '16:30'            , " + HorarioDaLinhaDeOnibus.VOLTA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '17:00'            , " + HorarioDaLinhaDeOnibus.VOLTA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '17:20'            , " + HorarioDaLinhaDeOnibus.VOLTA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '17:30'            , " + HorarioDaLinhaDeOnibus.VOLTA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '18:00'            , " + HorarioDaLinhaDeOnibus.VOLTA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '18:20'            , " + HorarioDaLinhaDeOnibus.VOLTA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '18:40'            , " + HorarioDaLinhaDeOnibus.VOLTA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '19:00'            , " + HorarioDaLinhaDeOnibus.VOLTA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '19:30'            , " + HorarioDaLinhaDeOnibus.VOLTA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '20:00'            , " + HorarioDaLinhaDeOnibus.VOLTA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '20:30'            , " + HorarioDaLinhaDeOnibus.VOLTA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '21:00'            , " + HorarioDaLinhaDeOnibus.VOLTA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '22:00'            , " + HorarioDaLinhaDeOnibus.VOLTA + ", 4);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '23:00'            , " + HorarioDaLinhaDeOnibus.VOLTA + ", 4);");

        // Viação Reginas: Guapimirim - Castelo (IDA)
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '04:40'            , " + HorarioDaLinhaDeOnibus.IDA + ", 5);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '05:20'            , " + HorarioDaLinhaDeOnibus.IDA + ", 5);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '05:40'            , " + HorarioDaLinhaDeOnibus.IDA + ", 5);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '06:20'            , " + HorarioDaLinhaDeOnibus.IDA + ", 5);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '07:00'            , " + HorarioDaLinhaDeOnibus.IDA + ", 5);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '08:00'            , " + HorarioDaLinhaDeOnibus.IDA + ", 5);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '09:00'            , " + HorarioDaLinhaDeOnibus.IDA + ", 5);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '10:00'            , " + HorarioDaLinhaDeOnibus.IDA + ", 5);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '16:15'            , " + HorarioDaLinhaDeOnibus.IDA + ", 5);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '17:15'            , " + HorarioDaLinhaDeOnibus.IDA + ", 5);");

        // Viação Reginas: Guapimirim - Castelo (VOLTA)
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '06:20'            , " + HorarioDaLinhaDeOnibus.VOLTA + ", 5);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '07:00'            , " + HorarioDaLinhaDeOnibus.VOLTA + ", 5);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '08:00'            , " + HorarioDaLinhaDeOnibus.VOLTA + ", 5);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '14:10'            , " + HorarioDaLinhaDeOnibus.VOLTA + ", 5);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '15:10'            , " + HorarioDaLinhaDeOnibus.VOLTA + ", 5);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '16:10'            , " + HorarioDaLinhaDeOnibus.VOLTA + ", 5);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '16:40'            , " + HorarioDaLinhaDeOnibus.VOLTA + ", 5);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '17:15'            , " + HorarioDaLinhaDeOnibus.VOLTA + ", 5);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '18:20'            , " + HorarioDaLinhaDeOnibus.VOLTA + ", 5);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '19:15'            , " + HorarioDaLinhaDeOnibus.VOLTA + ", 5);");

        // Viação Reginas: Guapimirim - Duque de Caxias (IDA)
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '04:00'            , " + HorarioDaLinhaDeOnibus.IDA + ", 6);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '05:00'            , " + HorarioDaLinhaDeOnibus.IDA + ", 6);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '06:00'            , " + HorarioDaLinhaDeOnibus.IDA + ", 6);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '07:00'            , " + HorarioDaLinhaDeOnibus.IDA + ", 6);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '08:00'            , " + HorarioDaLinhaDeOnibus.IDA + ", 6);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '09:00'            , " + HorarioDaLinhaDeOnibus.IDA + ", 6);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '10:00'            , " + HorarioDaLinhaDeOnibus.IDA + ", 6);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '11:00'            , " + HorarioDaLinhaDeOnibus.IDA + ", 6);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '15:00'            , " + HorarioDaLinhaDeOnibus.IDA + ", 6);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '15:40'            , " + HorarioDaLinhaDeOnibus.IDA + ", 6);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '16:20'            , " + HorarioDaLinhaDeOnibus.IDA + ", 6);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '07:00'            , " + HorarioDaLinhaDeOnibus.IDA + ", 6);");

        // Viação Reginas: Guapimirim - Duque de Caxias (VOLTA)
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '06:00'            , " + HorarioDaLinhaDeOnibus.VOLTA + ", 6);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '07:00'            , " + HorarioDaLinhaDeOnibus.VOLTA + ", 6);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '08:00'            , " + HorarioDaLinhaDeOnibus.VOLTA + ", 6);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '09:00'            , " + HorarioDaLinhaDeOnibus.VOLTA + ", 6);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '13:00'            , " + HorarioDaLinhaDeOnibus.VOLTA + ",6);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '13:40'            , " + HorarioDaLinhaDeOnibus.VOLTA + ",6);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '14:20'            , " + HorarioDaLinhaDeOnibus.VOLTA + ",6);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '15:00'            , " + HorarioDaLinhaDeOnibus.VOLTA + ",6);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '17:00'            , " + HorarioDaLinhaDeOnibus.VOLTA + ",6);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '17:40'            , " + HorarioDaLinhaDeOnibus.VOLTA + ",6);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '18:20'            , " + HorarioDaLinhaDeOnibus.VOLTA + ",6);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '19:00'            , " + HorarioDaLinhaDeOnibus.VOLTA + ",6);");

        // Viação Reginas: Guapimirim - Praça Mauá (IDA)
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '06:30'            , " + HorarioDaLinhaDeOnibus.IDA + ", 7);");

        // Viação Reginas: Guapimirim - Praça Mauá (VOLTA)
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '18:30'            , " + HorarioDaLinhaDeOnibus.VOLTA + ", 7);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '19:10'            , " + HorarioDaLinhaDeOnibus.VOLTA + ", 7);");

        // Viação Paraíso Verde: Barreira - Centro (via Parada Modelo) (CIRCULAR)
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '08:40'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 8);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '10:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 8);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '11:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 8);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '12:40'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 8);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '14:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 8);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '15:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 8);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '19:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 8);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '20:40'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 8);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '22:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 8);");

        // Viação Paraíso Verde: Barreira - Citrolândia (CIRCULAR)
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '06:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 9);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '07:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 9);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '08:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 9);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '16:40'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 9);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '17:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 9);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '18:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 9);");

        // Viação Paraíso Verde: Caneca Fina - Capim (CIRCULAR)
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '06:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 10);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '06:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 10);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '06:40'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 10);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '07:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 10);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '07:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 10);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '07:40'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 10);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '08:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 10);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '08:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 10);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '08:40'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 10);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '09:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 10);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '09:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 10);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '09:40'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 10);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '10:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 10);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '10:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 10);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '10:40'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 10);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '11:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 10);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '11:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 10);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '11:40'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 10);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '12:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 10);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '12:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 10);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '12:40'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 10);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '13:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 10);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '13:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 10);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '13:40'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 10);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '14:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 10);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '14:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 10);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '14:40'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 10);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '15:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 10);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '15:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 10);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '15:40'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 10);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '16:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 10);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '16:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 10);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '16:40'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 10);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '17:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 10);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '17:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 10);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '17:40'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 10);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '18:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 10);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '18:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 10);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '18:40'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 10);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '19:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 10);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '19:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 10);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '19:40'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 10);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '20:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 10);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '20:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 10);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '20:40'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 10);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '21:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 10);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '21:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 10);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '21:40'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 10);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '22:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 10);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '22:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 10);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '22:40'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 10);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '23:10'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 10);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '23:30'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 10);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '00:30'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 10);");

        // Viação Paraíso Verde: Capim - Caneca Fina (CIRCULAR)
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '05:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 11);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '05:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 11);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '05:40'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 11);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '06:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 11);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '06:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 11);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '06:40'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 11);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '07:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 11);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '07:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 11);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '07:40'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 11);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '08:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 11);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '08:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 11);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '08:40'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 11);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '09:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 11);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '09:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 11);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '09:40'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 11);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '10:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 11);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '10:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 11);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '10:40'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 11);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '11:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 11);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '11:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 11);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '11:40'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 11);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '12:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 11);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '12:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 11);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '12:40'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 11);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '13:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 11);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '13:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 11);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '13:40'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 11);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '14:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 11);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '14:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 11);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '14:40'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 11);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '15:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 11);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '15:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 11);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '15:40'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 11);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '16:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 11);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '16:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 11);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '16:40'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 11);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '17:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 11);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '17:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 11);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '17:40'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 11);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '18:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 11);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '18:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 11);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '18:40'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 11);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '19:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 11);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '19:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 11);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '19:40'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 11);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '20:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 11);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '20:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 11);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '20:40'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 11);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '21:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 11);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '21:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 11);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '21:40'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 11);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '22:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 11);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '22:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 11);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '20:40'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 11);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '23:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 11);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '24:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 11);");

        // Viação Paraíso Verde: Capim - Limoeiro (CIRCULAR)
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '09:35'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 12);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '11:35'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 12);");


        // Viação Paraíso Verde: Centro - Vila Olímpia (CIRCULAR)
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '06:30'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 13);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '12:10'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 13);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '17:10'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 13);");

        // Viação Paraíso Verde: Centro - Paraiso (CIRCULAR)
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '05:30'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 14);");

        // Viação Paraíso Verde: Citrolândia - Barreira (CIRCULAR)
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '06:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 15);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '07:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 15);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '07:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 15);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '16:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 15);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '17:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 15);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '18:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 15);");

        // Viação Paraíso Verde: Citrolândia - Tranca-Rua (CIRCULAR)
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '08:40'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 16);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '09:30'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 16);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '10:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 16);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '11:10'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 16);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '12:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 16);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '12:50'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 16);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '13:40'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 16);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '14:30'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 16);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '15:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 16);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '18:50'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 16);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '19:30'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 16);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '20:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 16);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '21:10'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 16);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '22:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 16);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '22:50'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 16);");

        // Viação Paraíso Verde: Km 11 - Limoeiro (CIRCULAR)
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '08:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 17);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '13:10'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 17);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '20:10'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 17);");

        // Viação Paraíso Verde: Limoeiro - Capim (CIRCULAR)
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '09:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 18);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '21:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 18);");

        // Viação Paraíso Verde: Limoeiro - Paraiso (CIRCULAR)
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '10:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 19);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '14:10'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 19);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '17:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 19);");

        // Viação Paraíso Verde: Limoeiro - Km 11 (CIRCULAR)
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '07:30'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 20);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '12:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 20);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '19:40'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 20);");

        // Viação Paraíso Verde: Limoeiro - Km 11 (CIRCULAR)
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '07:30'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 20);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '12:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 20);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '19:40'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 20);");

        // Viação Paraíso Verde: Parada Modelo - Centro (via Prefeitura) (CIRCULAR)
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '07:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 21);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '08:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 21);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '09:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 21);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '10:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 21);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '11:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 21);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '12:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 21);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '13:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 21);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '14:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 21);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '15:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 21);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '16:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 21);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '17:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 21);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '18:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 21);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '19:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 21);");

        // Viação Paraíso Verde: Paraíso - Centro (Via Prefeitura) (CIRCULAR)
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '06:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 22);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '11:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 22);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '15:30'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 22);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '18:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 22);");

        // Viação Paraíso Verde: Paraíso - Limoeiro (CIRCULAR)
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '06:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 23);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '11:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 23);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '15:30'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 23);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '18:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 23);");

        // Viação Paraíso Verde: Paraíso - Limoeiro (CIRCULAR)
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '06:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 24);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '09:30'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 24);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '10:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 24);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '11:10'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 24);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '12:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 24);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '12:50'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 24);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '13:40'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 24);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '14:30'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 24);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '15:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 24);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '16:10'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 24);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '19:30'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 24);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '20:20'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 24);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '21:10'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 24);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '22:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 24);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '22:50'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 24);");

        // Viação Paraíso Verde: Vila Olímpia - Centro (via Prefeitura) (CIRCULAR)
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '07:30'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 25);");

        // Viação Paraíso Verde: Vila Olímpia - Centro (via Quinta Mariana) (CIRCULAR)
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '13:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 26);");
        insertSql.add("INSERT INTO " + HorarioDaLinhaDeOnibusDAO.NOME_DA_TABELA + " VALUES (null, '18:00'            , " + HorarioDaLinhaDeOnibus.CIRCULAR + ", 26);");

        return insertSql;
    }
}