import java.io.*;

class Sample21{
    // クラスメソッド定義

    //入力された数値間の整数和を計算するメソッド
    static int sumUp(int n ,int m){
        // ローカル変数（メソッド内のみで有効）
        int sum =0;
        if(n<m){
            // System.out.println(n + "~" + m + "までの和");
            for(int i=n;i<=m;i++){
                sum+=i;
            }
        } else {
            System.out.println("入力値が不正です");
        }
        return sum;

    }

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("1つ目数字を入力して下さい");
        int num1 = Integer.parseInt(br.readLine());

        System.out.println("2つ目数字を入力して下さい");
        int num2 = Integer.parseInt(br.readLine());

        System.out.println(sumUp(num1,num2));
        
    }
}