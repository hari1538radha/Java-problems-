class Solution {
    public boolean isPalindrome(int x) {
       int  originalnumber = x;
        int reversednum= 0; int remainder;
       if(x<0)
       {
           return false;
       }
        while(x!=0)
        {
            remainder =x%10;
            reversednum = reversednum * 10 + remainder;
            x/=10;
        }
        
        if(reversednum == originalnumber)
        {
          return true;
        }
        else{
            return false;
        }
    }
}public class Palindrom_Number {
    
}
