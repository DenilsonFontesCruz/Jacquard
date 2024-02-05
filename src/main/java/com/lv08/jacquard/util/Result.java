package com.lv08.jacquard.util;

import javax.management.OperationsException;
import lombok.Getter;


public class Result<T> {

  @Getter()
  private final boolean sucesso;
  @Getter()
  private final boolean falha;
  @Getter()
  private final String error;
  private final T valor;

  protected Result(boolean sucesso, String error, T valor) throws OperationsException {
    if (sucesso && !(error.isBlank())) {
      throw new OperationsException();
    }
    if (!sucesso && error.isBlank()) {
      throw new OperationsException();
    }

    this.sucesso = sucesso;
    this.falha = !sucesso;
    this.error = error;
    this.valor = valor;
  }

  public T getValor() throws OperationsException {
    if(this.falha && this.valor != null ) {
      throw new OperationsException();
    }
    return this.valor;
  }

  public static <K> Result<K> falha(String erroMensagem) throws OperationsException {
    return new Result<>(false, erroMensagem, null);
  }

  public static <K> Result<K> sucesso() throws OperationsException {
    return new Result<>(true, "", null);
  }

  public static <K> Result<K> sucesso(K valor) throws OperationsException {
    return new Result<>(true, "", valor);
  }

}
