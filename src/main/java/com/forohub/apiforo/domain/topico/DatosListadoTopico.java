package com.forohub.apiforo.domain.topico;

import java.time.LocalDateTime;

public record DatosListadoTopico(String titulo, String mensaje, LocalDateTime fecha, Long UsuarioId) {

    public DatosListadoTopico(Topico topico){
        this(topico.getTitulo(), topico.getMensaje(), topico.getFecha(), topico.getUsuario().getId());
    }
}
