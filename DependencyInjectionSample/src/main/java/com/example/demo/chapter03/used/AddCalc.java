package com.example.demo.chapter03.used;
import org.springframework.stereotype.Component;

@Component
public class AddCalc implements Calculator {
    @Override
    public int calc(int x,int y){
        return x + y;
    } 
    
}
