class Solution {
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int[] result = new int[amount + 1];
        Arrays.fill(result, Integer.MAX_VALUE);
        result[0] = 0;

        for(int i=1; i<=amount; i++) {
            for(int j=0; j<coins.length; j++) {
                if(coins[j]<=i) {
                    if(result[i-coins[j]] != Integer.MAX_VALUE) {
                        result[i] = Math.min(result[i], 1+result[i-coins[j]]);
                    }
                } else {
                    break;
                }
            }
        }

        return (result[amount]==Integer.MAX_VALUE) ? -1: result[amount];
    }
}
