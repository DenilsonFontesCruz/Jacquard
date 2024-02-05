package com.lv08.jacquard.util;

import java.time.LocalDateTime;
import java.util.UUID;

public abstract class Model {
    private UUID id;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataAtualizacao;
}
