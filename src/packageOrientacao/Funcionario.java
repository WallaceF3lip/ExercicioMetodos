package packageOrientacao;

public class Funcionario {
    String nome;
    double salario;

    public void criarFuncionario (String nome, double salario){
        this.nome = nome;
        this.salario = salario;

        consultarDados();
    }

    public void aumentoDeSalario (double valorDeAumento) {
        this.salario += valorDeAumento;

        System.out.println("Salario atual do(a) "+this.nome+" é de R$"+this.salario);
    }

    public void consultarDados () {
        System.out.println("-----------------------");
        System.out.println("Funcionario: "+this.nome+"\nSalario: "+this.salario);
        System.out.println("-----------------------");
    }

}
