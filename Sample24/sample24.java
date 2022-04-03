class Sample24{
    // 与えられた配列から最大値の要素番号を求めるメソッド
    static int indexOfMax(int[] x){
        int imax = 0;
        for(int i =1 ; i < x.length; i++){
            if(x[i] > x[imax]){
                imax = i;
            }
        }
        return imax;
    }

    // 与えられた配列の要素を大きい順に並び替えるメソッド
    static void descendingSort(int[] x){
        for(int i=0; i<x.length-1; i++){
            for(int j=i+1;j<x.length; j++){
                if(x[j]>x[i]){
                    int tmp = x[i];
                    x[i]=x[j];
                    x[j]=tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {64, 75, 40, 92, 58};

        descendingSort(a);

        for(int i = 0; i < a.length; i++){
            System.out.println((i + 1) + "番の人の得点は" + a[i] + "点です。");
        }

        int imax = indexOfMax(a);
        System.out.println("最高得点は" + (imax + 1) + "番の人の" + a[imax] + "点です。");
    }
}