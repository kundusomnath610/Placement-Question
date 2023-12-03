import java.util.InputMismatchException;
import java.util.Scanner;

public class ATM {

    float Balance;
    int pin = 5678;

//    public void checkPin() {
//        System.out.println("Enter Your pin:");
//        Scanner sc = new Scanner(System.in);
//        int enteredPin = sc.nextInt();
//
//        if (enteredPin == pin) {
//            menu();
//        } else {
//            System.out.println("Entered pin Wrong");
//        }
//    }


    public void checkPin() {
        try {
            System.out.println("Enter Your pin:");
            Scanner sc = new Scanner(System.in);
            int enteredPin = sc.nextInt();

            if (enteredPin == pin) {
                menu();
            } else {
                System.out.println("Entered pin Wrong");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid Pin Only.");
        }
    }


    public void menu() {
        System.out.println("Enter your choice");
        System.out.println("1. Check your Bal");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");

        Scanner scn = new Scanner(System.in);
        int opt = scn.nextInt();

        if (opt == 1) {
            checkBal();
        } else if (opt == 2) {
            withdraw();
        } else if (opt == 3) {
            DepositMoney();
        } else if (opt == 4) {
            Exit();
        } else {
            System.out.println("Enter a valid input");
        }
    }

    public void checkBal() {
        System.out.println("Print Balance:-" + Balance);
        menu();
    }

    public void withdraw() {
        System.out.println("Enter the amount");
        Scanner scn = new Scanner(System.in);
        float amount = scn.nextFloat();
        if(amount > Balance) {
            System.out.println("Insufficient bal");
        } else {
            Balance = Balance - amount;
            System.out.println("Money withdrawn Successfully");
            menu();
        }
    }

    public void DepositMoney() {
        System.out.println("Enter The amount");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money Deposit Successful");
        menu();
    }

    public void Exit() {
        System.out.println("Thank You!!!");
    }
}
