import java.util.*;

class solution{
  public static void main(String[] args){
    String sentence = "My paramount object in this struggle is to the union , and is not either to save or to union union . If I could save the union without freeing any slave I would do it , and if I could save it by freeing the slaves I would do it, and if I could do save it by freeing some and leaving others alone I would also do that .";
    String[] words = sentence.split(" ");
    Set<String> set = new HashSet<>();
    set.add("union");
    set.add("save");
    covering(words, set);
  }

  static void covering(String[] words, Set<String> set){
    Map<String, Integer> map = new HashMap<>();
    Set<String> dups = new HashSet<>();
    for(String s : set)
      map.put(s, 0);
      
    int l = 0;
    int r = 0;

    int start = 0;
    int end = 0;
    int length = Integer.MAX_VALUE;

    while(r < words.length){
      String curWord = words[r];
      if(set.contains(curWord)){
        map.put(curWord, map.get(curWord) + 1);
        dups.add(curWord);
      }
      if(dups.size() == set.size()){  
        while(dups.size() == set.size()){
          if((r - l) < length){
            start = l;
            end = r;
            length = end - start;
          }
          if(set.contains(words[l])){
            map.put(words[l], map.get(words[l]) - 1);
            if(map.get(words[l]) == 0)
              dups.remove(words[l]);
          }
          l++;
        }
      }
      r++;
    }

    System.out.println(start);
    System.out.println(end);
  }
}