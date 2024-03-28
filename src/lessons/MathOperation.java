package lessons;

public class MathOperation {
    public static void main(String[] args) {
        // + - * /
        int number1 = 48;
        int number2 = 2;
        // сложение
        System.out.println("сложение: " + (number1 + number2));
        //вычитание
        System.out.println("вычитание: " + (number1 - number2));
        //умножение
        System.out.println("умножение: " + number1 * number2);
        //деление
        System.out.println("деление: " + number1 / number2);
        System.out.println("_______________________________________________________________--");
        //сокращенные операции
        System.out.println(number1+=number2);
        System.out.println(number1-=number2);
        System.out.println(number1*=number2);
        System.out.println(number1/=number2);

        char p = 'p';
        char i = 'i';
        char d = 'd';
        char o = 'o';
        char r = 'r';

        //конкатонация - соединение строк
        System.out.println("_______________________________________________________________--");
        System.out.println('p');

        System.out.println("_______________________________________________________________--");
        
        //логические переменная
        boolean isMotion = false;
        boolean isWork = true;

        System.out.println(isWork);
        System.out.println(isMotion);

        //логическими операторы

        // if - если
        // else if - так же если
        // else - так же

        if(isWork == true) {
            System.out.println("машина работает");
        } else {
            System.out.println("машина сломана");
        }

        // Логические операции
        // && - и
        // || - или
        // == - равно
        // != - не равно
        // > - больше
        // >= больше или равно
        // < - меньше
        // <= меньше или равно






    }
}
