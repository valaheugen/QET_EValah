public class Masina extends Vehicul {
    private String marca;

    // Constructorul
    public Masina(String culoare, int nrRoti, String marca) {
        super(culoare, nrRoti);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public void afiseazaDetaliiVehicul() {
        super.afiseazaDetaliiVehicul();
        System.out.println("Marca: " + marca);
    }
}
