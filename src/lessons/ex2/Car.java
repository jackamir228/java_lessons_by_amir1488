package lessons.ex2;

public class Car {
    public static void main(String[] args) {
        int gasTank = 10;
        boolean isWorkEngine = true;
        boolean isWorkElectrician = true;
        boolean isWorkWheel1 = true;
        boolean isWorkWheel2 = true;
        boolean isWorkWheel3 = true;
        boolean isWorkWheel4 = true;

        if (gasTank <= 0) {
            System.out.println("недостаточно топлива");
        }
        else if (isWorkElectrician == false && isWorkEngine == false) {
            System.out.println("двигатель и электроника не работают");
        } else if (isWorkWheel1 == false || isWorkWheel2 == false || isWorkWheel3 == false || isWorkWheel4 == false) {
            System.out.println("колесо проколото");
        }
        else {
            System.out.println("машина завелась");
        }

        var number = '1';
        var string = "1";
    }


}
