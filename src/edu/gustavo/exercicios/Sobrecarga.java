package edu.gustavo.exercicios;

public class Sobrecarga {
    public static void main(String[] args) {
        System.out.println(area(4,3,5));
    }

    public static double area(double base, double height){
        return (base * height);
    }

    public static double area(double largerBase, double smallerBase, double height){
        return ((largerBase + smallerBase) * height) / 2;
    }
}
