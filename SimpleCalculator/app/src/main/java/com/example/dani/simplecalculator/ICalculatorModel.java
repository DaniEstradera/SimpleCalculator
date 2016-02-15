package com.example.dani.simplecalculator;

/**
 * Created by Dani on 15/2/16.
 */
public interface ICalculatorModel {
    final String ERROR_TEXT = "Error";
    void inputValue(String input);
    void inputOperation(CalculatorArithmetic.UnaryOperations operation);
    void inputOperation(CalculatorArithmetic.BinaryOperations operation);
    String readScreen();
    String getState();
    void setState(String state);
}