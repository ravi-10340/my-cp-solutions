import java.util.*;

class Solution {
    private static final String VOWELS = "aeiou";

    // Helper function: vowels ko '*' me convert kare
    private String devowel(String word) {
        StringBuilder sb = new StringBuilder();
        for (char c : word.toCharArray()) {
            if (VOWELS.indexOf(c) >= 0) {
                sb.append('*');
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public String[] spellchecker(String[] wordlist, String[] queries) {
        // --- Step 1: Preprocess wordlist ---
        HashSet<String> exactWords = new HashSet<>();
        HashMap<String, String> caseInsensitive = new HashMap<>();
        HashMap<String, String> vowelInsensitive = new HashMap<>();

        for (String word : wordlist) {
            exactWords.add(word);

            String lower = word.toLowerCase();
            caseInsensitive.putIfAbsent(lower, word);

            String devowelWord = devowel(lower);
            vowelInsensitive.putIfAbsent(devowelWord, word);
        }

        // --- Step 2: Process queries ---
        String[] result = new String[queries.length];

        for (int i = 0; i < queries.length; i++) {
            String q = queries[i];

            // Rule 1: Exact match
            if (exactWords.contains(q)) {
                result[i] = q;
                continue;
            }

            // Rule 2: Case-insensitive match
            String lowerQ = q.toLowerCase();
            if (caseInsensitive.containsKey(lowerQ)) {
                result[i] = caseInsensitive.get(lowerQ);
                continue;
            }

            // Rule 3: Vowel-insensitive match
            String devowelQ = devowel(lowerQ);
            if (vowelInsensitive.containsKey(devowelQ)) {
                result[i] = vowelInsensitive.get(devowelQ);
                continue;
            }

            // Rule 4: No match
            result[i] = "";
        }

        return result;
    }
}
