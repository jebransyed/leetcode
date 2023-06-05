class Solution {
    public boolean canCross(int[] stones) {
        HashMap<Integer, Set<Integer>> map = new HashMap<>();
        for(Integer stone:stones) {
            map.put(stone, new HashSet<Integer>());
        }
        map.get(stones[0]).add(0);
        for(Integer stone:stones) {
            for(Integer jump:map.get(stone)) {
                for(int i=jump-1; i<=jump+1; i++) {
                    if(i<=0) {
                        continue;
                    }
                    if(map.containsKey(stone+i)) {
                        map.get(stone+i).add(i);
                    }
                }
            }
        }
        Integer finalStone = stones[stones.length - 1];
        return map.get(finalStone).size() > 0;
    }
}
