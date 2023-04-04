class Solution {
    HashMap<Character, Integer> hm = new HashMap<>();
    public boolean isAlienSorted(String[] words, String order) {
        for(int i=0; i<order.length(); i++) {
            hm.put(order.charAt(i), i);
        }
        String[] copy = words.clone();
        Arrays.sort(copy, new AlienComparator());
        return Arrays.equals(words, copy);
    }

    class AlienComparator implements Comparator<String> {
        public int compare(String str1, String str2) {
            int i=0, j=0;
            while(i<str1.length() && j<str2.length() && str1.charAt(i) == str2.charAt(j)) {
                i++;
                j++;
            }
            if(i == str1.length()) {
                return -1;
            } else if(j == str2.length()) {
                return 1;
            } else {
                return hm.get(str1.charAt(i)) - hm.get(str2.charAt(j));
            }
        }
    }
}
