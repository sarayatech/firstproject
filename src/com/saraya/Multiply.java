package com.saraya;

public class Multiply {

    private int number = 1;

    public Multiply(int number){
        this.number = number;
    }

    public Multiply(){}

    void multiplication(){
        for(int i = 1; i <= 10; i++){
            System.out.println(this.number + " x " + i + " = " + this.number*i);
        }
    }
    public static void main(String[] args) throws Exception {
        Multiply multiplyByDefault = new Multiply();

        multiplyByDefault.multiplication();

        System.out.println("Multiply By given number");

        Multiply multiplyByGivenNumber = new Multiply(7);

        multiplyByGivenNumber.multiplication();

    }
}