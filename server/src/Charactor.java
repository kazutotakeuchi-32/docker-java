public abstract class  Charactor {
  private int hp ;
  private String name;

  public abstract void attack();
  public abstract void defense();

  public void run() {
    System.out.println("脱出に成功した");
  }

}