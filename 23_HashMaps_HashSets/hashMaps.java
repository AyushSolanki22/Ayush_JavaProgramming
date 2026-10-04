
import java.util.HashMap;

public class hashMaps {
  public static void main(String[] args) {
      HashMap<Integer, Integer> map=new HashMap<>();

      map.put(2, 11);
      map.put(3,12);
      map.put(4,15);
      map.put(2,map.getOrDefault(2,0)+5);  //it replaces the old value of key with new value or assigns new value by creating new key 

      System.out.println(map.get(2));

      System.out.println(map.keySet());  //set of keys 

      if(map.containsKey(3)) System.out.println(true);

      System.out.println(map);


      System.out.println(map.remove(3));


      for(int ele : map.keySet()) System.out.print(ele+" ");
  }

}
