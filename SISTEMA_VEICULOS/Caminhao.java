class Caminhao extends Automotor{
    // ATRIBUTOS
    private int eixos;
    private double peso;

    // CONSTRUTORES
    Caminhao(){
    }

    Caminhao(String modelo, String fabricacao, String montadora, String cor, double kilometragem, int eixos, double peso){
        super(modelo, fabricacao, montadora, cor, kilometragem);
        this.eixos = eixos;
        this.peso = peso;
    }

    // MÉTODOS
    @Override
    protected String printaTudo(){
        String automotor = super.printaTudo();
        String eixos = String.valueOf(this.eixos);
        String peso = String.valueOf(this.peso);

        return "\nCAMINHAO" +automotor+ "\nQtd. Eixos: " +eixos+ "\nPeso: " +peso+ "t";
    }

    // GETTERS
    public int getEixos(){
        return eixos;
    }

    public double getPeso(){
        return peso;
    }

    // SETTERS
    public void setEixos(int eixos){
        this.eixos = eixos;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }
}