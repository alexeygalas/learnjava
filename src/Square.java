public class Square {    
  public static boolean isSquare(int n) {
    if (n >= 0)
      return (Math.sqrt(n) % 1 == 0);        
    else return false; 
  }
}