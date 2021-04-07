package subtasks;

import java.util.Objects;

public class Dog {
    private String name;
    private Breed breed;
    private int age;
    private int dogID;
    public static int registeredDogs;

    public Dog(String name)
    {
        this.name = name;
        registeredDogs++;
        dogID = registeredDogs;
    }

    public Dog(String name, Breed breed)
    {
        this.name = name;
        this.breed = breed;
        registeredDogs++;
        dogID = registeredDogs;
    }

    public Dog(String name, Breed breed, int age)
    {
        this.name = name;
        this.breed = breed;
        this.age = age;
        registeredDogs++;
        dogID = registeredDogs;
    }

    public int getAge() {
        return age;
    }

    public int getDogID()
    {
        return dogID;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o)
    {
        if(this == o) return true;
        if((o == null) | this.getClass() != o.getClass()) return false;
        if(this.hashCode() == o.hashCode()) return true;
        else {
            Dog otherDog = (Dog) o;
            if (this.name == otherDog.name) return true;
            else return false;
        }
    }

    public static void hasSameName(Dog[] dogs)
    {
        boolean same_names = false;
        for(int i = 0; i < dogs.length; i++)
        {
            if(i+1 == dogs.length) break;
            else {
                for (int j = i + 1; j < dogs.length; j++) {
                    if(dogs[i].equals(dogs[j]))
                    {
                        System.out.println("Dogs with ID:" + dogs[i].getDogID() + " and ID:" + dogs[j].getDogID() + " has the same name: " + dogs[i].getName());
                        same_names = true;
                    }
                }
            }
        }
        if(!same_names)
        {
            System.out.println("There is no same names");
        }
    }


    public static Dog oldestDog(Dog[] dogs)
    {
        Dog oldest_dog = dogs[0];
      for(int i = 1; i < dogs.length; i++)
      {
          if(oldest_dog.getAge() < dogs[i].getAge()) oldest_dog = dogs[i];
      }
      return oldest_dog;
    }


    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString()
    {
        return "Dog breed: " + breed.getBreed() + "\nName: " + name + "\nAge: " + age;
    }
}
