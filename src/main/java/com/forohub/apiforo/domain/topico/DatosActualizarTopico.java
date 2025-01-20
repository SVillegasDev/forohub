package com.forohub.apiforo.domain.topico;

import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico(@NotNull Long id, String titulo, String mensaje, Long usuarioId) {

}
