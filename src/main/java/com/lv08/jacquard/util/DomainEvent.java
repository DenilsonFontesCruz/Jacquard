package com.lv08.jacquard.util;

import java.util.Date;

public interface DomainEvent {

  public Date getDataCriacao();

  public DTO getDados();
}
