// クラスメソッドの基礎
class Sample19{
    // クラスメソッド定義

    // 「こんにちは。」を出力するメソッド
    // static void hello(){
    //     System.out.println("こんにちは。");
    //     return;
    // }

    //入力された文字列を指定された回数表示するメソッド
    static void printMessage(String msg,int n){
        for(int i=0;i<n;i++){
            System.out.println(msg + i + "回目");
        }

    }

    public static void main(String[] args) {
        
        // hello();
        printMessage("test",4);
    }
}