package packageOrientacao;

public class TesteFuncionario {
    public static void main(String[] args){
        //Referencia de um obj
        Funcionario func01 = new Funcionario();

        func01.nome = "Cr4zy_Py";
        func01.salario = 2500.00;

        //Referencia de um obj
        Funcionario func02 = new Funcionario();

        func02.nome = "FuriosDog";
        func02.salario = 3250.00;

        //Mostrando o conteudo atribuido aos Obj's instânciandos
        System.out.println("Funcionario: "+func01.nome+"\nSalario: "+func01.salario);
        System.out.println("-----------------------");
        System.out.println("Funcionario: "+func02.nome+"\nSalario: "+func02.salario);

        //Referencia de um obj
        Funcionario func03 = new Funcionario();

        //Utilizando os metodos
        func03.criarFuncionario("DestroctorZero", 2970.50);
        func03.aumentoDeSalario(570);

        func01.consultarDados();
    }
}
