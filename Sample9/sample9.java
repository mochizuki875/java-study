// 素数を判定するプログラム

import java.io.*;

class Sample9{
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        System.out.println("正の整数を入力してください。");
        int num = Integer.parseInt(br.readLine());
        boolean prime = true;

        //ループにラベルを付与
        EvaluateLoop:
            for(int i =2; i< num; i++){
                if(num %i == 0){
                    prime = false;
                    // 通常breakは直前のループを抜ける
                    // break;
                    // ラベルを指定することで抜けるループを指定できる
                    break EvaluateLoop;
                }
            }
        
        if(num == 1) prime=false;

        if(prime) System.out.println(num + "は素数です。");
        else System.out.println(num + "は素数ではありません。");

    }
}