package com.forohub.apiforo.domain.topico;

public record DatosListadoTopico(String titulo, String mensaje) {

    public DatosListadoTopico(Topico topico){
        this(topico.getTitulo(), topico.getMensaje());
    }
}
