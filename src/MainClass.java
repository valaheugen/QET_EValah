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
        Vehicul nouVehicul = new Vehicul("rosu", 4);
        nouVehicul.afiseazaDetaliiVehicul();
        //Pot fi utlizate methodele setCuloare si setNrRoti

        Masina masinaNoua = new Masina("Negru", 7, "VW");
        masinaNoua.afiseazaDetaliiVehicul();
        //Pot fi utlizate methodele setCuloare, setNrRoti si setMarca
        System.out.println("");

        //Polimorfism
        Animal nouAnimal = new Animal();
        nouAnimal.emiteSunet();

        Caine nouCaine = new Caine();
        nouCaine.emiteSunet();

        Pisica nouPisica = new Pisica();
        nouPisica.emiteSunet();
        System.out.println("");

        ////Polimorfism
        Triunghi nouTriunghi = new Triunghi(5.5,3);
        nouTriunghi.calculArie();

        Patrat nouPatrat = new Patrat(5);
        nouPatrat.calculArie();

    }
}
