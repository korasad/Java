package lab9;

import java.util.Scanner;


class Exception1 {
    public void exceptionDemo_1() {
        System.out.println( 2 / 0 ); //2,0 / 0,0
    }

    public void exceptionDemo_2() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }
}

class Exception2 {
    public void exceptionDemo_1() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer "); //Qwerty 0 1.2 1
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        System.out.println(2 / i);
    }

    public void exceptionDemo_2() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer "); //Qwerty 0 1.2 1
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.print("Not valid type ");
        }

    }

    public void exceptionDemo_3() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer "); //Qwerty 0 1.2 1
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (Exception e) {
            System.out.print("Common ex");
        }

    }

    public void exceptionDemo_4() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer "); //Qwerty 0 1.2 1
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (Exception e) {
            System.out.print("Common ex");
        } finally {
            System.out.print("Program finished");
        }

    }
}
//Задание 5-8
class ThrowsDemo {
    public void getKey(){
        Scanner myScanner = new Scanner( System.in );
        while(true)
        {
            System.out.print("Enter Key ");
            String key = myScanner.nextLine();
            try
            {
                printDetails(key);
                break;
            }
            catch (Exception e) {
                System.out.println("Not valid key? try again");
                continue;
            }
        }
    }
    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println( message ); }
    private String getDetails(String key) throws Exception {
        if(key.equals("")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }
}
