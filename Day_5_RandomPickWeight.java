class Solution {

   int[] arr;
   int sum = 0;
   Random random = new Random();
   public Solution(int[] w) {
       int[] arr = new int[w.length];
       arr[0] = w[0];
       sum += w[0];
       for(int i=1; i<w.length; i++){
           arr[i] = arr[i-1] + w[i];
           sum+=w[i];
       }
       this.arr = arr;
   }
   
   public int pickIndex() {
       int rnd = random.nextInt(sum) + 1;
       int ret = Arrays.binarySearch(arr, rnd);
       return ret>=0? ret: -ret-1;
   }

}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */