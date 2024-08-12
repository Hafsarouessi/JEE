package pres;

import dao.DaoImpl;
import metier.MetierImpl;

public class Persentation {

    public static void main(String[] args) {
        /*injection du dependences avec instanciation statique */
        DaoImpl Dao =new DaoImpl();
        MetierImpl metier=new MetierImpl(Dao);
        // metier.setDao(Dao);
        System.out.println("Resultat="+metier.calcul());

    }
}
