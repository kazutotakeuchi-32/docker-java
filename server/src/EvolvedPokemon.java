public class EvolvedPokemon extends Pokemon {
  public void doubleAttack() {
    this.attack();
    this.attack();
  }
  public void heal() {
    System.out.println("回復した");
  }
  
  public static void main(String[] args)  {
    EvolvedPokemon ep = new EvolvedPokemon();
    ep.doubleAttack();
    ep.defense();
    ep.heal();
  }
}


