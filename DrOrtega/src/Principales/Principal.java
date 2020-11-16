package Principales;

import Modelos.BDConex;

public class Principal {

    public static void main(String args[]) throws InterruptedException {

        Login login = new Login();
        BDConex modelo = new BDConex();
        MDI mdi;

        do {

            login.setVisible(true);
            while(login.getCorrecto()==false) System.out.print("");
            
            login.dispose();
            mdi = new MDI();
            mdi.setVisible(true);
            mdi.setAbierto(true);
            
            while(mdi.getAbierto() == true) System.out.print("");
            
            mdi.dispose();
            login = new Login();

        } while (mdi.getAbierto() == false);
    }
}
