public class ContBancar {
    private String numarCont;
    private double sold;

    public ContBancar(String numarCont, double sold) {
        this.numarCont = numarCont;
        this.sold = sold;
    }

    public String getNumarCont() {
        return numarCont;
    }

    public void setNumarCont(String numarCont) {
        this.numarCont = numarCont;
    }

    public double getSold() {
        return sold;
    }

    public void setSold(double sold) {
        this.sold = sold;
    }
}
