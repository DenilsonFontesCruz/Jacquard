package com.lv08.jacquard.util;

import java.util.List;

public interface Repository<E extends DomainEntity> {
  public void save(E entity);

  public void saveMany(List<E> entityList);

  public E findById();

  public List<E> findAll();
}
