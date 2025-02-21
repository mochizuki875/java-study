package chapter03.use;

import chapter03.used.AddCalc;
import chapter03.used.Calculator;
import chapter03.used.SubCalc;

public class main {
    public static void main(String[] args) throws Exception {
        // Calculator calculator = new AddCalc(); // インターフェイスにクラスを実装
        Calculator calculator = new SubCalc(); // calc()を引き算にしたければ実装を変えれば良い(インターフェイスは同じ)
        System.out.println("calc(x,y) = " + calculator.calc(10, 5) );
    }
}
