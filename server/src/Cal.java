public class Cal {
  public static int addtion(int x ,int y) {
    return x + y;
  }
  public static int subtaction(int x ,int y) {
    return x - y;
  }

  public static int multiply(int x, int y) {
    return x * y;
  }

  public static int division(int x ,int y) {
    if(y == 0 ){
      System.out.println("divError");
      return 0 ;
    } else {
      return x / y;
    }
  }

  public static int sum(int[] nums) {
    int sum = 0 ;
    int i = 0 ;
    while(i < nums.length) {
      sum+=nums[i];
      i++;
    }
    return sum ;
  }

}
