public class Solution {
    public String getPermutation(int n, int k) {
        StringBuilder sb = new StringBuilder();
         
        ArrayList<Integer> num = new ArrayList<Integer>();  //Num array
        int fact = 1;       //Final Fact. Number
         
        for (int i = 1; i <= n; i++) {
            fact *= i;
            num.add(i);
        }
         
        k--;
        for (int i = 0;i < n; i++) {
            fact /= (n - i);
            int index = (k / fact);
            sb.append(num.remove(index));
            k %= fact;
        }
        return sb.toString();
    }
}
