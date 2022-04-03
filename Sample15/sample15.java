// 変数の開放（null化）
class Sample15{
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};

        // 配列変数そのものを表示
        System.out.println("a = " + a);

        a = null;    //nullを代入することにより、配列変数aは空参照となる→Garbage Collectionにより領域開放される。
        System.out.println("a = " + a);
    }
}