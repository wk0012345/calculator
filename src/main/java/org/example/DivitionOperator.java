package org.example;

public class DivitionOperator implements NewArithmeticOperator{
    @Override
    public boolean surpports(String operator) {
        return "/".equals(operator);
    }

    @Override
    public int calculator(int operand1, int operand2) {
        if(operand2 == 0){

            System.out.println("operand2: "+ operand2);
            throw new IllegalArgumentException("");
        }
        return operand1 / operand2;
    }
}
