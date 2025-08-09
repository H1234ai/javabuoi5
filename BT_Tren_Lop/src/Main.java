//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cage cage1 = new Cage ("1");
        Cage cage2 = new Cage ("2");
        cage1.addPet( new Pet( "Corgi", 15, "Chó"));
        cage1.addPet( new Pet( "Poodle", 13, "Chó"));
        cage1.addPet( new Pet( "Mướp", 3, "Mèo"));
        cage2.addPet(new Pet("Alaska", 11,"Chó"));
        cage2.addPet(new Pet("Anh lông ngắn", 5,"Mèo"));
        System.out.println("Số lồng đã tạo: " + Cage.totalCages);
        cage1.printAllPets();
        cage2.printAllPets();
        System.out.println("Danh sách thú nặng hơn 10kg: ");
        for (Pet p : cage1.getOverweightPets()) {
                p.printInfo();
            }
        for (Pet p : cage2.getOverweightPets()) {
            p.printInfo();
        }



    }
}