import java.util.HashMap;
import java.util.Map;

class solution{
  public static void main(String[] args){
    int[] nums = new int[]{9, 4, 3, 1, 6, 7, 12,9,3,12, 12};
    int n = 2;

    int[] res = removeNTimes(nums,n);

    for(int i: res)
      System.out.println(i);
  }

  static int[] removeNTimes(int[] nums, int n){
    Map<Integer, Integer> map = new HashMap<>();

    for(int i: nums)
      map.put(i,map.getOrDefault(i,0) + 1);
    
    int count = 0;
    for(int i: map.values()){
      if(i > n)
        count += i;
    }
    
    int[] res = new int[nums.length - count];
    int ind = 0;

    for (int i: nums){
      if(map.get(i) <= n)
        res[ind++] = i;
    }
    
    return res;
  }
}