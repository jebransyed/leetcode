class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for(Character c:tasks) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
        PriorityQueue<Character> pq = new PriorityQueue((a, b) -> hm.get(b) - hm.get(a));
        int idleCount = 0, taskCount = 0;
        for(Character c:hm.keySet()) {
            pq.add(c);
        }

        while(!pq.isEmpty()) {
            Queue<Character> q = new LinkedList<>();
            for(int i=0; i<=n; i++) {
                if(!pq.isEmpty()) {
                    q.add(pq.poll());
                    taskCount++;
                } else if(taskCount < tasks.length) {
                    idleCount++;
                }
            }

            while(!q.isEmpty()) {
                Character c = q.poll();
                hm.put(c, hm.get(c) - 1);
                if(hm.get(c) > 0) {
                    pq.add(c);
                }
            }
        }

        return taskCount + idleCount;
    }
}
