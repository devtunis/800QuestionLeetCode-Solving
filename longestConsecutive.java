class Solution {
    public int longestConsecutive(int[] nums) {
     
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longest = 0;

       
        for (int num : numSet) {
             
            if (!numSet.contains(num - 1)) {
                int current = num;
                int length = 1;

          
                while (numSet.contains(current + 1)) {
                    current += 1;
                    length += 1;
                }

             
                longest = Math.max(longest, length);
            }
        }

        return longest;
    }
}

// first solution is good    but dirty a little to have funn with coding 

import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class Sample{
   
    // Preety doc here in(typr arr[],type x)
    public static boolean in(int arr[],int x){
        boolean found = false;
        for(int item : arr){
            if (item==x){
                found = true;
            }
        }
        return found;
    }
    
    public static int Comp(int a, int b){
        return a>b ? a : b ;
    }
public static int  Consuectivenumber(int nums[]){
    
   if (nums.length==0){
       return -1;
   }
   if(nums.length==1){
       return 1;
   }

 
  
   


 
 int longestSequence = 0 ;
 
  
for (int i = 0 ;i<nums.length;i++){
 
  List<Integer> collect = new ArrayList<>();
  boolean test = false;
 
  if (!in(nums,nums[i]-1)){
      collect.add(nums[i]);
      test = true;
  }
  while(test){
  if (in(nums,collect.get(collect.size()-1)+1)){
          collect.add(collect.get(collect.size()-1)+1);
      }else{
       
         test = false ;
       
           
           longestSequence  =Comp(longestSequence,collect.size());
           
      }
  }
}


return longestSequence;
}

    public static void main(String args[]){

   int [] nums  = {10,1,3,7,13,11,2,4};

    System.out.println("longest size is "+" "+Consuectivenumber(nums));
    }
}


