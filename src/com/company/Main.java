package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println((multadd(10.0, 20.0, 30.0)));

        System.out.println(Math.sin(Math.PI/4) + (Math.cos(Math.PI/4))/2);
        System.out.println(Math.log(10)+Math.log(20));
        System.out.println(expSum(5));

    }

    public static double multadd(double a, double b , double c){
        return a * b + c;
    }

    public static double expSum(double x){
        return x * Math.exp(-x) + Math.sqrt(1 - Math.exp(-x));
    }
}
