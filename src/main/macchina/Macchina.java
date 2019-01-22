import macchina.Componente;

public class Macchina {

    public void start() {

        Componente ruotaDP = new Ruota("destra", "posteriore");

        Componente ruotaSP = new Ruota("sinistra", "posteriore");

        System.out.println(ruotaDP.getNumeroDiSerie());

        new Ruota("destra", "anteriore");
        new Ruota("destra", "posteriore");
    }
}
