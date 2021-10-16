import java.text.MessageFormat;

public class Main {
    public static void main(String[] args) {

      System.out.println("名前を入力してください");
      String name  = new java.util.Scanner(System.in).nextLine();

      System.out.println("教科を入力してください。");
      String subject = new java.util.Scanner(System.in).nextLine();

      int nameN=0 ;
      int subjectN=0;
      int value=0;
      String chars;

      if(name.equals("A")){
          nameN=0;
      }else if(name.equals("B")){
          nameN=1;
      }else if(name.equals("C")){
          nameN=2;
      }

      if(subject.equals("英語")){
          subjectN=0;
      }else if(subject.equals("国語")){
          subjectN=1;
      }else if(subject.equals("数学")){
          subjectN=2;
      }else if(subject.equals("理科")){
          subjectN=3;
      }else if(subject.equals("全教科")){
          subjectN=0;
      }
  
        int[][] score = {{92,78,95},{89,79,98},{98,94,89},{99,86,87}};
        int[] sums ;
        sums = new int[4] ;


        if(!subject.equals("全教科")){

            System.out.println("各教科：[最高点、最高得点者、平均点]");
            for(int i = 0 ; i < score.length ; i++) {
                int sum = 0 ;
                int maxNum = score[i][0];
                int maxIndex = 0 ;
                for (int j = 0 ; j < score[i].length ; j ++) {
                    sum+=score[i][j];
                    if(j==nameN){
                      value = score[i][j];
                    }
                    if(maxNum < score[i][j]){
                        maxNum = score[i][j];
                        maxIndex = j ;
                    }
                }

                if(i == subjectN ){
                    int n = maxNum-value;
                    System.out.println(maxNum);
                    System.out.println(value);
                    System.out.println(subjectN);
                    
                    if(n==0){
                      System.out.println("あなたは"+"("+ subject +")で最高得点者です");
                    }else{
                      System.out.println("("+ subject +")の最高得点者まで"+ (maxNum - value) +"点足りません。");
                    }
                    break ;
                }
                
                // System.out.println("["+maxNum+" "+maxIndex + " " + sum/score[i].length+"]");
                // System.out.println(maxIndex);
                // System.out.println(sum/score[i].length);
                sums[i] = sum;
            }

        }else{

            int maxNum = score[0][0];
            int maxIndex = 0 ;
            int index = 0;
            int output=0;

            for(int i = 0 ; i < score[i].length ; i++) {

                int sum = 0 ;
                
                for (int j = 0 ; j < score.length ; j++) {
                    sum+=score[j][i];
                    if(maxNum < sum){
                        maxNum = sum;
                        maxIndex = i ;
                    }
                    index++;
                }
                
                if(i == nameN){
                    value = sum;
                }

                output+=sum;
            }


            System.out.println("合計点：[最高点、最高得点者、平均点]");
            System.out.println("["+maxNum+" "+maxIndex + " " + output/index +"]");
            
            // A 92+89+98+99
            // 378
            // B 78+79+94+86
            // 337
            // C 95+98+89+87
            // 369
            int n = maxNum - value;
            if (n==0){
              System.out.println("あなたは"+"("+ subject +")で最高得点者です");
            }else{
              System.out.println("("+ subject +")の最高得点者まで"+ (maxNum - value) +"点足りません。");
            }
        }


        // int sum = sums[0] ;
        // int maxNum = sums[0];
        // int maxIndex = 0 ;
        // for(int i = 0; i < sums.length; i++){
        //     sum+=sums[i];
        //     if (maxNum < sums[i]) {
        //         System.out.println(sums[i]);
        //         maxNum = sums[i];
        //         maxIndex = i ; 
        //     }
        // }
        // System.out.println("[" + maxNum + " "+ maxIndex + " " +sum / sums.length + "]");
    }




    // public static void main(String[] args){
    //     int[] score = new int[5];
    //     score[0] = 92;
    //     score[1] = 98;
    //     score[2] = 88;
    //     score[3] = 89;
    //     score[4] = 78;

    //     System.out.println(score.length);

    //     int sum = 0 ;
    //     int average=0;

    //     for(int i=0; i< score.length ; i++){
    //         sum+=score[i];
    //     }

    //     int result = sum/score.length;

    //     System.out.println(result);

    //     int[] score1 = {92,94,99,98,97};
    //     int[] score2 ;

    //     score2 = score1;
    //     score2[0] = 88 ;

    //     System.out.println(score1[0]);

    //     int[][] = scores = new int[2][5]

    //     score[0][0] = 92;
    //     score[0][1] = 98;
    //     score[0][2] = 88;
    //     score[0][3] = 89;
    //     score[0][4] = 78;

    //     score[1][0] = 92;
    //     score[1][1] = 98;
    //     score[1][2] = 88;
    //     score[1][3] = 89;
    //     score[1][4] = 78;


    // }

    // public static void main(String[] args) {
    //   int num = 21;
        //   while(num <= 20) {
        //       System.out.println(num);
        //       num++;
        //   }
        // do {
        //     System.out.println(num);
        //     num++;
        // }while(num < 20);

        // for(int i = 1 ; i < 10 ; i++) {
        //     for (int j = 1 ; j < 10 ; j ++) {
        //         System.out.println( i + "x" + j + "は" + i*j + "です" );
        //     }
        // }

        // for( int i = 0 ; i<=100 ; i++) {
        //   if( (i%3==0 || i % 5== 0) && i % 15 != 0  ) {
        //       System.out.println(i);
        //   }
        // }

        // for(int i = 0 ; i<=100 ; i++){
        //   for(int j = 0 ; j<=100 ; j++){
        //       if((i+j)%3==0){
        //           System.out.println( i + "-" + j );
        //       }
        //   }
        // }

    // }


    // public static void main(String[] args) {
    //     String name = "kazuto" ;
    //     System.out.println("私の名前は"+ name + "です。"  );
    //     System.out.println("1たす1は" + "("+ 2 + ")" + "です。"   );

    //     int year1 = 2020;
    //     int year2 = 2010;
    //    System.out.println(Math.max(2020,2010));
    //    System.out.println(Math.min(2020,2010));

    // //   String input1 = new java.util.Scanner(System.in).nextLine();
    //   System.out.println("数値を入力してください。");
    //   int input2 = new java.util.Scanner(System.in).nextInt();
    //   int input3 = new java.util.Scanner(System.in).nextInt();

    //   System.out.println(input2+input3);
    //   System.out.println(input2-input3);
    //   System.out.println(input2*input3);
    //   System.out.println(input2/input3);

    //   int a = input2+input3;
    //   int b = input2-input3;
    //   int c = input2*input3;
    //   int d = input2/input3;

    //   System.out.println(Math.max(a,b));

    // }

    // public static void main(String[] args) {
        // int num = 10 ;
        // String s = "abcdetc";
        // System.out.println("Hello World!");
	    //   System.out.println(1+1);
        // System.out.println(2+2);
        // System.out.println(num);
        // System.out.println(s);
        // Student student  = new Student();
        // student.name = "kazuto";

        // double[] data = {70, 65, 50, 10, 30};
        // double avg = student.calculateAvg(data);
        // String result = student.judge(avg);


        // System.out.println(student.name);
        // Student.test();

        // String pattern = "{0} {1}";
        // String output = MessageFormat.format(pattern,student.name,result);
        // System.out.println(output);
        // System.out.println(student.name);
    // }
}
