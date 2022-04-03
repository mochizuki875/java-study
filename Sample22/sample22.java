import java.io.*;
import java.util.Random;

class Sample22{
    // フィールド（メソッドの外で定義する変数）
    static int hiScore;

    // ハイスコアを更新するメソッド
    static void updateHiScore(int score){
        if(score > hiScore){
            System.out.println("ハイスコア！");
            hiScore=score;
        }
    }

    public static void main(String[] args) throws IOException{
        //BufferedReaderクラスのbrインスタンス生成（標準入力取得） 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Randomクラスのrndインスタンス生成
        Random rnd = new Random();

        while(true){
            int cont;
            do{
                System.out.println("釣りますか？[Yes:1/No:0]");
                cont = Integer.parseInt(br.readLine());
            }while(cont!=1 && cont !=0);

            // ０が入力されたらゲーム終了
            if( cont==0 )break;

            // スコアを算出
            int score = rnd.nextInt(1000);
            System.out.println(score + "グラムの魚が釣れました。");
            
            // ハイスコアを更新
            updateHiScore(score);
            System.out.println("現在のハイスコアは" + hiScore + "グラムです");
            System.out.println();
        }
    }
}