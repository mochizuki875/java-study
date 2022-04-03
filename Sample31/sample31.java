// クラス
// ロボットを扱うプログラム
// コンストラクタを使ってクラスからインスタンスを生成する

class Robot {
    // staticでないクラスで宣言された変数＝インスタンス変数
    String name;    //名前
    int battery;    //バッテリー残量
    int x;  //x座標

    // ★コンストラクタ
    // コンストラクタ名はクラスと同じである必要がある
    // ※コンストラクタを宣言しない場合、コンパイラによってデフォルトコンストラクタが自動的に作成される。
    Robot(String n, int btry){
        name = n;
        battery = btry;
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
}

class Sample31{
    public static void main(String[] args) {
        
        // Robotクラスからインスタンスrobot1を生成
        // コンストラクタを使用して初期パラメータを定義
        Robot robot1 = new Robot("ロボ太郎", 100);
        // robot1.name="ロボ太郎";
        // robot1.battery=100;

        // オーバーロードしたコンストラクタを使用してインスタンスを作成
        Robot robot2 = new Robot("ロボ子");
        Robot robot3 = new Robot();

        // ロボットの状態表示
        robot1.show();
        robot2.show();
        robot3.show();

    }
    
}