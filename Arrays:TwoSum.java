// O(N^2) approach :

class Solution {
    public int[] twoSum(int[] nums, int target) {

     int[] indices = new int[2];
     int num1,num2;
     boolean found =false;
     int j;
    
     for(int i=0; i<nums.length; i++)
     {
         num1 = nums[i];
         indices[0]=i;

         j = i+1;

         while(j < nums.length)
        {
         if(target - num1 == nums[j])
            {
                found = true;
                break;
            }  
            j++;
        }
        if(found == true)
         {
             indices[1]=j;
             break;
         }
 
     }
     return indices;
        
    }
}
