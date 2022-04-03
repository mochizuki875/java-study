import java.io.*;

class Sample6{
    // public static void main(String[] args) {
    //     int i;
    //     for (i= 1; i<=3; i++) {
    //         System.out.println(i);
    //     }
    //     System.out.println("END");
    // }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // System.out.println("*をいくつ表示しますか？");
        // int num = Integer.parseInt(br.readLine());

        // for(int i = 1; i <= num; i++){
        //     System.out.print("*");
        // }
        System.out.println("数字を入力してください。");
        int num = Integer.parseInt(br.readLine());
        int sum =0;
        for(int i =1; i<=num; i++){
            sum += i;

            if(i<num){
                System.out.print(i + "+");
            } else {
                System.out.print(i + "=" + sum);
            }  
        }

        System.out.println("");
    }
}