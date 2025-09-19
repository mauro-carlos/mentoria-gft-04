package me.dio.models;

public class Endereco {
  private String rua;
  private String complemento;
  private String bairro;

  public Endereco(String rua, String complemento, String bairro) {
    this.bairro = bairro;
    this.complemento = complemento;
    this.rua = rua;
  }

  public Endereco() {
  }

  public String getBairro() {
    return bairro;
  }

  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  public String getComplemento() {
    return complemento;
  }

  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  public String getRua() {
    return rua;
  }

  public void setRua(String rua) {
    this.rua = rua;
  }

  @Override
  public String toString() {
    return "Endereco{" +
      "bairro='" + bairro + '\'' +
      ", rua='" + rua + '\'' +
      ", complemento='" + complemento + '\'' +
      '}';
  }
}
