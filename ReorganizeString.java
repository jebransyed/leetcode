class Solution {
    public String reorganizeString(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            Character c = s.charAt(i);
            if(hm.containsKey(c)) {
                hm.put(c, hm.get(c) + 1);
            } else {
                hm.put(c, 1);
            }
        }

        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> hm.get(b) - hm.get(a));
        pq.addAll(hm.keySet());

        StringBuilder sb = new StringBuilder();
        Character prev = pq.poll();
        sb.append(prev);
        hm.put(prev, hm.get(prev) - 1);
        while(!pq.isEmpty()) {
            Character curr = pq.poll();
            sb.append(curr);
            hm.put(curr, hm.get(curr) - 1);
            if(hm.get(prev)> 0) {
                pq.add(prev);
            }
            prev = curr;
        }

        if(hm.get(prev) > 0) {
            return "";
        } else {
            return sb.toString();
        }
    }
}
