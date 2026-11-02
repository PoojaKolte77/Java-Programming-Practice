public class Dog extends Animal {
    public void sound(){
        System.out.println("Dog is barking");
    }

    public static void main(String[] args) {

        Animal a = new Dog();

        a.sound();
        a.sleep();
    }
}
