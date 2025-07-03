// Higor Silva Fernandes
// RA: 2313898

import java.util.ArrayList;
import java.util.List;

public class BDReserva {

    private List<Reserva> bd;
    private static BDReserva instancia;

    private BDReserva() {
        bd = new ArrayList<>();
    }

    //MÉTODO SINGLETON
    public static BDReserva getInstancia() {
        if (instancia == null) {
            instancia = new BDReserva();
        }
        return instancia;
    }

    // --- MÉTODOS CRUD (Create, Read, Update, Delete) ---

    // CREATE (Inserção)
    public void addReserva(Reserva reserva) {
        bd.add(reserva);
    }

    // READ (Consulta de Grupo)
    public List<Reserva> getReservas() {
        return bd;
    }

    // UPDATE (Alteração)
    public void updateReserva(int index, Reserva reserva) {
        bd.set(index, reserva);
    }

    // DELETE (Exclusão)
    public void deleteReserva(int index) {
        bd.remove(index);
    }

    // READ (Consulta Individual) - Útil para o relatório individual/alteração
    public Reserva getReservaByIndex(int index) {
        return bd.get(index);
    }
}