package com.arnoldnorabuena.dto;

import com.arnoldnorabuena.dao.MiembroDao;

import java.util.Date;

public class Marcacion {
    private Integer id;
    private Date FechaHora;
    private MiembroDao miembro;

    public Marcacion() {
    }

    public Marcacion(Integer id, Date fechaHora, MiembroDao miembro) {
        this.id = id;
        FechaHora = fechaHora;
        this.miembro = miembro;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaHora() {
        return FechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        FechaHora = fechaHora;
    }

    public MiembroDao getMiembro() {
        return miembro;
    }

    public void setMiembro(MiembroDao miembro) {
        this.miembro = miembro;
    }
}
