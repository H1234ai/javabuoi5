import java.util.ArrayList;

public class Cage {
    private String cageCode ;
    private ArrayList<Pet> pets  ;
    private int currentPetCount;
    static int totalCages;
    final int MAX_CAPACITY = 3;
    public Cage () {

    }
    public Cage (String cageCode) {
        this.cageCode= cageCode;
        this.pets = new ArrayList<>();
        this.currentPetCount =0;
        totalCages ++;
    }
    public void addPet (Pet pet) {
        if ( currentPetCount < MAX_CAPACITY) {
            pets.add(pet);
            currentPetCount ++;
        }
        else System.out.println( "Lồng không thể chứa thêm!");
    }
    public void printAllPets() {
        System.out.println("Lồng " + cageCode+": ");
        for (Pet p : pets) {
            p.printInfo();
        }
    }
    public ArrayList<Pet> getOverweightPets () {
        ArrayList<Pet> result = new ArrayList<>();
        for (Pet p : pets) {
            if (p.isOverweight()) {
                result.add(p);
            }
        }
        return result;
    }
}
