import java.io.*;

class Sample4{
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        System.out.println("得点は？");
        int point = Integer.parseInt(br.readLine());

        System.out.println("評価は？");
        int evaluate = Integer.parseInt(br.readLine());

        // ifの後には;を入れてはダメ
        // if(point>=80)
        //   System.out.println("合格");

        // if-elseバージョン
        // if(point>=80){
        //     System.out.println("合格");
        // } else if(point>=70){
        //     System.out.println("惜しい！");
        // } else {
        //     System.out.println("不合格");
        // }

        // 論理演算
        // if (point>=80 && evaluate >= 4) {
        //     System.out.println("A");
        // } else if (point>=50 && evaluate >= 3){
        //     System.out.println("B");
        // } else if (point >= 90 || evaluate >= 5){
        //     System.out.println("B");
        // } else {
        //     System.out.println("C");
        // }
        
        //条件演算
        // int max;
        // if (point >= evaluate){
        //     max = point;
        // } else {
        //     max =evaluate;
        // }
        int max = point >= evaluate ? point : evaluate;

        System.out.println(max);

    }
}