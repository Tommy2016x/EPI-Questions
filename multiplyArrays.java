import java.util.*;

class solution{
  public static void main(String[] args){
    int[] num1 = new int[]{1,6};
    int[] num2 = new int[]{8,3,6};

    List<Integer> product = multiply(num1, num2);

    for(int i: product)
      System.out.println(i);
  }

  static List<Integer> multiply(int[] num1, int[] num2){
    boolean isNegative = false;

    if(num1[0] < 0 && num2[0] < 0 )
      isNegative = false;
    else if (num1[0] < 0 || num2[0] < 0)
      isNegative = true;
    
    List<Integer> res = new ArrayList<>();
    int[] product = new int[num1.length + num2.length];

    for(int i = num1.length - 1; i >= 0; i--){
      for(int j = num2.length - 1; j >= 0; j--){
        product[i + j + 1] = product[i + j + 1] + (num1[i] * num2[j]);
        product[i + j] = product[i + j] + (product[i + j + 1] / 10);
        product[i + j + 1] = product[i + j + 1] % 10;
      }
    }

    for(int i : product)
      res.add(i);

    int firstNonZero = 0;

    while(firstNonZero < res.size() && res.get(firstNonZero) == 0)
      firstNonZero ++;

    res = res.subList(firstNonZero, res.size());

    if(isNegative)
      res.set(0, res.get(0) * -1);
    
    return res;
  }
}