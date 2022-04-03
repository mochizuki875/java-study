// コマンドライン引数
// mainメソッドを検証するプログラム実行時に
// java sample29 hoge huga
// の形で変数を渡すとmainの引数であるargsに値が格納される
// (注意)コマンドライン引数は文字列として格納される為、数値として扱う場合はへんかんが必要
// s = Integer.parseInt(args[i]);

class Sample29{
    public static void main(String[] args){
        if(args.length == 0){
            System.out.println("コマンドライン引数が有りません。");
        }else{
            for(int i = 0; i < args.length; i++){
                System.out.println((i + 1) + "番目 : " + args[i]);
            }
        }
    }
    
}