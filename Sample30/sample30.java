// クラス
// ロボットを扱うプログラム

//ロボットクラス【第1版】

class Robot {
    // staticでないクラスで宣言された変数＝インスタンス変数
    String name;    //名前
    int battery;    //バッテリー残量
    int x;  //x座標

    // staticでないクラスで宣言されたメソッド＝インスタンスメソッド

    // ロボットの状態を表示するメソッド
    void showStatus(){
        System.out.println("現在のx座標" + x);
        System.out.println("バッテリー残量" + battery);
    }

    // ロボットの名前と状態を表示するメソッド
    void show(){
        System.out.println("名前" + name);
        showStatus();
    }

    // 移動量dx分x座標を動かしてバッテリーを消費させるメソッド
    // 移動に成功した場合はtrueを返す
    boolean walkX(int dx){
        // 条件演算
        // dx>=0ならばdx dx<0ならば-dxをdに代入する
        int d = dx >= 0 ?  dx : -dx;    //dxの絶対値をdに代入しておく。
        if(d <= battery){
            x += dx;
            battery -= d;
            return true;
        }else{
            return false;
        }
    }
}

class Sample30{
    public static void main(String[] args) {
        
        // Robotクラスからインスタンスrobot1を生成
        Robot robot1 = new Robot();
        robot1.name="ロボ太郎";
        robot1.battery=100;

        // Robotクラスからインスタンスrobot2を生成
        Robot robot2 = new Robot();
        robot2.name="ロボ子";
        robot2.battery=80;

        // System.out.println("名前: " + robot1.name);
        // // System.out.println("バッテリー残量: " + robot1.battery);
        // robot1.showStatus();
        // System.out.println();
        // System.out.println("名前: " + robot2.name);
        // // System.out.println("バッテリー残量: " + robot2.battery);
        // robot2.showStatus();

        // System.out.println("ロボット1の初期状態");
        // robot1.show(); System.out.println();

        // System.out.println("ロボット1を5移動させる");
        // robot1.walkX(5);

        // System.out.println("ロボット1の移動後の状態");
        // robot1.show();

        System.out.println("ロボット1の初期状態");
        robot1.show(); System.out.println();

        System.out.println(robot1.name + " が歩き回ります。");    System.out.println();

        int[] dxes = {40, -25, 50, 16};

        for(int dx : dxes){
            if(! robot1.walkX(dx)){
                System.out.println(robot1.name + " はバッテリー不足で歩けません。");
            }
            robot1.showStatus();
        }        

    }
    
}