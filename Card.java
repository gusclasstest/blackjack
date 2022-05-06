public class Card{

  
  // HERE IS PART 1: What do I call this part?
  // width
  static final String[] SUITES    = {"♠","♥","♦","♣"};
  static final String[] SPECIALS  = {"A","J","Q","K"};
  static final int      BASE      = 9;  
  int width;
  int height;
    
  String suite;
  String value;
  int num;
  int id;

    /////////////////////////////////////
    // This part is going to make my Objects
    // What is this called?
  public Card(int seed){
    this.id = seed;
    int n = seed % (BASE + SPECIALS.length);
    int s = seed / (BASE + SUITES.length);
    
    String val = (n == 0)? SPECIALS[n] : "" + (n + 1);
    if(n > BASE) val = SPECIALS[n-BASE];

    this.num = n;
    this.suite = SUITES[s];
    this.value = val;
  }


    ////////////////////////////////////
    // This is part 3....
    // what goes here?

  public String toString(){
    return this.suite + this.value;
  }

  
}