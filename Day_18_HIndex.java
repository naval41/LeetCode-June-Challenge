class Solution {
    public int hIndex(int[] citations) {
        
        int l=0,h=citations.length-1,n=citations.length;
        int mid=0;
        
        while(l<=h){
            mid=l+(h-l)/2;
            
            if(n-mid>citations[mid]) l=mid+1;
            else h=mid-1;
        }
        
        return n-l;
    }
}
