import java.util.ArrayList;

class WordSearch {
  static String[] findWord(String x, String[] y){    
    ArrayList<String> result = new ArrayList<String>();
    for (String s:y)
      if (s.toLowerCase().indexOf(x.toLowerCase()) >= 0)
        result.add(s);
    String[] res;
    if (!result.isEmpty()){
      res = new String[result.size()];
      res = result.toArray(res);
    } else {
      res = new String[1]; 
      res[0] = "Empty";
    } 
    return res;
  }
}