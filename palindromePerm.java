import java.util.HashMap;
import java.util.Map;
class solution{
  public static void main(String[] args){
    String s = "careaeracc";
    System.out.println(palindromePerm(s));
  }

  static boolean palindromePerm(String s){
    if(s.length() == 0 || s.length() == 1)
      return true;

    Map<Character, Integer> map = new HashMap<>();

    for(char c: s.toCharArray())
      map.put(c, map.getOrDefault(c, 0) + 1);

    int oddCount = 0;

    for(int c: map.values()){
      if(c % 2 == 1)
        oddCount++;
    }

    return oddCount <= 1;
  }
}

/**
 
carecerac

in a palindrome, there must be at most 1 character with an odd number of that same character

c:3
a:3
r:2
e:2

numOdds = 1
 */