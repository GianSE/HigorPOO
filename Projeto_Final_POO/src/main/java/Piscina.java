// Higor Silva Fernandes
// RA: 2313898


public class Piscina extends EspacoLazer {
    private float profundidadeMaxima;
    private boolean possuiEscorregador;

   
    public Piscina() {
        super();
    }
    
    public Piscina(String nome, String descricao, int capacidade, boolean disponibilidade, float profundidadeMaxima, boolean possuiEscorregador) {
        super(nome, descricao, capacidade, disponibilidade);
        this.profundidadeMaxima = profundidadeMaxima;
        this.possuiEscorregador = possuiEscorregador;
    }

    // Getters e Setters
    public float getProfundidadeMaxima() {
        return profundidadeMaxima;
    }

    public void setProfundidadeMaxima(float profundidadeMaxima) {
        this.profundidadeMaxima = profundidadeMaxima;
    }

    public boolean isPossuiEscorregador() {
        return possuiEscorregador;
    }

    public void setPossuiEscorregador(boolean possuiEscorregador) {
        this.possuiEscorregador = possuiEscorregador;
    }

    //Sobrescrita
    @Override
    public String getDetalhesEspecificos() {
        return "Profundidade Máxima: " + profundidadeMaxima + " metros" +
               "\nPossui Escorregador: " + (possuiEscorregador ? "Sim" : "Não");
    }

   
}