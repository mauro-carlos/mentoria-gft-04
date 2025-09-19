package me.dio.models;

public class OperadorDeCaixa extends FuncilnarioCLT {

  public OperadorDeCaixa() {
  }

  public OperadorDeCaixa(String nome, String documento, Double valorSalario, Endereco endereco) {
    super(documento, endereco, nome, valorSalario);
  }

  @Override
  public String toString() {
    return "OperadorDeCaixa{" +
      "documento='" + documento + '\'' +
      ", endereco=" + endereco.getRua() +
      ", nome='" + nome + '\'' +
      ", valorSalario=" + valorSalario +
      "} " + super.toString();
  }
}
