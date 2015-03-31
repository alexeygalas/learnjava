import java.util.Arrays;

public class WindInfo {
  public static int message(String rwy, int windDirection, int windSpeed) {
    char[] ignore_letters = {'L', 'C', 'R'};
    int runway = (Arrays.asList(ignore_letters).contains(rwy.toCharArray()[rwy.length() - 1])) ? Integer.parseInt(rwy.substring(0, rwy.length()-1)) : Integer.parseInt(rwy);   
        
    return 0;
  }
}
