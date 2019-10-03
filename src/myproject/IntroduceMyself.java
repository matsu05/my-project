/**
 *
 */
package myproject;

/**
 * 自己紹介クラス
 * @author matsushima
 *
 */
public class IntroduceMyself {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

//		int age = 27 ;
//		String name = new String ("松島孝晃");
//		int sex = 0; //0:男、1:女、2:不明
//
//
//		System.out.println (age);
//		System.out.println (name);

//		if (sex == 0) {
//			System.out.println ("性別は男です。");
//		} else if (sex == 1) {
//			System.out.println ("性別は女です。");
//		} else {
//			System.out.println ("性別は不明です。");
//		}

//		switch (sex) {
//		case 0:
//			System.out.println ("性別は男です。");
//			break;
//		case 1:
//			System.out.println ("性別は女です。");
//			break;
//		default:
//			System.out.println ("性別は不明です。");
//			break;
//		}


//		boolean train = true;
//
//		//電車が好きか尋ねる質問
//
//		if (train == true) {
//			System.out.println ("素晴らしい");
//		} else {
//			System.out.println ("残念です");
//		}


//		System.out.println ("電車は好きですか？");
//		System.out.println ("1:はい");
//		System.out.println ("2:いいえ");
//
//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		String Line = sc.nextLine();
//
//		if("1".equals(Line)) {
//			System.out.println ("素晴らしい");
//		} else {
//			System.out.println ("残念です");
//		}
//
//	}
//
//}


//		for (int i = 0; i< 10; i++) {
//			System.out.println (i + "回目");
//		}
//		System.out.println ("for文終了");




//		int i = 0;
//		while (i <10) {
//			System.out.println (i + "回目");
//			i++;
//		}
//		System.out.println ("while文終了");
//
//		// 練習問題3-1
//		int weight = 60;
//		if(weight ==60) {
//			System.out.println ("60です");
//		}else {
//			// 処理なし
//		}
//
//		int age1 = 20;
//		int age2 = 30;
//		if ((age1 + age2 ) * 2 > 60) {
//			System.out.println ("60以上です");
//		} else {
//			// 処理なし
//		}
//
//		int sur= 3;
//		if(sur % 2 == 1) {
//			System.out.println ("あまりが1です");
//		} else {
//			// 処理なし
//		}
//
//		String name = new String("湊");
//
//		if (name.equals("湊")) {
//			System.out.println ("湊");
//		} else {
//			// 処理なし
//		}
//
//		// 練習問題3-3
//		int seibetsu = 0;
//		int age = 16;
//		System.out.println ("こんにちは。");
//
//		if (seibetsu == 0) {
//			System.out.println ("私は男です。");
//		} else {
//			System.out.println ("私は女です。");
//		}
//
//		if (seibetsu == 0) {
//			System.out.println (age + "歳です。");
//			System.out.println ("よろしくお願いします。");
//		} else {
//			// 処理なし
//		}
//
//		// 練習問題3-5
//		System.out.println ("[メニュー]1:検索2:登録3:削除4:変更＞");
//
//		int input = new java.util.Scanner(System.in).nextInt();
//
//		int selected = input;
//
//		switch (input) {
//		case 1:
//			System.out.println ("検索します。");
//			break;
//		case 2:
//			System.out.println ("登録します。");
//			break;
//		case 3:
//			System.out.println ("削除します。");
//			break;
//		case 4:
//			System.out.println ("変更します。");
//			break;
//		default:
//			break;
//
//
//		}
//
//		System.out.println ("数あてゲーム");
//
//		int r =new java.util.Random().nextInt();
//
//
//		for (int j = 0; j < 5; j++) {
//			System.out.println ("0～9の数字を入力してください。");
//			int num = new java.util.Scanner( System.in ).nextInt();
//
//			//intはバイトの部屋をつくるためだけのため、つけなくていい。
//			if (r == num) {
//				System.out.println ("アタリ！");
//			} else {
//				System.out.println ("違います。");
//			}
//
//		}
//		System.out.println ("ゲームを終了します");
//
//
//
//		System.out.println ("身長を記入ください。");
//		int tal = new java.util.Scanner( System.in ).nextInt();
//
//		if (tal >= 180 ) {
//			System.out.println("背が高い");
//		} else if (tal >= 170) {
//			System.out.println("少し背が高い");
//		} else {
//			System.out.println("標準的");
//		}



//		for (int i = 0 ;  i< 20 ; i++ ){
//			if (i+1 < 10 ) {
//				continue;
//			}
//
//			if ((i+1) % 2 != 0 ) {
//				System.out.println((i+1) + "(奇数)");
//			} else {
//				System.out.println(i+1);
//			}
//		}
//
//		int x = 10;
//		int y = 12;
//
//		if (x > y) {
//			System.out.println("xはyより大きい");
//		} else if (x == y) {
//			System.out.println("xはyと等しい");
//		} else {
//			System.out.println("xはyより小さい");
//		}


		int flg = 0;

		for (int i =  0; i < 100; i++) {

			System.out.println("祝日を知りたい月を入力してください");

			java.util.Scanner sc = new java.util.Scanner(System.in);
			String Line = sc.nextLine();
			int linenum = Integer.parseInt(Line);

			switch (linenum) {
			case 1:
				System.out.println ("1月　元日、成人の日");
				break;
			case 2:
				System.out.println ("2月　建国記念の日");
				break;
			case 3:
				System.out.println ("3月　春分の日");
				break;
			case 4:
				System.out.println ("4月　昭和の日");
				break;
			case 5:
				System.out.println ("5月　憲法記念日、みどりの日、こどもの日");
				break;
			case 6:
				break;
			case 7:
				System.out.println ("7月　海の日");
				break;
			case 8:
				break;
			case 9:
				System.out.println ("9月　敬老の日、秋分の日");
				break;
			case 10:
				System.out.println ("10月　体育の日");
				break;
			case 11:
				System.out.println ("11月　文化の日、勤労感謝の日");
				break;
			case 12:
				System.out.println ("12月　天皇誕生日");
				break;
			default:
				System.out.println("エラーです");
				break;
			}
			if ((linenum >= 1) && (linenum <=12)) {
				flg = 1;
			}

			if (flg== 1) {
				break;
			}

        }


	}
}







