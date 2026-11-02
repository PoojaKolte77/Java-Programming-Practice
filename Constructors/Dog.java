public class Dog {

    private String name = "Labrador";

    public Dog () {
        System.out.println("I am a dog");
    }



    public  Dog (String name) {
        this.name = name;
        System.out.println("I am a dog named " + name);
    }

    public void specialCapabilities() {
        System.out.println("I am a dog and I can bark");
    }

}
