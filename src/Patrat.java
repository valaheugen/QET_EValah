public class Patrat extends FormaGeometrica {
    private final double latura;

    public Patrat(double latura) {
        this.latura = latura;
    }

    @Override
    public void calculArie() {
        System.out.println("Aria patratuluieste:"+latura*latura);
    }
}
