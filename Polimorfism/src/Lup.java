import java.text.DecimalFormat;

public class Lup extends Canina{
	
	private String culoarea;

    public Lup(String numeAnimal, String tipAnimal, Double greutateAnimal, String habitat, String culoarea) {
        super(numeAnimal, tipAnimal, greutateAnimal, habitat);
        this.culoarea = culoarea;
    }


    public String obtineCuloarea() {
        return culoarea;
    }

    public void seteazaCuloarea(String culoarea) {
        this.culoarea = culoarea;
    }

    @Override
    protected void sunetProdus() {
    	System.out.println("");
        System.out.println("Uuuuu");
    }

    @Override
    protected void mananca(Mancare mancare) {
        this.seteazaAlimentatiaAnimalului(this.obtineAlimentatiaAnimalului() + mancare.obtineCantitatea());
    }

    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat("#.##");
        return String.format("%s[%s, %s, %s, %s, %d]", this.obtineTipulAnimalului(), this.obtineNumeleAnimalului(), this.obtineCuloarea(), format.format(this.obtineGreutateaAnimalului()), this.obtineHabitatul(), this.obtineAlimentatiaAnimalului());
    }
}
