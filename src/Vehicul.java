public class Vehicul {
    private String culoare;
    private int nrRoti;

    // Constructorul
    public Vehicul(String culoare, int nrRoti) {
        this.culoare = culoare;
        this.nrRoti = nrRoti;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public int getNrRoti() {
        return nrRoti;
    }

    public void setNrRoti(int nrRoti) {
        this.nrRoti = nrRoti;
    }

    public void afiseazaDetaliiVehicul() {
        System.out.println("Culoare: " + culoare);
        System.out.println("Numar roti: " + nrRoti);
    }
}

