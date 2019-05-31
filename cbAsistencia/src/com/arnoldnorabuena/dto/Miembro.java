package com.arnoldnorabuena.dto;

public class Miembro {
    private Integer id;
    private String NroMatricula;
    private String DNI;
    private String ApellidoPaterno;
    private String ApellidoMaterno;
    private String Nombres;

    public Miembro() {
    }

    public Miembro(Integer id, String nroMatricula, String DNI, String apellidoPaterno, String apellidoMaterno, String nombres) {
        this.id = id;
        NroMatricula = nroMatricula;
        this.DNI = DNI;
        ApellidoPaterno = apellidoPaterno;
        ApellidoMaterno = apellidoMaterno;
        Nombres = nombres;
    }

    public Miembro(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNroMatricula() {
        return NroMatricula;
    }

    public void setNroMatricula(String nroMatricula) {
        NroMatricula = nroMatricula;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        ApellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return ApellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        ApellidoMaterno = apellidoMaterno;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }
}
