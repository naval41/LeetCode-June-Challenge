class Solution {
    public int singleNumber(int[] nums) {
        
        int ones = 0, twos = 0 ;  
        int bitMastPattern;    
        for( int i=0; i< nums.length; i++ )  
        {  
            twos = twos | (ones & nums[i]);  
            ones = ones ^ nums[i];  
            bitMastPattern = ~(ones & twos);  
            ones &= bitMastPattern;
            twos &= bitMastPattern;  
        }  

        return ones;
        
    }
}
