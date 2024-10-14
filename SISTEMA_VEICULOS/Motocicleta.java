class Motocicleta extends Automotor{
    // ATRIBUTOS
    private int cilindradas;
    private double torque;
    
    // CONSTRUTORES
    Motocicleta(){
    }

    Motocicleta(String modelo, String fabricacao, String montadora, String cor, double kilometragem, int cilindradas, double torque){
        super(modelo, fabricacao, montadora, cor, kilometragem);
        this.cilindradas = cilindradas;
        this.torque = torque;
    }

    // MÉTODOS
    @Override
    protected String printaTudo(){
        String automotor = super.printaTudo();
        String cilindradas = String.valueOf(this.cilindradas);
        String torque = String.valueOf(this.torque);
        
        return "\nMOTOCICLETA" +automotor+ "\nCilindradas: " +cilindradas+ "\nTorque: " +torque+ "N.m";
    }

    // GETTERS
    public int getCilindradas(){
        return cilindradas;
    }

    public double getTorque(){
        return torque;
    }

    // SETTERS
    public void setCilindradas(int cilindradas){
        this.cilindradas = cilindradas;
    }

    public void setTorque(double torque){
        this.torque = torque;
    }
}
