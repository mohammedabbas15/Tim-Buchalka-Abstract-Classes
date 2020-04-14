public class Main
{
    public static void main(String[] args) {
        Dog dog = new Dog("mike");
        dog.eat();
        dog.breathe();

        Parrot parrot = new Parrot("Budgie");
        parrot.fly();
        parrot.eat();
        parrot.breathe();

        Penguin penguin = new Penguin("Penguin");
        penguin.fly();
        penguin.eat();
        penguin.breathe();
    }
}
