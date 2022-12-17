class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
         int cc = 0; int mc =0;
         int i;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                cc++;
                
                if(cc>mc)
                {
                    mc=cc;
                }
            }
            else
            {
                cc=0;
            }
            
return mc;
            }
        }
}
