package macchina;

public class Ruota implements Componente {

    private final String lato;
    private final String posizione;

    public Ruota(String lato, String posizione) {
        this.lato = lato;
        this.posizione = posizione;
    }

    @Override
    public String getNumeroDiSerie() {
        return "1111111";
    }
}

