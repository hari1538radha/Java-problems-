public class 202-Happy_Number {
    
}
class Solution {
    public boolean isHappy(int n) {
        while(n>4)
        {
            int d=n; int s=0;
            while(d>0)
            {
                s+=Math.pow(d%10,2);
                d/=10;

            }
            n=s;
        }
        return n==1;
    }
}