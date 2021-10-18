
public class Mancare {
    private Integer cantitate;

    protected Mancare(Integer cantitate) {
        this.cantitate = cantitate;
    }

    protected Integer obtineCantitatea() {
        return cantitate;
    }

    protected void seteazaCantitate(Integer cantitate) {
        this.cantitate = cantitate;
    }
}
