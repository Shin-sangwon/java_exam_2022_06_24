import java.util.Arrays;

public class main {

    public static void main(String[] args) {
        Car A = new Car(1, 100);
        Car B = new Car(2, 200);

        A.run();
        B.run();
    }
}

class Car{
    int max_speed;
    int number;

    public Car(int number, int max_speed){
        this.number = number;
        this.max_speed = max_speed;
    }
    void run(){
        System.out.printf("%d번 자동차가 %dKm 속도로 달립니다.\n", number ,max_speed);
    }

}


