public class Teacher {
    String name;
    String pNumber;
    String branch;


    Teacher(String name, String pNumber, String branch) {
        this.name = name;
        this.pNumber = pNumber;
        this.branch = branch;
    }
void printinfo(){
    System.out.println("Adı : "+this.name);
    System.out.println("Telefon No : "+ this.pNumber);
    System.out.println("Branşı : "+ this.branch);
}
}
