// Randomクラスを使えるようにする
import java.util.Random;

class Sample3 {
    public static void main(String[] args){
        
        // Randomクラスのインスタンスを作成
        Random rnd = new Random();

        System.out.println("さいころを振ります。");

        // rdnインスタンスのnextIntメソッドを実行
        int num = rnd.nextInt(6);    //0から5までの乱数を発生
        num++;    //1から6までに変換
        System.out.println(num + "が出ました。");
    }
}