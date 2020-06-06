class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (x, y) -> x[0] == y[0] ? x[1] - y[1] : y[0] - x[0]);
        
        List<int[]> list = new ArrayList<int[]>();
        int i, N = people.length;
        for (i = 0; i < N; i++) {
            list.add( people[i][1], people[i]);
        }

        return list.toArray(new int[N][2]);
    }
}