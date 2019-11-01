/*
This is the Coin class.
It is the blueprint for how to make a coin object
*/

public class Coin{
  //These are the declarations for the attributes(instance variables) of a coin
    private int face;

    private final int HEADS = 0; //Constants defining heads and tails
    private final int TAILS = 1;

/*
The Coin constructor that defines what happens when the Coin object is made
When a new coin is made, it gets flipped
*/
    public Coin(){
      flip();
    }
/*
This is the section of the class containing the methods(behaviors) of a coin
*/

/*
The accessor method for the face variable (a getter)
*/
public int getFace(){
  return face;
}

/*
The mutator/modifier for the face variable (a setter)
*/
public void setFace(int newFace){
  face = newFace;
}
/*
Assigns a randomly chosen value to a face
*/
    public void flip(){
      face = (int) (Math.random()*2);
    }

/*
The isHeads method tells us if the coin's face is a heads or not
*/
public boolean isHeads(){
  return (face == HEADS);
}
/*
Prints out current state of a Coin
*/
public String toString(){
  String result = "";
  if(face == HEADS){
    result = "HEADS";
  }
  else{
    result = "TAILS";
  }
  return result;
}
}
