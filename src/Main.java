public class Main{
  public static void main(String[] args) {
    Person per = new Person("Alex");
    System.out.println(per.greet("John"));
    String[] test1 = {"lemonade", "limeade", "Yoo-Hoo", "root beer", "grapeade ", "water", "Mr. Pibb"};
    String[] result = WordSearch.findWord("oo", test1);
    for (String s:result)
      System.out.println(s);
  }  
}