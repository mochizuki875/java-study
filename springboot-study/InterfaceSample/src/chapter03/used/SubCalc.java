package chapter03.used;

// Calculatorの実装クラス
public class SubCalc implements Calculator {
    @Override
    public int calc(int x,int y){
        return x-y;
    }
    
}
