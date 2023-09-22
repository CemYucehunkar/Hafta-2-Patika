
public class Main {
    // Statcik bir integer tanımlıyoruz => fib isminde ve girelen n değerine göre işlem yapacak

    static int fib(int n){

        // Bu sistemin formulüze edilmiş hali f(n)=f(n-1)+ f(n-2)
        // Bu kurgu f(1) olduğunda bitmeli bunu sağlamak içinde ;
        // n 'nin 1 ve ya olduğu durumlarda döngü sonlanmalı

        if (n==1 || n==2){
            return 1;
        }
        // Döngünün yukarıda sonlanmadığı her durumda aşağıdaki kod devreye girmeli
        // Ve tekrar başa dönüp sorgulamalı
        return fib(n-1)+ fib(n-2);
    }
    public static void main(String[] args) {

        // burda fib diye tanımladığımız  sayıyı girdiğimiz de sonuç bize Fibbocci değerini vereecek
        System.out.println(fib(6));

    }

}