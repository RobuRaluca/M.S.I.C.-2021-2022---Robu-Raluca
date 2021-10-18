import java.text.DecimalFormat;

public class Caine extends Canina {
	
	private String numarulDePete;

    public Caine(String numeAnimal, String tipAnimal, Double greutateAnimal, String habitat, String numarulDePete) {
        super(numeAnimal, tipAnimal, greutateAnimal, habitat);
        this.numarulDePete = numarulDePete;
    }


    public String obtineNumarulDePete() {
        return numarulDePete;
    }

    public void seteazaNumarulDePete(String numarulDePete) {
        this.numarulDePete = numarulDePete;
    }

    @Override
    protected void sunetProdus() {
    	System.out.println("");
        System.out.println("ham ham");
    }

    @Override
    protected void mananca(Mancare mancare) {
        this.seteazaAlimentatiaAnimalului(this.obtineAlimentatiaAnimalului() + mancare.obtineCantitatea());
    }

    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat("#.##");
        return String.format("%s[%s, %s, %s, %s, %d]", this.obtineTipulAnimalului(), this.obtineNumeleAnimalului(), this.obtineNumarulDePete(), format.format(this.obtineGreutateaAnimalului()), this.obtineHabitatul(), this.obtineAlimentatiaAnimalului());
    }
}
