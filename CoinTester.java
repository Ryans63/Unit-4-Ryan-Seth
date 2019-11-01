/*
Creates instance of the Coin class and tests their atrributes and behaviors
*/

public class CoinTester{
  public static void main(String[]args){
    Coin myCoin = new Coin();
    Coin yourCoin = new Coin();
    System.out.println("My Coin = " + myCoin.toString());
    System.out.println("Your Coin = " + yourCoin.toString());

    int numHeads = 0;
    final int num_flips = 10;

    System.out.println("\nFlipping a coin" + num_flips + "times");

    for(int i = 0; i < num_flips; i++){
      myCoin.flip();
      System.out.print(myCoin + "\t");
      if(myCoin.isHeads()){
        numHeads++;
      }
    }
System.out.println("\n% of heads = " + (numHeads/(double)num_flips*100) + "%");
  }
}
