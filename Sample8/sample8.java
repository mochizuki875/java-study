import java.io.*;

class Sample8{
    public static void main(String[] args) {
        System.out.println("掛け算表");

        for(int i=1; i<=9; i++){
            for(int j=1; j<=9; j++){
                // System.out.print(i*j + " ");

                // " %2d"によりスペースと半角2文字分の表示をする。
                System.out.printf(" %2d", i*j);
            }
            System.out.println("");
        }
    }
}