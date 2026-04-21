//*Approach (Solution for 3 sum)


// import java.util.*;

// class _3sum {
//     public List<List<Integer>> threeSum(int[] nums) {           
//         Arrays.sort(nums);                                      //By Sorting, finding 3 sum becomes easier through 2 pointer approach.
//         List<List<Integer>> result = new ArrayList<>();         //List<List<Integer>> is a type of ArrayList as a collection of elements in which elements itself are lists of int.(more flexible, preferable in interviews/companies)
                                                                   //Here, we can also use ArrayList(but it's less flexible)
//         for(int i = 0; i < nums.length; i++){

//             if(i > 0 && nums[i] == nums[i-1]) continue;     
                                                                   //nums[i]==nums[i-1] conditions is because to avoid repetition of triplets incase of duplicate elements in sorted.
//             int left = i + 1;
//             int right = nums.length - 1;

//             while(left < right){
//                 int sum = nums[i] + nums[left] + nums[right];

//                 if(sum == 0){
//                     result.add(Arrays.asList(nums[i], nums[left], nums[right]));

//                     left++;
//                     right--;

//                     while(left < right && nums[left] == nums[left-1]) left++;    //this is again to avoid repetition(duplicate elements)
//                     while(left < right && nums[right] == nums[right+1]) right--;
//                 }
//                 else if(sum < 0){            //negative mai jyda jaarha hai to so left++
//                     left++;
//                 }
//                 else{                       //positive mai jaarha sum so right--
//                     right--;
//                 }
//             }
//         }
//         return result;
//     }
// }