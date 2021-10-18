import java.text.DecimalFormat;

public class Leu extends Felina {
    private String grup;
    
    protected Leu(String numeAnimal, String tipAnimal, Double greutateAnimal, String habitat, String grup) {
        super(numeAnimal, tipAnimal, greutateAnimal, habitat);
        this.grup = grup;
    }


    public String obtineGrup() {
        return grup;
    }

    public void seteazaGrup(String grup) {
        this.grup = grup;
    }

    @Override
    protected void sunetProdus() {
    	System.out.println("");
        System.out.println("roar roar");
    }

    @Override
    protected void mananca(Mancare mancare) {
        this.seteazaAlimentatiaAnimalului(this.obtineAlimentatiaAnimalului() + mancare.obtineCantitatea());
    }

    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat("#.##");
        return String.format("%s[%s, %s, %s, %s, %d]", this.obtineTipulAnimalului(), this.obtineNumeleAnimalului(), this.obtineGrup(), format.format(this.obtineGreutateaAnimalului()), this.obtineHabitatul(), this.obtineAlimentatiaAnimalului());
    }
}
