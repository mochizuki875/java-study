import java.io.*;

class Sample7{
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        // int i=1;
        // while(i<=10){
        //     System.out.println(i);
        //     i++;
        // }

        // 実行文を最低1回は実行（do-while）
        int i= 1;
        do{
            System.out.println(i);
            i++;
        }while(i<3);

    }
}