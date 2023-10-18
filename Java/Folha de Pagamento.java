// Folha de pagamento 
//DESCRIÇÃO


// Uma determinada empresa armazena, para cada funcionário, uma ficha contendo: o código, o nome, o número de horas trabalhadas e o número de dependentes.
// Considerando que a empresa paga 12 reais por hora trabalhada e 40 reais de auxílio escolar por dependente. E considerando que, sobre o salário bruto, são descontados 8,5% de previdência social (INSS) e 5% de imposto de renda.
// Faça um programa que leia produza a folha de pagamento da empresa.

// Entrada
// O arquivo de entrada contém um valor inteiro N (0 <= N < 100) que representa o número total de funcionários da empresa. As N linhas seguintes contém três valores inteiros correspondentes ao código do funcionário, o número de horas trabalhadas e o número de dependentes.

// Saída
// Para cada funcionário, escreva o código do funcionário, o valor do salário bruto, o valor total dos descontos e o valor do salário líquido.


import java.util.Scanner;

class Funcionario {       
  int codigo;
  int nDependentes;
  int horasTrabalhadas;
  double salarioBruto;
  double salarioLiquido;
  double descontos;
  
  void salario(){ 
    this.salarioBruto = (this.horasTrabalhadas * 12) + (this.nDependentes * 40);
    this.descontos = (13.5 / 100) * salarioBruto;
    this.salarioLiquido = this.salarioBruto - this.descontos;
  }
}

class Main {
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int nFuncionarios, i;
    
    nFuncionarios = scan.nextInt();
    
    for(i = 0; i < nFuncionarios; i++) {
      Funcionario funcionario = new Funcionario();
      funcionario.codigo = scan.nextInt();
      funcionario.horasTrabalhadas = scan.nextInt();
      funcionario.nDependentes = scan.nextInt();
      funcionario.salario();
      
      System.out.printf("%d %.2f %.2f %.2f\n", funcionario.codigo, funcionario.salarioBruto, funcionario.descontos, funcionario.salarioLiquido);
    }
  }
  
}