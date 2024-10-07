class Vendedor extends Funcionario{
    // ATRIBUTOS
    private double comissao;

    // CONSTRUTORES
    Vendedor(){
    }

    Vendedor(String nome, String cpf, String nascimento, String contratacao, double salario, double comissao){
        super(nome, cpf, nascimento, contratacao, salario);
        this.comissao = comissao;
    }

    // MÉTODOS
    protected String printVend(){
        String funcionario = printFunc();
        String comissao = String.valueOf(this.comissao);

        return funcionario+ "\nComissao: " +comissao+ "%";
    }

    // GETTERS
    public double getComissao(){
        return comissao;
    }

    // SETTERS
    public void setComissao(double comissao){
        this.comissao = comissao;
    }
}