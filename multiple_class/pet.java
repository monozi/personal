public class pet {

    String name;
    String animaltype;
    int trustlevel;
    int petlevel;
    boolean ishappy;

    public void sayMyTrustlevel() {
        System.out.println("Trust Level: " + trustlevel);
    }

    public void sayMyName() {
        System.out.println("My pet named " + name);
    }

    public void sayMyAnimaltype() {
        System.out.println("Animal Type: " + animaltype);
    }

    public void sayMyPetlevel() {
        System.out.println("Pet Level: " + petlevel);
    }

    public void sayIshappy() {
        System.out.println("am I happy with my owner? " + ishappy + "\n");
    }
}