// Higor Silva Fernandes
// RA: 2313898

public class Reserva {
    private Morador morador;
    private EspacoLazer espacoLazer;
    private String data;
    private boolean confirmacaoReserva;

    public Reserva() {
        morador = new Morador();
        espacoLazer = null; // Inicia nulo, será atribuído na reserva.
        data = "00/00/0000";
        confirmacaoReserva = false;
    }

    
    // Getters e Setters
    public void setMorador(Morador morador) {
        this.morador = morador;
    }

    public Morador getMorador() {
        return this.morador;
    }

    public void setEspacoLazer(EspacoLazer espacoLazer) {
        this.espacoLazer = espacoLazer;
    }

    public EspacoLazer getEspacoLazer() {
        return this.espacoLazer;
    }
    
    //Sobrecarga

    public void setData(String data) throws EntradaInvalidaException {
        
        if (!data.matches("\\d{2}/\\d{2}/\\d{4}")) {
            throw new EntradaInvalidaException("Formato de data inválido. Use DD/MM/AAAA.");
        }
        this.data = data;
    }

    //Sobrecarga
    
    public void setData(int dia, int mes, int ano) {
        this.data = String.format("%02d/%02d/%04d", dia, mes, ano);
    }

    public String getData() {
        return this.data;
    }

    public void setConfirmacaoReserva(boolean confirmacaoReserva) {
        this.confirmacaoReserva = confirmacaoReserva;
    }

    public boolean getConfirmacaoReserva() {
        return this.confirmacaoReserva;
    }
    
    
}