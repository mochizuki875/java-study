// 多次元配列
import java.io.*;

class Sample18{
    public static void main(String[] args) throws IOException{
        //多次元配列
        // int[][] a = new int[2][5];

        // a[0][0] = 64;    //1番目の人の英語の得点
        // a[0][1] = 75;    //2番目の人の英語の得点
        // a[0][2] = 40;    //3番目の人の英語の得点
        // a[0][3] = 92;    //4番目の人の英語の得点
        // a[0][4] = 58;    //5番目の人の英語の得点
        // a[1][0] = 71;    //1番目の人の数学の得点
        // a[1][1] = 62;    //2番目の人の数学の得点
        // a[1][2] = 54;    //3番目の人の数学の得点
        // a[1][3] = 90;    //4番目の人の数学の得点
        // a[1][4] = 84;    //5番目の人の数学の得点

        // int[][] a = {
        //     {64, 75, 40, 92, 58},
        //     {71, 62, 54, 90, 84}
        // };

        // for(int j =0; j < 5; j++){
        //     System.out.println((j + 1) + "番目の人の英語の得点は" + a[0][j] + "点です。");
        //     System.out.println((j + 1) + "番目の人の数学の得点は" + a[1][j] + "点です。");
        // }

        int[][] a;
        // 配列要素の長さは揃っていなくても良い
        a = new int[4][];
        a[0] = new int[2];
        a[1] = new int[4];
        a[2] = new int[3];
        a[3] = new int[5];

        System.out.println("配列aの長さは " + a.length);
        for(int i = 0; i < a.length; i++){
            System.out.println("配列a[" + i +"]の長さは" + a[i].length + "です。");
        }

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                System.out.printf(" %2d", a[i][j]);
            }
            System.out.println();
        }
    }
}