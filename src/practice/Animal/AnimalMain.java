package practice.Animal;

public class AnimalMain {

    public static void main(String[] args) {
        Soundable[] animals = {new Cat(), new Dog()};

        Zoo zoo = new Zoo(animals);
        zoo.makeAllSound();

    }

}
