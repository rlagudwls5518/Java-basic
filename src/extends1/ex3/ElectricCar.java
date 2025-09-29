package extends1.ex3;

public class ElectricCar extends Car {

    public void charge(){
        System.out.println("충전합니다");
    }

    @Override
    public void move(){
        System.out.println("전기차가 더빨리달립니다");
    }
}
