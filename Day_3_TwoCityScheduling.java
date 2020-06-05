class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int sum = 0, len = costs.length, n = len/2;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i=0; i<len; i++){
            sum += costs[i][0];
            pq.add(costs[i][1] - costs[i][0]);
            if(i>=n){
                sum += pq.remove();
            }
        }
        
        return sum;
    }
}