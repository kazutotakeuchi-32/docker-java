import java.util.Scanner ;

public class GetNum {
  public static int getNumber() {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    return num;
  }

  public static int[] scanNumbers( ){
   		// Scannerを作成
   		Scanner scan = new Scanner( System.in );
   
   		// 入力した文字列をlineに格納
   		String line = scan.nextLine();
   
   		// 半角スペースで区切られた文字列を配列valuesに格納
   		String[] values = line.split( " ", 0 );

   		// 配列の作成
   		int[] numbers = new int[ values.length ];

   		// valuesの値をint型に変換し、numbersに格納
   		for ( int i = 0; i < values.length; i++ ) {
   			// 文字列values[ i ]をint型に変換
   			try {
   				numbers[ i ] = Integer.parseInt( values[ i ] );
   			} catch ( NumberFormatException ex ) {
   				// 数字に変換できなければnullを戻す
   				return null;
   			}
   		}
   
   		// int型の配列を戻す
   		return numbers;
   	}
   
}