package com.lv08.jacquard.util;

public abstract class Converter<E extends DomainEntity, M extends Model, D extends DTO> {

    public abstract E toEntity(M model);

    public abstract M toModel(E entity);

    public abstract M toModel(D dto);

    public abstract D toDTO(M model);

}
