import java.text.DecimalFormat;

public class Soarece extends Rozatoare {
	private String nume;
	
    public Soarece(String numeAnimal, String tipAnimal, Double greutateAnimal, String habitat, String nume) {
        super(numeAnimal, tipAnimal, greutateAnimal, habitat);
        this.nume = nume;
    }


    public String obtineNume() {
        return nume;
    }

    public void seteazaNume(String nume) {
        this.nume = nume;
    }

    @Override
    protected void sunetProdus() {
    	System.out.println("");
        System.out.println("chit chit");
    }

    @Override
    protected void mananca(Mancare mancare) {
        this.seteazaAlimentatiaAnimalului(this.obtineAlimentatiaAnimalului() + mancare.obtineCantitatea());
    }

    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat("#.##");
        return String.format("%s[%s, %s, %s, %s, %d]", this.obtineTipulAnimalului(), this.obtineNumeleAnimalului(), this.obtineNume(), format.format(this.obtineGreutateaAnimalului()), this.obtineHabitatul(), this.obtineAlimentatiaAnimalului());
    }
}
