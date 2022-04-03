import java.io.*;
import java.util.Random;

class Sample23{
    // 階乗を求めるメソッド(12まで) 
    static int factorial(int n){
        int factorial = 1;
        if(n>0){
            for(int i=n; i>0; i--){
                factorial *= i;
            }
        }
        return factorial;
    }
    // 順列の総数を求めるメソッド
    static int permutation(int n, int r){
        int p= factorial(n)/factorial(n-r);
        return p;
    }

    // 組合せの総数を求めるメソッド
    static int combination(int n, int r){
        int c = permutation(n, r)/factorial(r);
        return c;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

        System.out.print("n=");
        int n = Integer.parseInt(br.readLine());
        System.out.println();
        System.out.print("r=");
        int r = Integer.parseInt(br.readLine());
        System.out.println();

        System.out.println(n + "! =" + factorial(n));
        System.out.println(n + "P" + r + "=" + permutation(n,r));
        System.out.println(n + "C" + r + "=" + combination(n,r));

    }
}