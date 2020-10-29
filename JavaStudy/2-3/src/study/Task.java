package study;

// ① TaskクラスにCalculatorクラスを継承させなさい。
public class Task extends Calculator {

	public int a = 10;

	public int b = 20;

	public int c = 30;







    /**
     * タスクの実行
     */
    public void doTask() {

    	System.out.println("plusメソッドの引数が1の場合:" + plus(a));
    	System.out.println("plusメソッドの引数が2つの場合"+ plus(a,b));
    	System.out.println("plusメソッドの引数が3つの場合" + plus(a,b,c));
    }
}


        // ② Calculator.javaのすべてのオーバーロードメソッド「plus」に適当な引数を与え、下記画像のよう出力されるようコーディングしなさい。
        // 尚、「どのクラスから呼び出しているか」を明確にするため、plus()には呼び出し元のキーワードを付与すること。

