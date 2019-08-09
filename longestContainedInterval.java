import java.util.*;

class solution{
  public static void main(String[] args){
    int[] nums = new int[]{10,5,3,11,6,100,4}; //expect six because [-2,-1,0,1,2,3]
    System.out.println(helper(nums));
  }

  static int helper(int[] nums){
    Set<Integer> set = new HashSet<>();
    for(int i: nums)
      set.add(i);
    
      int max = 0;

      for(int i : nums){
        int curMax = 1;

        int upperCopy = i + 1;
        int lowerCopy = i - 1;

        while(set.contains(upperCopy)){
          curMax++;
          set.remove(upperCopy);
          upperCopy++;
        }

        while(set.contains(lowerCopy)){
          curMax++;
          set.remove(lowerCopy);
          lowerCopy--;
        }

        max = Math.max(max, curMax);
      }

      return max;
  }
}