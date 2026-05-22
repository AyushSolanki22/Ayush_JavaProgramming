//2D Arraylists + Jagged Arrays(variable sized arrays)

//As ArrayLists are dynamic, it behaves like jagged array
import java.util.ArrayList;
public class _2D_arraylists {
    public static void main(String[] args) {

        //Access
        
        int arr[][] = {{1,2,3},{7,9,8,1},{4,5}};
        
        ArrayList<ArrayList<Integer>> arrayList=new ArrayList<>();
        for(int a[] :arr){
            
            ArrayList<Integer> row=new ArrayList<>();
            for(int ele:a){
                row.add(ele);
            }

            arrayList.add(row);
            
        }
        System.out.print(arrayList.get(1).get(1)); //to print 9
        //update
        arrayList.get(2).add(3);  //***** 
        System.out.println();

        // System.out.print(arrayList); //whoole 2D arrylist will be printed (though in the list format)

        for(int i=0;i<arrayList.size();i++){
            for(int j=0;j<arrayList.get(i).size();j++){
                System.out.print(arrayList.get(i).get(j)+" ");
            }
            System.out.println();
        }

        //or also can be printed using for loop
        for(ArrayList<Integer> a:arrayList){
            for(int ele:a){
                System.out.print(ele+" ");
            }
            System.out.println();
        }

    }
}
