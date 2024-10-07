class Fisica extends Pessoa{
    // ATRIBUTOS
    private String email;
    private String cpf;

    // CONSTRUTORES
    Fisica(){
    }

    Fisica(String nome, String endereco, String email, String cpf){
        super(nome, endereco);
        this.email = email;
        this.cpf = cpf;
    }

    // MÉTODOS
    public String printaFisica(){
        String nomeEnde = printaTudo();
        String email = this.email;
        String cpf = this.cpf;
        return nomeEnde+ "\nEmail: " +email+ "\nCPF: " +cpf;
    }

    // GETTERS
    public String getEmail(){
        return email;
    }

    public String getCpf(){
        return cpf;
    }

    // SETTERS
    public void setEmail(String email){
        this.email = email;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }
}
