class Car {
    // Nitelikler burada tanımlanır. Değişkenler nitelikleri tanımlar

    String color;
    String type;
    String model;
    int speed;
    int speedLimit = 180;


     Car (String model, int speed, String type, String color, int speedLimit){

        this.model=model;
        this.color=color;
        this.type=type;
        this.speed=speed;


    }

    void hızArtırma(int artırmaHızı) {
        if ((this.speed + artırmaHızı) < this.speedLimit) {
           this.speed += artırmaHızı;
        }

    }

    void hızAzalatma(int azalatmaHızı) {

        if (this.speed > 0) {
            this.speed -= azalatmaHızı;

        }
    }

    void printspeed() {
        System.out.print("Hızınız : " + this.speed);
    }

    void info(){
        System.out.println("Model :\t"+ this.model);
        System.out.println("Rengi :\t"+ this.color);
        System.out.println("Tip   :\t"+ this.type);
        System.out.println("Speed :\t"+ this.speed);
    }
}

