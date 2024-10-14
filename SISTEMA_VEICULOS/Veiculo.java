import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Veiculo {
    // ATRIBUTOS
    private String modelo;
    private LocalDate fabricacao;
    
    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
    
    // CONSTRUTORES
    Veiculo(){
    }
    
    Veiculo(String modelo, String fabricacao){
        this.modelo = modelo;
        this.fabricacao = LocalDate.parse(fabricacao, formatador);
    }
    
    // MÉTODOS
    protected String printaTudo(){
        String modelo = this.modelo;
        String fabricacao = this.fabricacao.format(formatador);

        return "\nModelo: " +modelo+ "\nFabricacao:" +fabricacao;
    }

    // GETTERS
    public String getModelo(){
        return modelo;
    }

    public LocalDate getFabricacao(){
        return fabricacao;
    }

    //SETTERS
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setFabricacao(String fabricacao) {
        this.fabricacao = LocalDate.parse(fabricacao, formatador);
    }
}
