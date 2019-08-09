import java.util.*;

/**
 * question: Given an array of ints, find all pairs of equal sums
 * ex:
 * Input: [9, 4, 3, 1, 7, 12]
 * Output: [1, 12] & [4, 9], [3, 7] & [1, 9], [4, 12] & [7, 9]
 */

 class solution{
   public static void main(String[] args){
     int[] nums = new int[]{9, 4, 3, 1, 7, 12};

     findPairs(nums);
   }

   static void findPairs(int[] nums){
     Map<Integer,int[]> map = new HashMap<>();

     for(int i = 0; i < nums.length; i++){
      for(int j = i+1; j< nums.length; j++){
        int sum = nums[i] + nums[j];

        if(map.containsKey(sum)){
          int[] cur = map.get(sum);
          System.out.println(cur[0]+","+cur[1] + " | "+ nums[i] + "," + nums[j]);
        }

        map.put(sum,new int[]{nums[i],nums[j]});
      }
     }
   }
 }
