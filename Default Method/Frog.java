public class Frog implements TerestialAnimal, AquaticAnimal {

    public static void main(String[] args) {
        Frog frog = new Frog();
        frog.specialCapabilities();
    }

    
    @Override
    public void specialCapabilities() {
        TerestialAnimal.super.specialCapabilities();
        AquaticAnimal.super.specialCapabilities();
    }



    
}
