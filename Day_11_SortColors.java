class Solution {
    public void sortColors(int[] nums) {
        
        int one=0, two =0, n=nums.length;
        
        for(int num:nums){
            if(num==1) one++;
            if(num==2) two++;
        }
        
        for(int i=0;i<n;i++){
            if(i<n-(one+two)) nums[i]=0;
            else if(i<n-two) nums[i]=1;
            else nums[i]=2;
        }
    }
}