import javax.swing.*;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    Course sozlu;
    String name;
    String number;
    String classes;
    double avarage;
    boolean ispass;

    Student(String name, String number, String classes, Course c1, Course c2, Course c3){

        this.name=name;
        this.number=name;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.sozlu=sozlu;
        this.avarage=0.0;
        this.ispass=false;

    }

    void addbulkexam(int note1, int note2, int note3){

        if (note1>=0 && note1<=100){
            c1.note=note1;

        }
        if (note2 >=0 && note2<=100){
            c2.note=note2;

        }

        if (note3>= 0 && note3<=100){
            c3.note=note3;
        }

    }
    void addbulksozlu (int sozlu1, int sozlu2, int sozlu3){

        if (sozlu1>=0 && sozlu1<=100){
            this.c1.sozlu=sozlu1;

        }
        if (sozlu2 >=0 && sozlu2<=100){
           this.c2.sozlu=sozlu2;

        }

        if (sozlu3>= 0 && sozlu3<=100){
           this.c3.sozlu=sozlu3;
        }

    }
    void ispass(){
        System.out.println("============================");
        this.avarage=(((this.c1.note + this.c2.note+ this.c3.note)/3.0 )*0.8 + ((this.c3.sozlu+this.c2.sozlu+ this.c1.sozlu)/3.0)*0.20);
        if (this.avarage>55){
            System.out.println("Sınıf Başarı İle Geçtiniz ");
            this.ispass=true;
        }else {
            System.out.println("Sınıfı Geçemediniz");
            this.ispass=false;
        }
        printNote();
    }

    void printNote(){
        System.out.println(c1.name+" Notu:  " + c1.note);
        System.out.println(c2.name+" Notu:  " + c2.note);
        System.out.println(c3.name+" Notu:  " + c3.note);
        System.out.println("Ortalamanız : " + this.avarage);
    }
}
