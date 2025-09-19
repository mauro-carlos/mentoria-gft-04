package me.dio;

import me.dio.models.Endereco;
import me.dio.models.Gerente;
import me.dio.models.OperadorDeCaixa;
import me.dio.models.Vendedor;

public class Main {

  public static void main(String[] args) {
   /*Endereco endereco = new Endereco();
    endereco.setRua("Mario Palma");
    endereco.setBairro("Ribeirão do Lipa");
    System.out.println("endereco: " + endereco.getRua());
  */
    Endereco endereco = new Endereco("Rua Funcionario","Complemento endereco Funcionario","Bairro Funcionario");

    System.out.println("---------");

    Vendedor vendedor = new Vendedor();
    vendedor.setNome("Mauro Vendedor");
    vendedor.setDocumento("123.123.123-22");
    vendedor.setValorSalario(1000d);
    vendedor.setEndereco(endereco);
    vendedor.calculaBonificacao(2.0);
    System.out.println(vendedor);
    System.out.println("---------");

    OperadorDeCaixa operadorDeCaixa = new OperadorDeCaixa("Mauro Op Caixa", "789.456.123-00", 2000d,endereco);
    System.out.println(operadorDeCaixa);
    System.out.println("---------");

    Gerente gerente = new Gerente();
    gerente.setNome("Mauro Carlos");
    gerente.setDocumento("346.016.271-68");
    gerente.setEndereco(endereco);
    gerente.setHorasTrabalhadas(20);
    gerente.setValorHora(100d);
    gerente.calcularRemuneracao();
    gerente.calculaBonificacao(3d);
    System.out.println(gerente);










  }
}
