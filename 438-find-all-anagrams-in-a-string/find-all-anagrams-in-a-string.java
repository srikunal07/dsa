import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.length() < p.length()) {
            return result;
        }

        int[] pCount = new int[26];
        int[] sCount = new int[26];
        
        // Count frequency of each character in p
        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }
        
        int pLength = p.length();
        int sLength = s.length();
        
        // Traverse through s with a sliding window
        for (int i = 0; i < sLength; i++) {
            // Add the current character to the window
            sCount[s.charAt(i) - 'a']++;
            
            // Remove the character that is left out of the window
            if (i >= pLength) {
                sCount[s.charAt(i - pLength) - 'a']--;
            }
            
            // Compare arrays of current window with pCount
            if (areArraysEqual(pCount, sCount)) {
                result.add(i - pLength + 1);
            }
        }
        
        return result;
    }
    
    private boolean areArraysEqual(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}
