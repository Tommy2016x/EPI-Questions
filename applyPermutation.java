class solution{
  public static void main(String[] args){
    int[] nums = new int[]{1,2,3,4};
    int[] perm = new int[]{2,0,1,3};

    permute(nums, perm); //expected: [2,3,1,4]
    for(int i: nums){
      System.out.println(i);
    }
  }

  static void permute(int[] nums, int[] permute){
    int[] temp = new int[nums.length];
    for(int i= 0; i< nums.length; i++){
      int place = permute[i];
      temp[place] = nums[i];
    }

    int ind = 0;
    for(int i: temp)
      nums[ind++] = i;
  }
}

/**
 temp = [2,3,1,3], O(n) space and time

 [11,12,13,14] -> [12,13,11,14]

 [11,12,13,14]
 [2,0,1,3]
 */