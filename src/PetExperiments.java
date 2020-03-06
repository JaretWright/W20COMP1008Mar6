import java.util.ArrayList;

public class PetExperiments {
    public static void main(String[] args)
    {
        Pet dog = new Dog("Jeff");
        Cat cat = new Cat("Vladamir");
        Duck duck = new Duck("Bruce");

        ArrayList<Pet> pets = new ArrayList<>();
        pets.add(dog);
        pets.add(cat);
        pets.add(duck);

        for(Pet pet:pets)
        {
            System.out.printf("Class: %-10s  name: %-10s  speak: %-10s%n",
                                pet.getClass(), pet.getName(),
                                pet.speak());
        }

    }
}
