class Sample1 {
    public static void main(String[] args){

        //型宣言
        String name;
        int price;
        double rate;

        name = "本";
        price = 2000;
        rate = 4.2;

        System.out.println("商品名：" + name);
        System.out.println("値段：" + price + "円");
        System.out.println("評価：" + rate + "星");

        int value = 1;
        System.out.println("FirstValue：" + value);
        value =2;
        System.out.println("SecondValue：" + value);

        int a1, s1;

        a1 = 1;
        s1 = a1;
        System.out.println("a1：" + a1);
        System.out.println("s1：" + s1);

        double pi;
        pi = 3.14;

        System.out.println("pi：" + pi);

    }
}