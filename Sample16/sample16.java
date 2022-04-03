// 配列の応用
// おみくじ

import java.util.Random;

class Sample16{
    public static void main(String[] args) {
        String[] fortune = new String[6];
        fortune[0]="大吉";
        fortune[1]="吉";
        fortune[2]="中吉";
        fortune[3]="小吉";
        fortune[4]="末吉";
        fortune[5]="凶";

        Random random = new Random();
        int i = random.nextInt(6);

        System.out.println(fortune[i]);
    }
}