class Automotor extends Veiculo{
    // ATRIBUTOS
    private String montadora;
    private String cor;
    private double kilometragem;


    // CONSTRUTORES
    Automotor(){
    }

    Automotor(String modelo, String fabricacao, String montadora, String cor, double kilometragem){
        super(modelo, fabricacao);
        this.montadora = montadora;
        this.cor = cor;
        this.kilometragem = kilometragem;
    }

    // MÉTODOS
    @Override
    protected String printaTudo(){
        String veiculo = super.printaTudo();
        String montadora = this.montadora;
        String cor = this.cor;
        String kilometragem = String.valueOf(this.kilometragem);

        return veiculo+ "\nMontadora: " +montadora+ "\nCor: " +cor+ "\nOdômetro: " +kilometragem +"Km";
    }

    // GETTERS
    public String getMontadora(){
        return montadora;
    }

    public String getCor(){
        return cor;
    }

    public double getKilometragem(){
        return kilometragem;
    }

    // SETTERS
    public void setMontadora(String montadora){
        this.montadora = montadora;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public void setKilometragem(double kilometragem){
        this.kilometragem = kilometragem;
    }
}