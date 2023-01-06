package chapter03.used;

// Calculatorの実装クラス
public class AddCalc implements Calculator {
    @Override
    public int calc(int x,int y){
        return x+y;
    }
}
