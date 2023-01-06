import java.io.*;

class Sample5{
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        System.out.println("OSは？");
        // System.out.println("0…Windows / 1…Mac OS X / 2…Linux / 3…その他のOS");
        // br.readLine()で文字列を取得できるためint型に変換する
        // int os = Integer.parseInt(br.readLine());

        // switch(os){
        //     case 0:
        //         System.out.println("Windows");
        //         break;
        //     case 1:
        //         System.out.println("マカー");
        //         break;
        //     case 2:
        //         System.out.println("Linux");
        //         break;
        //     default:
        //         System.out.println("その他");
        //         break;
        // }
        System.out.println("W…Windows / M…Mac OS X / L…Linux / X…その他のOS");

        // br.readLine()は入力文字列を取得する
        // charAt(0)で1文字目を取得する
        char initial = br.readLine().charAt(0);

        switch(initial){
            case 'w':
            case 'W':
                System.out.println("Windows");
                break;
            case 'm':
            case 'M':
                System.out.println("Mac");
                break;
            case 'l':    
            case 'L':
                System.out.println("Linux");
                break;
            default:
                System.out.println("その他");
                break;
        }
    }
}