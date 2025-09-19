package me.dio.models;

public abstract class FuncionarioPJ {
  private String nome;
  private String documento;
  private Endereco endereco;
  private Integer horasTrabalhadas;
  private Double valorHora;
  private Double ValorRemuneracao;

  public void calcularRemuneracao() {
    this.ValorRemuneracao = this.horasTrabalhadas * this.valorHora;
  }

  public String getDocumento() {
    return documento;
  }

  public void setDocumento(String documento) {
    this.documento = documento;
  }

  public Endereco getEndereco() {
    return endereco;
  }

  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }

  public Integer getHorasTrabalhadas() {
    return horasTrabalhadas;
  }

  public void setHorasTrabalhadas(Integer horasTrabalhadas) {
    this.horasTrabalhadas = horasTrabalhadas;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Double getValorHora() {
    return valorHora;
  }

  public void setValorHora(Double valorHora) {
    this.valorHora = valorHora;
  }

  public Double getValorRemuneracao() {
    return ValorRemuneracao;
  }

  public void setValorRemuneracao(Double valorRemuneracao) {
    ValorRemuneracao = valorRemuneracao;
  }


}
