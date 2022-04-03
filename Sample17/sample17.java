// 配列のループ
class Sample17{
    public static void main(String[] args) {
       double[] radii={1.0, 2.0, 3.0, 4.0};
       double pi = 3.14;
       
       // 拡張for文
       // radiusにradiiの要素を順番に格納して配列要素数分ループを実行
       for(double radius:radii){
        System.out.println("半径" + radius + "の円の円周 = " + 2 * pi * radius);
       }
    }
}