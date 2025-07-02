// Higor Silva Fernandes
// RA: 2313898

public class EspacoLazer {
    private String nome;
    private String descricao;
    private int capacidade;
    private boolean disponibilidade;

   
    public EspacoLazer() {
        nome = "";
        descricao = "";
        capacidade = 0;
        disponibilidade = true;
    }

   
    public EspacoLazer(String nome, String descricao, int capacidade, boolean disponibilidade) {
        this.nome = nome;
        this.descricao = descricao;
        this.capacidade = capacidade;
        this.disponibilidade = disponibilidade;
    }


    
    public String getDetalhesEspecificos() {
        return ""; 
    }

    // Getters e Setters
    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public boolean getDisponibilidade() {
        return this.disponibilidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getCapacidade() {
        return this.capacidade;
    }

    
}