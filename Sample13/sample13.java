import java.io.*;

class Sample13{
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

        // 大きい順に並び替え
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i]<a[j]){
                    int tmp=a[i];
                    a[i]=a[j];
                    a[j]=tmp;
                }       
            }
        }

        System.out.println("入力された値は以下の通り。");
        for(int i=0;i<a.length;i++){
            // 各要素の値出力
            System.out.printf(" %2d", a[i]);

        }
    }
}