//Problem: given n, return all possible queen arrangements in an nxn board such that no queens 
// attack each other

import java.util.*;

class solution{
  public static void main(String[] args){
    int n = 4;

    List<List<Integer>> res = nQueens(n);

    for(List<Integer> l : res){
     System.out.println(l);
    }
  }

  static List<List<Integer>> nQueens(int n){
    List<List<Integer>> res = new ArrayList<>();
    helper(n,0,new ArrayList<Integer>(), res);
    return res;
  }

  static void helper(int n, int row, List<Integer> placements, List<List<Integer>> res){
    if(row == n)
      res.add(new ArrayList<>(placements)); //base case, all rows have been placed
    else{
      for(int i = 0; i< n; i++){  //attempt to place queens in columns at current row
        placements.add(i); //place queen
        if(isValid(placements)) //check if valid
          helper(n, row+1, placements, res);  //if valid move on to next row
        placements.remove(placements.size()-1);  //remove current col placement and continue
      }
    }
  }

  static boolean isValid(List<Integer> placements){
    int row = placements.size() - 1;
    for(int i = 0; i< row; i++){
      int diff = Math.abs(placements.get(i) - placements.get(row));
      if(diff == 0 || diff == row - i)
        return false;
    }

    return true;
  }
}