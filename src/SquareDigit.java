public class SquareDigit {
  public int squareDigits(int n) {
    StringBuilder result = new StringBuilder();
    for (char c:Integer.toString(n).toCharArray())
      result.append(Integer.toString((int) Math.pow(Double.parseDouble(String.valueOf(c)), 2)));
    return Integer.parseInt(result.toString());
  }
}