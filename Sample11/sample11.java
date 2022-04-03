// 配列の基礎
class Sample11{
    public static void main(String[] args) {
        
        // 配列宣言と配列生成
        // int[] a;
        // a= new int[5];

        // int[] a = new int[5];

        int[] a = {1,2,3,4,5}; 

        // a[0]=1;
        // a[1]=2;
        // a[2]=3;
        // a[3]=4;
        // a[4]=5;


        for(int i=0; i<a.length; i++){
            System.out.println("a[" + i + "]=" + a[i]);
        }

    }
}