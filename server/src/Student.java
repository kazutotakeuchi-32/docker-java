class Student {
  String name;

  public double calculateAvg(double[] data){
    double sum = 0;
    for(int i=0; i< data.length ; i++ ){
      sum+=data[i];
    }
    double avg = sum/data.length;
    return avg ;
  }

  public static void test() {
    System.out.println("test");
  }

  public  String judge(double avg) {
    String result ;
    if(avg >= 60){
      result = "passed";
    }else{
      result = "failed";
    }
    return result ;
  }

  // public static void main(String[] args){
  //   System.out.println("name") ;
  // }

}