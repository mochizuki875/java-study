class Sample28{
   // オーバーロードを効果的に使う例
   // 同じような性質の関数を同名で用意する

   /*---- [1] : 初項mから末項nまでの和を返す ----*/
   static int sumUp(int m, int n){
        int sum = 0;
        for(int i = m; i <= n; i++){
            sum += i;
        }
        return sum;
    }

    /*---- [2] : 初項1から末項nまでの和を返す ----*/
    static int sumUp(int n){
        // int sum = 0;
        // for(int i = 1; i <= n; i++){
        //     sum += i;
        // }
        // return sum;

        // 処理を流用
        return sumUp(1, n);
    }

    public static void main(String[] args){
        System.out.println("1から10までの和は" + sumUp(10) + "です。");
        System.out.println("-2から4までの和は" + sumUp(-2, 4) + "です。");
        System.out.println("-5から2までの和は" + sumUp(-5, 2) + "です。");
    }
}