package az.edu.turing;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("ededi daxil edin:");
            int number= scanner.nextInt();
            System.out.print("diveded or indiveded:");
            System.out.print( number%3==0 && true || false);
        }
    }
