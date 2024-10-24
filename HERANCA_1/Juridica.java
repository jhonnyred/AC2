class Juridica extends Pessoa{
    // ATRIBUTOS
    private String email;
    private String cnpj;

    // CONSTRUTORES
    Juridica(){
    }

    Juridica(String nome, String endereco, String email, String cnpj){
        super(nome, endereco);
        this.email = email;
        this.cnpj = cnpj;
    }

    // MÉTODOS
    @Override
    public String printaTudo(){
        String nomeEnde = super.printaTudo();
        String email = this.email;
        String cnpj = this.cnpj;

        return nomeEnde +"\nEmail: " +email+ "\nCNPJ: " +cnpj;
    }

    // GETTERS
    public String getEmail(){
        return email;
    }

    public String getCnpj(){
        return cnpj;
    }

    // SETTERS
    public void setEmail(String email){
        this.email = email;
    }

    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
}
