package com.example.pmdm_ejemplo_examen_t1_rfef.modelos;

public class Partido {

    String nombreEquipoLocal;
    int golesEquipoLocal;
    String nombreEquipoVisitante;
    int golesEquipoVisitante;
    String resumen;

    public Partido(String nombreEquipoLocal, int golesEquipoLocal, String nombreEquipoVisitante, int golesEquipoVisitante, String resumen) {
        this.nombreEquipoLocal = nombreEquipoLocal;
        this.golesEquipoLocal = golesEquipoLocal;
        this.nombreEquipoVisitante = nombreEquipoVisitante;
        this.golesEquipoVisitante = golesEquipoVisitante;
        this.resumen = resumen;
    }

    public String getNombreEquipoLocal() {
        return nombreEquipoLocal;
    }

    public void setNombreEquipoLocal(String nombreEquipoLocal) {
        this.nombreEquipoLocal = nombreEquipoLocal;
    }

    public int getGolesEquipoLocal() {
        return golesEquipoLocal;
    }

    public void setGolesEquipoLocal(int golesEquipoLocal) {
        this.golesEquipoLocal = golesEquipoLocal;
    }

    public String getNombreEquipoVisitante() {
        return nombreEquipoVisitante;
    }

    public void setNombreEquipoVisitante(String nombreEquipoVisitante) {
        this.nombreEquipoVisitante = nombreEquipoVisitante;
    }

    public int getGolesEquipoVisitante() {
        return golesEquipoVisitante;
    }

    public void setGolesEquipoVisitante(int golesEquipoVisitante) {
        this.golesEquipoVisitante = golesEquipoVisitante;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    @Override
    public String toString() {
        return "Partido{" +
                "nombreEquipoLocal='" + nombreEquipoLocal + '\'' +
                ", golesEquipoLocal=" + golesEquipoLocal +
                ", nombreEquipoVisitante='" + nombreEquipoVisitante + '\'' +
                ", golesEquipoVisitante=" + golesEquipoVisitante +
                ", resumen='" + resumen + '\'' +
                '}';
    }
}
