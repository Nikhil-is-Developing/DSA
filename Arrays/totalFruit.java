import java.util.*;
class Solution {
    public int totalFruit(int[] fruits) {
      int n=fruits.length;
      HashMap<Integer,Integer> map=new HashMap<>();
      int maxcount=0;
      int left=0;
      for(int right=0;right<fruits.length;right++){
        int in=fruits[right];
        map.put(in,map.getOrDefault(in,0)+1);
        while(map.size()>2){
            int fruit=fruits[left];
            map.put(fruit,map.get(fruit)-1);
            if(map.get(fruit)==0){
                map.remove(fruit);
            }
            left++;
        }
        maxcount=Math.max(maxcount,right-left+1);
      }
        return maxcount;
    }
}
//Fruit into Baskets