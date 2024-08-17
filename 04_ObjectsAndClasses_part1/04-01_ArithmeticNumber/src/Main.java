import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int inputA = 0;
        int inputB = 0;
        int numOperation = 0;
        char comparingNumbersOn = ' ';

        System.out.println("ПРОГРАММА ДЛЯ РАСЧЕТА СУММЫ, ПРОИЗВЕДЕНИЯ ЧИСЕЛ, а также");
        System.out.println("КАКОЕ ИЗ ПЕРЕДАВАЕМЫХ ЧИСЕЛ - БОЛЬШЕ ИЛИ МЕНЬШЕ, либо ОНИ РАВНЫ");
        System.out.println("---");
        System.out.print("Для продолжения нажмите ENTER ");
        keyboard.nextLine();

        System.out.println();

        Arithmetic generalArithmetic = new Arithmetic(inputA, inputB);

        System.out.println("ВВОД ИСХОДНЫХ ДАННЫХ:");
        generalArithmetic.inputNumber();

        System.out.println();

        while (numOperation != 1 || numOperation != 2 || numOperation != 3) {

            System.out.println("Укажите, какие результаты вычислений данных чисел Вы ходите получить?");
            System.out.print("(1 - СУММА чисел, 2- ПРОИЗВЕДЕНИЕ чисел, 3 - СУММА+ПРОИЗВЕДЕНИЕ+СРАВНЕНИЕ чисел) ");
            numOperation = keyboard.nextInt();

            if ((numOperation >= 0 && numOperation > 3) || (numOperation <= 0)) {
                System.out.println("Вы ввели недопустимое значение! ");
                System.out.println("Введите корректное значение!");
                System.out.println("");
            }

            if (numOperation == 1 || numOperation == 2 || numOperation == 3) {
                break;
            }

        }

        System.out.println();

        if (numOperation == 1 || numOperation == 2) {

            while (comparingNumbersOn != 'Д' || comparingNumbersOn != 'д' || comparingNumbersOn != 'Н' ||
            comparingNumbersOn != 'н') {
                System.out.print("Также, укажите понадобиться ли СРАВНЕНИЕ (больше, меньше или равно) чисел? (Д/Н) ");
                comparingNumbersOn = keyboard.findWithinHorizon(".",0).charAt(0);

                if (comparingNumbersOn != 'Д' || comparingNumbersOn != 'д' || comparingNumbersOn != 'Н' ||
                        comparingNumbersOn != 'н') {
                    System.out.println("Вы ввели недопустимый символ!");
                    System.out.println("Введите корректный символ!");
                    System.out.println();
                }

                if (comparingNumbersOn == 'Д' || comparingNumbersOn == 'д' || comparingNumbersOn == 'Н' ||
                        comparingNumbersOn == 'н') {
                    break;
                }
            }



        }

        System.out.println();
        System.out.println("РЕЗУЛЬТАТ ВАШЕГО ЗАПРОСА:");
        System.out.println("---");

        if (numOperation == 1) {

            generalArithmetic.printSumm();

            if (comparingNumbersOn == 'Д' || comparingNumbersOn == 'д') {
                generalArithmetic.printComparingNumbers();
            }

        }

        else if (numOperation == 2) {

            generalArithmetic.printComposition();

            if (comparingNumbersOn == 'Д' || comparingNumbersOn == 'д' ) {
                generalArithmetic.printComparingNumbers();
            }

        }

        else if (numOperation == 3) {

            generalArithmetic.printAllArithmetics();

        }

        System.out.println();

        System.out.println("==========================================");
        System.out.println("      ВЫПОЛНЕНИЕ ПРОГРАММЫ ЗАВЕРШЕНО    ");
        System.out.println("==========================================");
    }

}
