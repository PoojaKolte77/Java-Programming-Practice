public class Cat extends Animal {
     public void sound(){
        System.out.println("Cat is meowing");
    }
    

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.sound();
    }
}

