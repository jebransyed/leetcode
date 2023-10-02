class Trie {
    Trie[] t;
    boolean end = false;
    public Trie() {
        t = new Trie[26];
    }
    
    public void insert(String word) {
        if(word.length() == 0) {
            end = true;
        } else {
            int index = word.charAt(0)-'a';
            if(t[index]== null) {
                t[index] = new Trie();
            }
            t[index].insert(word.substring(1));
        }
    }
    
    public boolean search(String word) {
        if(word.length()==0) {
            return end;
        } else {
            int index = word.charAt(0)-'a';
            if(t[index]==null) {
                return false;
            }
            return t[index].search(word.substring(1));
        }
    }
    
    public boolean startsWith(String prefix) {
        if(prefix.length()==0) {
            return true;
        } else {
            int index = prefix.charAt(0)-'a';
            if(t[index]==null) {
                return false;
            }
            return t[index].startsWith(prefix.substring(1));
        }
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
