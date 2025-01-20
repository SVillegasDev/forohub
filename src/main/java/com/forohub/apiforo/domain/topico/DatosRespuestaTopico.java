package com.forohub.apiforo.domain.topico;

import javax.swing.*;
import java.time.LocalDateTime;

public record DatosRespuestaTopico(Long id, String titulo, String mensaje, LocalDateTime fecha) {
}
