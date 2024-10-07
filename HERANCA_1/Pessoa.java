class Pessoa{

    //ATRIBUTOS
    private String nome;
    private String endereco;

    // CONSTRUTORES
    Pessoa(){
    }

    Pessoa(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    // MÉTODOS
    protected String printaTudo(){
        String nome = this.nome;
        String endereco = this.endereco;

        return "\nNome: " +nome+ "\nEndereco: " +endereco;
    }

    // GETTERS
    public String getNome(){
        return nome;
    }

    public String getEndereco(){
        return endereco;
    }

    // SETTERS
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
}
