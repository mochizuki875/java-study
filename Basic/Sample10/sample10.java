// ループにラベルを付与する例
import java.io.*;

class Sample10{
    public static void main(String[] args) throws IOException{
        // BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        // System.out.println("1からどの数の奇数和を求めますか？");
        // int num = Integer.parseInt(br.readLine());

        // int sum = 0;
        // for(int i=1; i<= num; i++){
        //     if(i%2 == 0){ //偶数ならスキップ
        //         continue; //ループをスキップする
        //     }
        //     sum += i;
        // }
        // System.out.println(sum);
        RowLoop:
            for(int i = 1; i <= 9; i++){
                for(int j = 1; j <= 9; j++){
                    if(i * j % 2 == 0){
                        System.out.println();
                        // continueもbreakと同様にループラベルを指定して抜けるループを指定できる。
                        continue RowLoop;
                    }
                    System.out.printf(" %2d", i * j);
                }
                System.out.println();
            }
    }
}