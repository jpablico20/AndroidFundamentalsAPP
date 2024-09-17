package com.example.bmicalculator.model;


public class BMIcalculatorModel {

    private double FirstNumber;
    private double SecondNumber;

    public double getFirstNumber() {
        return FirstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.FirstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return SecondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.SecondNumber = secondNumber;
    }

    public String bmi(){
        double num1_sqr = FirstNumber * FirstNumber;
        double bmi = SecondNumber / num1_sqr;
        return String.format("%.3f", bmi);
    }

    public String status(){
        double bmi = Double.parseDouble(bmi());

        if (bmi < 18.5){
            return "Underweight";
        } else if (bmi >= 18.5 && bmi <=24.9) {
            return "Normal";
        } else if (bmi >= 25.0 && bmi <= 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }


    }
}
