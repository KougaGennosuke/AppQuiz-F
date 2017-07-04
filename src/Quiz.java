import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		//メイン処理
		situmon5();













	}

	public static int situmon1() {
		int ans1 = 0;
		//質問内容
		//回答内容
		//ユーザーが答えを入力
		










		return ans1;
	}

	public static int situmon2() {
		int ans2 = 0;
		//質問内容
		//回答内容
	    //ユーザーが答えを入力












		return ans2;
	}

	public static int situmon3() {
		int ans3 = 0;
		//質問内容
		//回答内容
		//ユーザーが答えを入力












		return ans3;
	}

	public static int situmon4() {
		int ans4 = 0;
		//質問内容
		//回答内容
		//ユーザーが答えを入力













		return ans4;
	}
	public static int situmon5() {
		int ans5 = 0;
		//質問内容
		//回答内容
		//ユーザーが答えを入力
		
		System.out.println("問題:宇都宮しをんは現在改名して活動しています。その名前とは");
		System.out.println("回答群:１：RION２：rion３：SHION４：shion５：その他");
		Scanner sc = new Scanner(System.in);
		
		ans5 = sc.nextInt();
		
		switch(ans5){
		case 1 : System.out.println("RIONを選んだアナタ！");
		         System.out.println("正解や！さすがやな");
		         break;
		case 2 : System.out.println("rionを選んだアナタ！");
                 System.out.println("んなわけないだろ。出直せ");
		         break;
		case 3 : System.out.println("SHIONを選んだアナタ！");
                 System.out.println("そもそもこれじゃあ「しおん」だしな。出直せ");
		         break;
		case 4 : System.out.println("shionを選んだアナタ！");
                 System.out.println("そもそもこれじゃあ「しおん」だしな。出直せ");
		         break;
		case 5 : System.out.println("その他を選んだアナタ！");
                 System.out.println("んなわけないだろ出直せ");
		         break; 
		default : System.out.print("問題読めよ");
		        situmon5();
		}












		return ans5;
	}

}
