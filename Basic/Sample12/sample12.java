// 配列の基礎
import java.io.*;

class Sample12{
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        // 要素数を標準入力から取得
        System.out.println("要素数は？");
        int num = Integer.parseInt(br.readLine());

        // 指定された要素数で配列を初期化
        int[] a = new int[num];

        // 標準入力から各要素の値を取得し配列に格納する
        for(int i=0;i<a.length;i++){
            System.out.println("a[" + i + "]=?");
            a[i]=Integer.parseInt(br.readLine());
        }

        // 合計値初期化
        double sum=0;
        // 最大値要素番号初期化
        int max_i = 0;

        System.out.println("入力された値は以下の通り。");
        for(int i=0;i<a.length;i++){
            // 各要素の値出力
            System.out.printf(" %2d", a[i]);
            // 合計値の計算
            sum+= a[i];

            // 最大値の要素番号更新
            if (a[max_i]<a[i]) max_i=i;

        }

        // 平均値の出力
        System.out.println("");
        System.out.println("平均値は" + sum/a.length);

        // 最大値の出力
        System.out.println("最大値はa[" + max_i + "]=" + a[max_i]);
    }
}