class Funcionario extends Pessoa{
    // ATRIBUTOS
    private String cpf;
    private double salario;

    // CONSTRUTORES
    Funcionario(){
    }

    Funcionario(String nome, String endereco, String cpf, double salario){
        super(nome, endereco);
        this.cpf = cpf;
        this.salario = salario;
    }

    // MÉTODOS
    public String printaFunc(){
        String nomeEnde = printaTudo();
        String cpf = this.cpf;
        String salario = String.valueOf(this.salario);

        return nomeEnde +"\nCPF: " +cpf+ "\nSalario: R$" +salario;
    }

    // GETTERS
    public String getCpf(){
        return cpf;
    }

    public double getSalario(){
        return salario;
    }

    // SETTERS
    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }
}

