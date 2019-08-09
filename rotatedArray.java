class solution{
  public static void main(String[] args){
    int[] nums = new int[]{0,1,2,3,4,5,6,7};
    int res = search(nums,4);
    System.out.println(res);
  }

  static int search(int[] nums, int target) {
    int pivot = findPivot(nums, 0, nums.length - 1);
    if(nums[pivot] == target)
      return pivot;

    int leftRes = binarySearch(nums,pivot, nums.length - 1, target);
    int rightres = binarySearch(nums,0,pivot - 1, target);

    if(leftRes != -1)
      return leftRes;

    return rightres;
  }

  static int findPivot(int[] nums, int l, int r){
    int left = l;
    int right = r; 
    while(left <= right){
        int mid = left + (right-left) / 2;
        if(nums[mid] > nums[right])
            left = mid + 1;
        else
            right = mid - 1;
    }
    
    return left;
  }

  static int binarySearch(int[] nums, int l, int r, int k){
    int left = l;
    int right = r;

    while(left <= right){
      int mid = left + (right - left) / 2;

      if(nums[mid] == k)
        return mid;

      if(nums[mid] > k)
        right = mid - 1;
      else
        left = mid + 1;
    }

    return -1;
  }
}