class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashSet<String> hs = new HashSet<>();
        for(String word: banned) {
            hs.add(word);
        }

        paragraph = paragraph.toLowerCase();
        paragraph = paragraph.replaceAll("[^a-z]", " ");
        String[] words = paragraph.split("\\s+");

        HashMap<String, Integer> hm = new HashMap<>();
        for(String word:words) {
            if(!hs.contains(word)) {
                hm.put(word, hm.getOrDefault(word, 0) + 1);
            }
        }

        String result = "";
        int max = 0;
        for(String word:hm.keySet()) {
            if(hm.get(word) > max) {
                max = hm.get(word);
                result = word;
            }
        }
        return result;
    }
}
