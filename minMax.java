class solution{
  public static void main(String[] args){
    int[] nums = new int[]{3,2,5,1,2,4};
    minMax(nums);
  }

  static void minMax(int[] nums){
    int min = nums[0];
    int max = nums[0];

    for(int i : nums){
      min = Math.min(min, i);
      max = Math.max(max, i);
    }

    System.out.println("max is: " + max);
    System.out.println("min is: "+ min);
  }
}