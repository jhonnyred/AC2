class Domestico extends Automotor{
    // ATRIBUTOS
    private int passageiros;
    private FREIOS freio;
    private boolean airbag;

    // CONSTRUTORES
    Domestico(){
    }

    Domestico(String modelo, String fabricacao, String montadora, String cor, double kilometragem, int passageiros, FREIOS freio, boolean airbag){
        super(modelo, fabricacao, montadora, cor, kilometragem);
        this.passageiros = passageiros;
        this.freio = freio;
        this.airbag = airbag;
    }
    
    // MÉTODOS
    @Override
    protected String printaTudo(){
        String automotor = super.printaTudo();
        String passageiros = String.valueOf(this.passageiros);
        String airbag = String.valueOf(this.airbag);
        
        String freio;
        if(this.freio == FREIOS.TAMBOR){
             freio = "TAMBOR";
        }else if(this.freio == FREIOS.DISCO){
            freio = "DISCO";
        }else{
            freio = "ABS";
        }


        return "\nDOMESTICO" +automotor+ "\nQtd. Passageiros: " +passageiros+ "\nTipo freio: " +freio+ "\nAirbag: " +airbag;
    }

    // GETTERS
    public int getPassageiros(){
        return passageiros;
    }

    public FREIOS getFreio(){
        return freio;
    }

    public boolean getAirbag(){
        return airbag;
    }

    // SETTERS
    public void setPassageiros(int passageiros){
        this.passageiros = passageiros;
    }

    public void setFreio(FREIOS freio){
        this.freio = freio;
    }

    public void setAirbag(boolean airbag){
        this.airbag = airbag;
    }
}
