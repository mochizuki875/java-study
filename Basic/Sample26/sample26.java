class Sample26{
    // 2次元配列表示メソッド
    static void printMatrix(int x[][]){
        for(int i=0;i<x.length; i++){
            for(int j=0; j<x[i].length;j++){
                System.out.printf(" %2d",x[i][j]);
            }
            System.out.println();
        }

    }
    
    // 2次元配列の各要素を加算して第３引数の配列に格納するメソッド
    static void addMatrix(int[][] x,int[][] y, int[][] z){
        for(int i=0;i<x.length; i++){
            for(int j=0; j<x[i].length;j++){
                z[i][j] = x[i][j]+y[i][j];
            }
        }
    }

    // 2次元配列の各要素をn倍するメソッド
    static int[][] multiplyMatrixByScalar(int[][] x,int n){
        int[][] y = new int[x.length][];
        for(int i=0; i<x.length; i++){
            //各要素ごと2次元目の要素数を初期化
            y[i] = new int[x[i].length];
            for(int j=0; j<x[i].length; j++){
                y[i][j] = x[i][j]*n;
            }
        }
        return y;
    }

    public static void main(String[] args){
        int[][] a = { {1, 0, 1}, {0, -4, 2} };
        int[][] b = { {5, -3, 0}, {0, 2, -1} };
        int[][] c = new int[2][3];

        // 配列a,bの各要素の和をcに格納
        addMatrix(a, b, c);

        // aの各要素を2倍した配列をdとする
        int[][] d = multiplyMatrixByScalar(a, 2);

        System.out.println("行列a");    printMatrix(a);
        System.out.println();
        System.out.println("行列b");    printMatrix(b);
        System.out.println();
        System.out.println("行列c");    printMatrix(c);
        System.out.println();
        System.out.println("行列d");    printMatrix(d);
    }
}