import java.text.DecimalFormat;

public class Iepuras extends Rozatoare {
    private String alimentPreferat;
    
    public Iepuras(String numeAnimal, String tipAnimal, Double greutateAnimal, String habitat, String alimentPreferat) {
        super(numeAnimal, tipAnimal, greutateAnimal, habitat);
        this.alimentPreferat = alimentPreferat;
    }


    public String obtineAlimentPreferat() {
        return alimentPreferat;
    }

    public void seteazaAlimentPreferat(String alimentPreferat) {
        this.alimentPreferat = alimentPreferat;
    }

    @Override
    protected void sunetProdus() {
    	System.out.println("");
        System.out.println("purr purr");
    }

    @Override
    protected void mananca(Mancare mancare) {
        this.seteazaAlimentatiaAnimalului(this.obtineAlimentatiaAnimalului() + mancare.obtineCantitatea());
    }

    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat("#.##");
        return String.format("%s[%s, %s, %s, %s, %d]", this.obtineTipulAnimalului(), this.obtineNumeleAnimalului(), this.obtineAlimentPreferat(), format.format(this.obtineGreutateaAnimalului()), this.obtineHabitatul(), this.obtineAlimentatiaAnimalului());
    }
}

