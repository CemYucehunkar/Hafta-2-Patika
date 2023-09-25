public class Main {
    public static void main(String[] args) {

        Teacher o1 = new Teacher("Cem", "555", "TRH");
        Teacher o2 = new Teacher("Özge", "444", "İng");
        Teacher o3 = new Teacher("Ozan", "333", "Mat");


        Course Tarih = new Course("Tarih", " 101", "TRH");
        Tarih.addTeacher(o1);
        System.out.println();

        Course İngilizce = new Course("İngilizce", "202", "İng");
        İngilizce.addTeacher(o2);
        System.out.println();

        Course Matematik = new Course("Matematik", "303", "Mat");
        Matematik.addTeacher(o3);
        System.out.println();


        Student s1 = new Student("Onur", "123", "10/B", Tarih, İngilizce, Matematik);
        s1.addbulkexam(100, 100, 100);
        s1.addbulksozlu(50,50,50);

        s1.ispass();

        Student s2 = new Student("Ahmet", "45", "12/A", Tarih, İngilizce, Matematik);

        s2.addbulkexam(70, 50, 40);
        s2.addbulksozlu(30,40,60);
        s2.ispass();

    }
}
