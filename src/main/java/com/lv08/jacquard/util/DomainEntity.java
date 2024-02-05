package com.lv08.jacquard.util;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@SuperBuilder
@EqualsAndHashCode
@Getter
public abstract class DomainEntity {

  private final UUID id;
}
