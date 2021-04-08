package obj;

public enum BackSystem {
    NET("Stretched net by metallic plates "),
    NONE("Has no back system"),
    FOAMBACK("Anatomic back by foam blocks");

    private String description;

    private BackSystem(String description)
    {
        this.description = description;
    }

    public String getDescription()
    {
        return this.description;
    }
}


