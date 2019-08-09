import java.util.*;

class solution{
    public static void main(String[] args){
        String sentence = "All work and no play makes for no work no fun and no results";
        String[] words = sentence.split(" ");

        System.out.println(nearestWords(words));
    }

    static int nearestWords(String[] words){
      if(words.length == 0 || words.length == 1)
        return 0;

      Map<String, Integer> map = new HashMap<>();
      int min = Integer.MAX_VALUE;

      for(int i = 0; i < words.length; i++){
        String cur = words[i];

        if(map.containsKey(cur)){
          int distance = i - map.get(cur);
          min = Math.min(min, distance);
        }

        map.put(cur, i);
      }

      return min;
    }
}