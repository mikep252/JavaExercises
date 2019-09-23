package com.company;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
    public double getAdditionResult(){
        // adding
      return (getFirstNumber()+getSecondNumber());
    }
    public double getSubtractionResult()
    {
        // substracing
        return (getFirstNumber()-getSecondNumber());
    }
    public double getMultiplicationResult(){
        // multiplying
        return (getFirstNumber()*getSecondNumber());
    }
    public double getDivisionResult(){
        ///dividing
        if (getSecondNumber() == 0.0)
        {
            return 0.0;
        }else {
            return (getFirstNumber() / getSecondNumber());
        }
    }
}
