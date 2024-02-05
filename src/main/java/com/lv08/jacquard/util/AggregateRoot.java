package com.lv08.jacquard.util;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

@SuperBuilder
@Getter
public class AggregateRoot extends DomainEntity {

  private final List<DomainEvent> domainEvents = new ArrayList<DomainEvent>();

  public void adicionarDomainEvent(DomainEvent event) {
    this.domainEvents.add(event);
  }

  public void removerDomainEvent(DomainEvent event) {
    this.domainEvents.remove(event);
  }

  public void limparDomainEvents() {
    this.domainEvents.clear();
  }

}
