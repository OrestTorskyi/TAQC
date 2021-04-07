package subtasks;

public enum Breed {
    SPANIEL("English Spaniel"),
    HUSKY("Siberian Husky"),
    SHEPHERD("German Shepherd"),
    BEAGLE("Beagle"),
    AKITA("Akita");

    private String breed;


    public String getBreed() {
        return breed;
    }

    private Breed(String breed)
    {
        this.breed = breed;
    }
}
