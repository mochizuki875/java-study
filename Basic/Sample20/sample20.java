import java.io.*;

class Sample20{
    // クラスメソッド定義

    //入力された数値を判定するメソッド
    static void decideSign(double n){
        System.out.print("入力された数字"+ n + "は、");
        if(n > 0){
            System.out.println("正の数です");
        } else if(n == 0 ){
            System.out.println("0です");
        } else {
            System.out.println("負の数です");
        }
    }

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("数字を入力して下さい");
        double num = Double.parseDouble(br.readLine());
        decideSign(num);
        
    }
}