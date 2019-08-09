import java.util.*;

class solution{
  public static void main(String[] args){
    int[] nums = new int[]{3,-1,2,6,4,5,8};
    int k = 2;

    helper(nums,k);
    for(int i: nums)
      System.out.println(i);
  }

  static void helper(int[] nums, int k){
    PriorityQueue<Integer> q = new PriorityQueue<>();
    int ind = 0;

    for(int i = 0; i<k; i++)
      q.add(nums[i]);
    
    for(int i = k; i < nums.length; i++){
      nums[ind++] = q.poll();
      q.add(nums[i]);
    }

    while(ind < nums.length)
      nums[ind++] = q.poll();
  } 
}