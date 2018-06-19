package app;

import household.Republic;
import telas.Home;

/**
 *
 * @author guilherme
 */
public class Principal {
    
    static public Republic republic;
    
    public static void main(String[] args) {
        
        republic = new Republic();
        Home home = new Home();
        home.setVisible(true);
        
    }
    
    
    
}
