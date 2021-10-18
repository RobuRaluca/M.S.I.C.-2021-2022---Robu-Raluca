
public class Cangur extends Mamifer {
    public Cangur(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    protected void sunetProdus() {
    	System.out.println("");
        System.out.println("trop trop");
    }

    @Override
    protected void mananca(Mancare mancare) {
        this.seteazaAlimentatiaAnimalului(this.obtineAlimentatiaAnimalului() + mancare.obtineCantitatea());
    }
}


