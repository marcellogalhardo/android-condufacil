package com.galhardo.marcello.livebus.model;


/**
 * Created by marcello on 26/11/14.
 */
public class LinhaDeOnibus {
    private long _id;
    private String nomeDaCompanhia;
    private String localDaIda;
    private String localDaVolta;

    public String getNomeDaLinha() {
        return localDaIda + " - " + localDaVolta;
    }

    public long get_id() {
        return _id;
    }

    public void set_id(long _id) {
        this._id = _id;
    }

    public String getNomeDaCompanhia() {
        return nomeDaCompanhia;
    }

    public void setNomeDaCompanhia(String nomeDaCompanhia) {
        this.nomeDaCompanhia = nomeDaCompanhia;
    }

    public String getLocalDaIda() {
        return localDaIda;
    }

    public void setLocalDaIda(String localDaIda) {
        this.localDaIda = localDaIda;
    }

    public String getLocalDaVolta() {
        return localDaVolta;
    }

    public void setLocalDaVolta(String localDaVolta) {
        this.localDaVolta = localDaVolta;
    }

}