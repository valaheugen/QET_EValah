public class MainClass {
    public static void main(String[] args) {

        //Encapsulare
        ContBancar cont_VEugen = new ContBancar("MD28VI123131231", 5000.0);

        System.out.println("Numarul contului este: " + cont_VEugen.getNumarCont());
        System.out.println("Soldul este: " + cont_VEugen.getSold());

        cont_VEugen.setNumarCont("MD28VI123231654321");
        cont_VEugen.setSold(2000.0);

        System.out.println("Numarul contului este: " + cont_VEugen.getNumarCont());
        System.out.println("Soldul este: " + cont_VEugen.getSold());
        System.out.println("");

        //Inheritance
        Vehicul nouVehicul = new Vehicul("rosu",4);
        nouVehicul.afiseazaDetaliiVehicul();
        //Pot fi utlizate methodele setCuloare si setNrRoti

        Masina masinaNoua = new Masina("Negru", 7, "VW");
        masinaNoua.afiseazaDetaliiVehicul();
        //Pot fi utlizate methodele setCuloare, setNrRoti si setMarca
        System.out.println("");
    }
}
