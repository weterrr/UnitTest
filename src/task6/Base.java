package task6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Base {
    public static void main(String[] args) {

        try {
            Scanner myScn = new Scanner(System.in);
            int choice;


            System.out.println("\nВведите первое число:");

            double firstNumber = myScn.nextDouble();
            System.out.println("Введите второе число:");

            double secondNumber = myScn.nextDouble();


            CalcOOP myCalculator = new CalcOOP(firstNumber, secondNumber);
            System.out.println();


            while (true) {

                System.out.println("\nВыберите операцию ");
                System.out.println("1. +");
                System.out.println("2. -");
                System.out.println("3. *");
                System.out.println("4. /");
                System.out.println("5. Выход из программы.");


                choice = myScn.nextInt();


                switch (choice) {
                    case 1:
                        System.out.printf("\n%.4f + %.4f = %.4f\n\n",
                                myCalculator.getFirstNumber(), myCalculator.getSecondNumber(), myCalculator.plus());
                        break;
                    case 2:
                        System.out.printf("\n%.4f - %.4f = %.4f\n\n",
                                myCalculator.getFirstNumber(), myCalculator.getSecondNumber(), myCalculator.minus());
                        break;
                    case 3:
                        System.out.printf("\n%.4f * %.4f = %.4f\n\n",
                                myCalculator.getFirstNumber(), myCalculator.getSecondNumber(), myCalculator.multiplication());
                        break;
                    case 4:
                        System.out.printf("\n%.4f / %.4f = %.4f\n\n",
                                myCalculator.getFirstNumber(), myCalculator.getSecondNumber(), myCalculator.division());
                        break;
                    case 5:
                        System.out.println("\nВыход из программы...\n");
                        return;
                    default:
                        System.out.println("\nТакой операции нет, выберите другую операцию!\n");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }
    }
}