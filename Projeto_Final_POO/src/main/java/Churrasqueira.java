// Higor Silva Fernandes
// RA: 2313898

public class Churrasqueira extends EspacoLazer {
    private int numeroDeChurrasqueiras;
    private boolean possuiPia;

    
    public Churrasqueira() {
        super();
    }
    
    public Churrasqueira(String nome, String descricao, int capacidade, boolean disponibilidade, int numeroDeChurrasqueiras, boolean possuiPia) {
        super(nome, descricao, capacidade, disponibilidade);
        this.numeroDeChurrasqueiras = numeroDeChurrasqueiras;
        this.possuiPia = possuiPia;
    }

    // Getters e Setters
    public int getNumeroDeChurrasqueiras() {
        return numeroDeChurrasqueiras;
    }

    public void setNumeroDeChurrasqueiras(int numeroDeChurrasqueiras) {
        this.numeroDeChurrasqueiras = numeroDeChurrasqueiras;
    }

    public boolean isPossuiPia() {
        return possuiPia;
    }

    public void setPossuiPia(boolean possuiPia) {
        this.possuiPia = possuiPia;
    }

    //Sobrescrita
    @Override
    public String getDetalhesEspecificos() {
        return "Número de Churrasqueiras: " + numeroDeChurrasqueiras +
               "\nPossui Pia: " + (possuiPia ? "Sim" : "Não");
    }

    
}