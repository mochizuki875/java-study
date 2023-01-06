// クラス
// ロボットを扱うプログラム
// コンストラクタを使ってクラスからインスタンスを生成する
// ★カプセル化→インスタンス内のフィールド（変数）を直接操作できないようにする
// 操作するときはメソッド（アクセッサメソッド）から行うようにする

class Robot {
    // staticでないクラスで宣言された変数＝インスタンス変数
    // String name;    //名前
    // int battery;    //バッテリー残量
    // int x;  //x座標

    // 変数をprivateにすることで外部から直接操作できなくなる
    private String name;    //名前
    private int battery;    //バッテリー残量
    private int x;  //x座標

    // ★コンストラクタ
    // コンストラクタ名はクラスと同じである必要がある
    // ※コンストラクタを宣言しない場合、コンパイラによってデフォルトコンストラクタが自動的に作成される。
    Robot(String n, int btry){
        name = n;
        // battery = btry;  //負の値が設定されてしまう可能性がある為下で定義したsetBatteryメソッドを使う
        setBattery(btry);
        x=0;
    }

    // コンストラクタのオーバーロード
    // これによりインスタンス作成時の初期化パターンを分けられる
    Robot(){};

    Robot(String n){
        name = n;
        battery = 0;
        x=0;
    }



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

    // バッテリー残量を設定するメソッド
    // batteryフィールドを操作する為のアクセッサメソッドにあたる
    void setBattery(int btry){
        if(btry>0){
            battery = btry;
        }else{
            battery = 0;
        }
    }
}

class Sample32{
    public static void main(String[] args) {
        
        // Robotクラスからインスタンスrobot1を生成
        // コンストラクタを使用して初期パラメータを定義
        Robot robot1 = new Robot("ロボ太郎", 100);
        // robot1.name="ロボ太郎";
        // robot1.battery=100;

        // オーバーロードしたコンストラクタを使用してインスタンスを作成
        Robot robot2 = new Robot("ロボ子");
        Robot robot3 = new Robot();

        // ロボットの状態表示（初期）
        System.out.println("------ロボットの状態表示（初期）------");
        robot1.show();
        robot2.show();
        robot3.show();


        // アクセッサメソッドを用いてrobot1のバッテリー残量を設定
        System.out.println();
        System.out.println("アクセッサメソッドを用いてrobot1のバッテリー残量を設定");
        robot1.setBattery(50);

        // ロボットの状態表示（最終）
        System.out.println();
        System.out.println("------ロボットの状態表示（最終）------");
        robot1.show();
        robot2.show();
        robot3.show();

    }
    
}