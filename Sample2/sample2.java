//ライブラリインポート（IOException,BufferedReaderなどクラスを利用するため）
import java.io.*;

class Sample2 {
    public static void main(String[] args)throws IOException{ //例外を送出するメソッド
        //初期化
        int price;

        //BufferedReaderクラスのインスタンスを生成して、brという変数に代入
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        //値入力
        System.out.println("値段を入力してください。");
        //標準入力の値をbr.readLine()で取得しint型に変換
        price = Integer.parseInt(br.readLine());//値段を入力

        //出力
        System.out.println("値段: " + price + " 円");
    }
}