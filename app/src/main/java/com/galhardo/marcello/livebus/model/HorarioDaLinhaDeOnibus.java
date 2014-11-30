package com.galhardo.marcello.livebus.model;

/**
 * Created by marcello on 26/11/14.
 */
public class HorarioDaLinhaDeOnibus {
    public static final int CIRCULAR = 0;
    public static final int IDA = 1;
    public static final int VOLTA = 2;
    private long _id;
    private String horario;
    private int tipo;

    public long get_id() {
        return _id;
    }

    public void set_id(long _id) {
        this._id = _id;
    }

    public String getHorario() {
        return this.horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

}
