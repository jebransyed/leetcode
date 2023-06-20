class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> getDistance(a).compareTo(getDistance(b)));
        for(int[] point:points) {
            pq.add(point);
        }

        int[][] result = new int[k][2];
        for(int i=0; i<k; i++) {
            result[i] = pq.poll();
        }
        return result;
    }

    private Double getDistance(int[] point) {
        int x = point[0];
        int y = point[1];
        return Math.sqrt((x * x) + (y * y));
    }
}
