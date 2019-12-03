package com.example.demo.lambda;

public class Lambda {


    MathOperation mathOperation = (int a ,int b) -> a + b;

    public void test(){
        
    }


    interface MathOperation {
        int addOperation(int a,int b);
    }
}
