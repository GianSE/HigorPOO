// Higor Silva Fernandes
// RA: 2313898

public class Morador {
    private String nome;
    private String apartamento;
    private String email;
    private String telefone;

  
    public Morador() {
        this.nome = "";
        this.apartamento = "";
        this.email = "";
        this.telefone = "";
    }
    
    
    // Getters e Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setApartamento(String apartamento) {
        this.apartamento = apartamento;
    }

    public String getApartamento() {
        return this.apartamento;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return this.telefone;
    }
    
   
}