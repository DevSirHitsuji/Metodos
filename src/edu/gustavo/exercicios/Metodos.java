package edu.gustavo.exercicios;
import java.util.Scanner;

public class Metodos {
    public static void main(String[] args) {
        finalValue(2000.0f, 6);
    }

    //Methods

    public static void finalValue(float value, int portion){
        float rate = 13.0f;//rate for mouth
        float valueFinal = value;
        for (int i = 0; i < portion; i++){
            valueFinal = valueFinal + rate;
        }
        System.out.println("The amount you have to payment is: " + valueFinal);
    }

    public static void kindness(float time){
        if (time >= 0f && time < 12f){
            print("Hello, good morning!");
        }
        else if (time >= 12f && time < 18f){
            print("Hello, good afternoon!");
        }
        else if(time >= 18f && time < 24f){
            print("Hello, good night!");
        }
        else{
            print("This hour is absurd!");
        }
    }

    public static void calculator(){
        try (Scanner scan = new Scanner(System.in)){
            System.out.print("Select the operation, please:\n1-Sum\n2-Subtraction\n3-Multiplication\n4-Division\n\nOption: ");
            String option = scan.next();
            System.out.print("\nNum1: ");
            float num1 = scan.nextFloat();
            System.out.print("Num2: ");
            float num2 = scan.nextFloat();
            
            //just jump one line
            System.out.println();

            switch (option){
                case "1":
                sum(num1, num2);
                break;
                
                case "2":
                subtraction(num1, num2);
                break;

                case "3":
                multiplication(num1, num2);
                break;

                case "4":
                division(num1, num2);
                break;
            }
        }
    }

    public static void sum(float num1, float num2){
        System.out.println("The result is: " + (num1 + num2));
    }

    public static void subtraction(float num1, float num2){
        System.out.println("The result is: " + (num1 - num2));
    }   

    public static void multiplication(float num1, float num2){
        System.out.println("The result is: " + (num1 * num2));
    }   

    public static void division(float num1, float num2){
        System.out.println("The result is: " + (num1 / num2));
    }

    public static void print(String phrase){
        System.out.println(phrase);
    }

}

