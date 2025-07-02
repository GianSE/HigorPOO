// Higor Silva Fernandes
// RA: 2313898

public class SalaoFestas extends EspacoLazer {
    private boolean possuiCozinha;
    private boolean possuiPalco;
    
    
    public SalaoFestas() {
        super();
    }

    public SalaoFestas(String nome, String descricao, int capacidade, boolean disponibilidade, boolean possuiCozinha, boolean possuiPalco) {
        super(nome, descricao, capacidade, disponibilidade);
        this.possuiCozinha = possuiCozinha;
        this.possuiPalco = possuiPalco;
    }

    // Getters e Setters
    public boolean isPossuiCozinha() {
        return possuiCozinha;
    }

    public void setPossuiCozinha(boolean possuiCozinha) {
        this.possuiCozinha = possuiCozinha;
    }

    public boolean isPossuiPalco() {
        return possuiPalco;
    }

    public void setPossuiPalco(boolean possuiPalco) {
        this.possuiPalco = possuiPalco;
    }

    //Sobrescrita
    @Override
    public String getDetalhesEspecificos() {
        return "Possui Cozinha: " + (possuiCozinha ? "Sim" : "Não") +
               "\nPossui Palco: " + (possuiPalco ? "Sim" : "Não");
    }
    
    
}