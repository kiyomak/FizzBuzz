/* Lesson2_Javaを学ぼう(基礎)_Chapter10 提出課題：FizzBuzz
 要件
・クラス名：FizzBuzz
・1から100までの数値をループで処理する
・3で割り切れる数値の場合、「Fizz」と表示する
・5で割り切れる数値の場合、「Buzz」と表示する
・3と5の両方で割り切れる数値の場合、「FizzBuzz」と表示する
・それ以外の数値は、その数値をそのまま表示する　 */

public class FizzBuzz {
	public static void main(String[] args) {
		//1～100までをforで繰り返す
		for(int i=1; i <=100; i++) {
			// if-else文で、3で余り0のとき「Fizz」、5で余り0のとき「Buzz」、3*5で余り0のとき「FizzBuzz」、それ以外の時はその数字を表示
			// if文を (i%3==0)から始めると、3＊5の分もこっちに適用されてしまうので、数字が大きいものから優先的にtrueかを判断する式にする
			//if( i % (3*5) == 0){  ⇒　3*5では、他の人が見たときに分かりずらい。条件式を変える。
			if( (i % 3 ==0) && ( i % 5 ==0 )) {
				System.out.println("FizzBuzz");
			}else if( i % 5 == 0 ) {
				System.out.println("Buzz");
			}else if( i % 3 == 0) {
				System.out.println("Fizz");
			}else {
				System.out.println(i);
			}
	
		}
	}
}

/*
 *メンターさんの評価ポイント
 ・要件通りに機能できています。
・GitHubに正常にアップロードできています。
・インデントの揃った、きれいなコードが書けています。
 * */
