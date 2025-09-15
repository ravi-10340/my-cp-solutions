class Solution {
     public static int canBeTypedWords(String text, String brokenLetters) {
        int res = 0;
        int ind = 0;
        String[] words = text.split(" ");
        for (String w : words) {
            System.out.println(w);
            boolean b = true;
            for (int i = 0; i < brokenLetters.length(); i++) {
                if (w.contains(String.valueOf(brokenLetters.charAt(i)))) {
                    b = false;
                    break;
                } 
            }
            if(b==true){
                res++;
            }
        }

        return res;
    }
}
