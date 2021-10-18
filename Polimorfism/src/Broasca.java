
public class Broasca extends Animal{
    public Broasca(String numeAnimal, String tipAnimal, Double greutateAnimal, String habitat) {
        super(numeAnimal, tipAnimal, greutateAnimal);
    }

    @Override
    protected void sunetProdus() {
        System.out.println("oac oac");
    }

    @Override
    protected void mananca(Mancare mancare) {
        this.seteazaAlimentatiaAnimalului(this.obtineAlimentatiaAnimalului() + mancare.obtineCantitatea());
    }
}

