package ClassPack;

public class Animal {
    protected String type;
    protected String name;
    protected String breed;

    public Animal(String type, String name, String breed) {
        this.type = type;
        this.name = name;
        this.breed = breed;
    }

    public String getType() {
        return type;
    } 
    public String getName() {
        return name;
    }
    public String getBreed() {
        return breed;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
}
