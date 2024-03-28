package lessons.ex3;

public class Runner {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        Car[] garage = {car, car2, car3};

        for(var car4 : garage) {
            System.out.println(car);
        }

    }
}
