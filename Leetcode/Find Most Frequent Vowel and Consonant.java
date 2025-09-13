class Solution {
    public boolean isvow(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }
        return false;
    }

    public int maxFreqSum(String s) {
        HashMap<Character, Integer> mpv = new HashMap<>();
        HashMap<Character, Integer> mps = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (isvow(ch)) {
                mpv.put(ch, mpv.getOrDefault(ch, 0) + 1);

            } else {
                mps.put(ch, mps.getOrDefault(ch, 0) + 1);

            }
        }
        int minv = 0, mins = 0;
        for (int freq : mpv.values()) {
            minv = Math.max(minv, freq);
        }
        for (int freq : mps.values()) {
            mins = Math.max(mins, freq);
        }
        return minv + mins;
        
    }
}
