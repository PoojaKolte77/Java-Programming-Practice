package defaultMethod;

public interface defaultMethod {


    void colour();

    
    default void specialCapabilities() {
        System.out.println("Animal Have 4 legs");
    }
    
}
