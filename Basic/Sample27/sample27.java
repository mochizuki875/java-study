class Sample27{
    // 同じ名前のメソッドが複数定義されている（オーバーロード）が、
    // シグネチャ（メソッド名＋仮引数の個数）が異なるパターン
    // 正常にコンパイルできる

    /*---- [1] : int型のa, bの最大値を返す ----*/
    static int max(int a, int b){
        return a > b ? a : b;
    }
    
    /*---- [2] : int型のa, b, cの最大値を返す ----*/
    static int max(int a, int b, int c){
        int max = a;
        if(b > max) max = b;
        if(c > max) max = c;
        return max;
    }
    
    /*---- [3] : double型のa, bの最大値を返す ----*/
    static double max(double a, double b){
        return a > b ? a : b;
    }
    
    /*---- [4] : double型のa, b, cの最大値を返す ----*/
    static double max(double a, double b, double c){
        double max = a;
        if(b > max) max = b;
        if(c > max) max = c;
        return max;
    }
    
    public static void main(String[] args){
        System.out.println("1, -2の最大値は" + max(1, -2) + "です。");
        System.out.println("1, -2, 5の最大値は" + max(1, -2, 5) + "です。");
        System.out.println("0.5, -2.1の最大値は" + max(0.5, -2.1) + "です。");
        System.out.println("0.5, -2.1, 5.4の最大値は" + max(0.5, -2.1, 5.4) + "です。");
    }
}