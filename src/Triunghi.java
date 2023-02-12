public class Triunghi extends FormaGeometrica {
    private final double baza;
    private final double inaltime;

    public Triunghi(double baza, double inaltime) {
        this.baza = baza;
        this.inaltime = inaltime;
    }

    @Override
    public void calculArie() {
        System.out.println("Aria triunghiului este:" + 0.5 * baza * inaltime);
    }
}
