package projet_piles;

public class Cravate extends Article {

    public Cravate(String code) {
        setCode (code);
        int nbCar = code.length();
        if ( nbCar == 3)
            setPrix (19.99);
        else
            setPrix(39.99);
    }
}
