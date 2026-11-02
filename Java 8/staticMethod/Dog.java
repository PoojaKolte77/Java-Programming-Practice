package staticMethod;

public class Dog implements staticMethod {


    @Override
    public void colour() {
        System.out.println("I am brown in colour");
    }

    void specialCapabilities() {
        staticMethod.specialCapabilities();
    }

}
