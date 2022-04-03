import java.io.*;

class Sample14{
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {6, 7, 8, 9};
        int[] c = {9, 9, 9};

        // a,b, c各配列要素を表示
        System.out.print("aが指す配列本体は");
        for(int i = 0; i < a.length; i++)
            System.out.printf(" %2d", a[i]);
        System.out.println();
        System.out.print("bが指す配列本体は");
        for(int i = 0; i < b.length; i++)
            System.out.printf(" %2d", b[i]);
        System.out.println();
        System.out.print("cが指す配列本体は");
        for(int i = 0; i < c.length; i++)
            System.out.printf(" %2d", c[i]);
        System.out.println();

        // aが参照している先をbも見るようになる（コピーされるわけではない）
        b = a;
        System.out.println("aをbに代入しました。");

        // 配列cにaをコピーする
        // 配列cを初期化
        c= new int[a.length];
        for(int i=0; i < a.length; i++) c[i] = a[i];

        // 配列bの要素を変更してみる（aの要素にも影響する）
        b[0] = 10;
        System.out.println("b[0]に10を代入しました。");


        System.out.print("aが指す配列本体は");
        for(int i = 0; i < a.length; i++)
            System.out.printf(" %2d", a[i]);
        System.out.println();
        System.out.print("bが指す配列本体は");
        for(int i = 0; i < b.length; i++)
            System.out.printf(" %2d", b[i]);
        System.out.println();
        System.out.print("cが指す配列本体は");
        for(int i = 0; i < c.length; i++)
            System.out.printf(" %2d", c[i]);
        System.out.println();
        
    }
}