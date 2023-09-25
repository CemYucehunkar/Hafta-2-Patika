public class Course {
    Teacher Teacher;
    String name;
    String code;
    String prefix;
    int note;
    int sozlu;


    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.sozlu= 0;

    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)){
        this.Teacher = teacher;
        }else {
            System.out.println("Öğretmen ve Ders Uyuşmuyor !");
        }

    }


}
