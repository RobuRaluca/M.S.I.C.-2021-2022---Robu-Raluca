import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        Mamifer mamifer = null;
        Felina felina = null;
        Canina canina = null;
        Animal animal = null;
        Rozatoare rozatoare = null;

        StringBuilder sb = new StringBuilder();

        String input = buffer.readLine();
        while (!"Sfarsit".equals(input)) {
            String[] inputAnimal = input.split("\\s+");

            String[] inputMancare = buffer.readLine().split("\\s+");
            Mancare mancare = null;
            switch (inputMancare[0]) {
                case "legume":
                    mancare = new Legume(Integer.parseInt(inputMancare[1]));
                    break;
                case "carne":
                    mancare = new Carne(Integer.parseInt(inputMancare[1]));
                    break;

            }
            switch (inputAnimal[0]) {
	            case "cangur":
	                mamifer = new Cangur(inputAnimal[1], "cangur", Double.parseDouble(inputAnimal[2]), inputAnimal[3]);
	                mamifer.sunetProdus();
	                if (inputMancare[0].equals("legume")) {
	                	mamifer.mananca(mancare);
	                } else {
	                    System.out.println("Cangurul nu mananca acest tip de mancare mancare!");
	                }
	                break;
	                
	            case "broasca":
	                animal = new Broasca(inputAnimal[1], "broasca", Double.parseDouble(inputAnimal[2]), inputAnimal[3]);
	                animal.sunetProdus();
	                if (inputMancare[0].equals("legume")) {
	                    animal.mananca(mancare);
	                } else {
	                    System.out.println("Broasca nu mananca acest tip de mancare mancare!");
	                }
	                break;
	                
                case "soarece":
                    rozatoare = new Soarece(inputAnimal[1], "soarece", Double.parseDouble(inputAnimal[2]), inputAnimal[3], inputAnimal[4]);
                    rozatoare.sunetProdus();
                    if (inputMancare[0].equals("legume")) {
                        rozatoare.mananca(mancare);
                    } else {
                        System.out.println("Soarecele nu consuma acest tip de mancare!");
                    }

                    sb.append(rozatoare.toString()).append(System.lineSeparator());
                    break;

                case "iepuras":
                    rozatoare = new Iepuras(inputAnimal[1], "iepuras", Double.parseDouble(inputAnimal[2]), inputAnimal[3], inputAnimal[4]);
                    rozatoare.sunetProdus();
                    if (inputMancare[0].equals("legume")) {
                        rozatoare.mananca(mancare);
                    } else {
                        System.out.println("Iepurasii nu mananca acest tip de mancare!");
                    }

                    sb.append(rozatoare.toString()).append(System.lineSeparator());
                    break;

                case "pisica":
                    felina = new Pisica(inputAnimal[1], "pisica", Double.parseDouble(inputAnimal[2]), inputAnimal[3], inputAnimal[4]);
                    felina.sunetProdus();
                    felina.mananca(mancare);

                    sb.append(felina.toString()).append(System.lineSeparator());
                    break;
                    
                case "leu":
                    felina = new Leu(inputAnimal[1], "leu", Double.parseDouble(inputAnimal[2]), inputAnimal[3], inputAnimal[4]);
                    felina.sunetProdus();
                    if (inputMancare[0].equals("carne")) {
                        felina.mananca(mancare);
                    } else {
                        System.out.println("Leii nu mananca acest tip de mancare!");
                    }
                    sb.append(felina.toString()).append(System.lineSeparator());
                    break;
                    
                case "caine":
                    canina = new Caine(inputAnimal[1], "caine", Double.parseDouble(inputAnimal[2]), inputAnimal[3], inputAnimal[4]);
                    canina.sunetProdus();
                    canina.mananca(mancare);

                    sb.append(canina.toString()).append(System.lineSeparator());
                    break;
                    
                case "lup":
                    canina = new Lup(inputAnimal[1], "lup", Double.parseDouble(inputAnimal[2]), inputAnimal[3], inputAnimal[4]);
                    canina.sunetProdus();
                    canina.mananca(mancare);

                    sb.append(canina.toString()).append(System.lineSeparator());
                    break;


            }
            input = buffer.readLine();
        }
        System.out.println(sb.toString().trim());
    }
}

