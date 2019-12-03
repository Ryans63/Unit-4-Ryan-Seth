public class DieClient{
  public static void main(String[]args){
    Die Die1 = new Die();
    Die Die2 = new Die();
    System.out.println("Die 1 = " + Die1.toString());
    System.out.println("Die 2 = " + Die2.toString());

    int numDoubles = 0;
    final int num_rolls = 100;

    System.out.println("\nRolling a die " + num_rolls + "times");

    for(int i = 0; i < num_rolls; i++){
      Die1.roll();
      Die2.roll();
      System.out.print(Die1 + "\t");
      System.out.print(Die2 + "\t");
      if(Die1 == Die2){
        numDoubles++;
      }
    }
System.out.println("\n% of heads = " + (numDoubles/(double)num_rolls*100) + "%");
  }

}
