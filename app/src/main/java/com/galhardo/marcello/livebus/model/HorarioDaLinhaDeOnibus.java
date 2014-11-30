package com.galhardo.marcello.livebus.model;

/**
 * Created by marcello on 26/11/14.
 */
public class HorarioDaLinhaDeOnibus {
    public static final int CIRCULAR = 0;
    public static final int IDA = 1;
    public static final int VOLTA = 2;
    private long _id;
    private String horarioDaIda;
    private String HorarioDaVolta;

    public long get_id() {
        return _id;
    }

    public void set_id(long _id) {
        this._id = _id;
    }

    public String getHorarioDaVolta() {
        return HorarioDaVolta;
    }

    public void setHorarioDaVolta(String horarioDaVolta) {
        HorarioDaVolta = horarioDaVolta;
    }

    public String getHorarioDaIda() {
        return horarioDaIda;
    }

    public void setHorarioDaIda(String horarioDaIda) {
        this.horarioDaIda = horarioDaIda;
    }

}
