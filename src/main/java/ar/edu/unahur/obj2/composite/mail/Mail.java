package ar.edu.unahur.obj2.composite.mail;

import ar.edu.unahur.obj2.composite.agrupable.*;
import ar.edu.unahur.obj2.composite.filtros.*;

public class Mail {
    private String from;
    private String to;
    private String asunto;
    private Integer tamanio;
    private Boolean tieneAdjunto;
    private String cuerpo;
    // usamos composite
    private Agrupable filtro; 

    public Mail(String from, String to, String asunto, Integer tamanio,Boolean adjunto, String cuerpo) {
        this.from = from;
        this.to = to;
        this.asunto = asunto;
        this.tamanio = tamanio;
        this.tieneAdjunto = adjunto;
        this.cuerpo = cuerpo;

        // hay que pasarle un minimo filtro
        filtro = new DefaultFiltroSimple(this);
    }

    public Boolean aplicarFiltro() {
        return filtro.aplicar();
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getAsunto() {
        return asunto;
    }

    public Integer getTamanio() {
        return tamanio;
    }

    public Boolean getTieneAdjunto() {
        return tieneAdjunto;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public Agrupable getFiltro() {
        return filtro;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public void setFiltro(Agrupable filtro) {
        this.filtro = filtro;
    }

    
}
