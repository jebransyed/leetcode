class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String, List<String>> hm = new HashMap<>();
        
        for(String word:strs) {
            String sorted = getSortedString(word);
            if(hm.containsKey(sorted)) {
                hm.get(sorted).add(word);
            } else {
                List<String> list = new ArrayList<>();
                list.add(word);
                hm.put(sorted, list);
            }
        }
        result.addAll(hm.values());
        return result;
    }

    private String getSortedString(String word) {
        char[] ch = word.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
}
