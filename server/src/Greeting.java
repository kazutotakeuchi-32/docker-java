	class Student{
		String name = "sato";
		public static void calculateAvg(int math,int english) {
			System.out.println((math + english)/2);
		}
		public void hello() {
			System.out.println("hello");
		}
	}

  class Greeting{
  	public static void main(String args[]){
			// 整数
			int   a=0;
			byte  b=1;
			short c=2;
			long  d=3;

			// 少数
			float e=1.1F;
			double f=1.2445;		

			// 文字/文字列
			char s = 'c' ;
			String chars="ccc";

			// 真偽値
			boolean False = false;

			int var01 = 2;

			// 配列

			String[] arr;
			arr = new String[3];
			arr[0]="sato";
			arr[1]="suzuki";
			arr[2]="takahasi";

			// 

			System.out.println(arr[0]);
			System.out.println(arr[1]);
			System.out.println(arr[2]);

			String[] arr1 = {"sato","suzuki","takahasi"};

			System.out.println(arr1[0]);
			System.out.println(arr1[1]);
			System.out.println(arr1[2]);

			String[][] arr2;

			arr2 = new String[2][2];

			arr2[0][0] = "sato";
			arr2[0][1] = "suzuki";
			arr2[1][0] = "takahasi";
			arr2[1][1] = "tanaka";

			System.out.println(arr2[0][0]);
			System.out.println(arr2[0][1]);
			System.out.println(arr2[1][0]);
			System.out.println(arr2[1][1]);

			String[][] arr3 = {{"sato","suzuki"},{"takahashi","tanaka"}};
			System.out.println(arr3[0][0]);
			System.out.println(arr3[0][1]);
			System.out.println(arr3[1][0]);
			System.out.println(arr3[1][1]);		

			int x = 10 ;
			int y = 2;
			
			System.out.println(x+x);
			System.out.println(x-y);
			System.out.println(x*y);
			System.out.println(x/y);
			System.out.println(x>y);
			System.out.println(x==y);
			System.out.println(x!=y);
			System.out.println(x++);
			System.out.println(x--);

			int age = 19;

			
			if (age >= 22) {
				System.out.println("adult");
			}else if (age==20) {
				System.out.println("yes");
			}else{
				System.out.println("no");
			}

		  String output =	age >=22 ?  "adult"  : 	"no"; 

			System.out.println(output);	
			//System.out.println("Good moring");
			// for (int i = 0 ; i <= 4 ; i++){
			// 	if (i==3) {
			// 		// break;
			// 		continue;
			// 	}
			// 	System.out.println(i);
			// }
			int nums[] = {2,4,6,8,10};
			int sum = 0 ;

			for (int i = 0 ; i <= 4 ; i++){
			System.out.println(nums[i]);
			}

			Student a001 = new Student();
			System.out.println(a001.name);
			Student.calculateAvg(19,199);

			a001.hello();

			int j = 10 ;

			while(j > 0) {
				System.out.println(j);
				j--;
			}



		}

  }
