package medium;

import java.util.ArrayList;
import java.util.List;

class Trie {

    List<String> trieList;
    /** Initialize your data structure here. */
    public Trie() {
        trieList = new ArrayList<>();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        trieList.add(word);
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        for(String entry:trieList){
            if(entry.equals(word)){
                return true;
            }
        }
        return false;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        for(String entry:trieList){
            if(entry.startsWith(prefix)){
                return true;
            }
        }
        return false;
    }
}
