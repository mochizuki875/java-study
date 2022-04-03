class Sample25{
    // 配列をコピーするメソッド
    static int[] arrayClone(int[] x){
        int[] y = new int[x.length];
        for(int i = 0;i<x.length;i++) y[i]=x[i];
        return y;
    }

    // 配列を表示するメソッド
    static void printArray(int[] x){
        for(int i=0; i< x.length;i++) System.out.printf(" %2d",x[i]);
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {6, 7, 8, 9};

        System.out.print("aが指す配列本体は");
        // 配列の表示
        printArray(a);

        System.out.print("bが指す配列本体は");
        // 配列の表示
        printArray(b);

        // 配列aを配列bにクローン
        b = arrayClone(a);
        

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
    }
}