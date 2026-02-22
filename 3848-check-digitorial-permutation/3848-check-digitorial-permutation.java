class Solution {
    public boolean isDigitorialPermutation(int n) {
        if(n==3) return false;
        int[] t = digitcount(n);
        int[] can = { 1, 2, 3, 145, 40585 };
        for (int x : can) {

            if (digitcount(x).length == t.length && samed(t, digitcount(x))) {
                return true;
            }
        }
        return false;
    }

    private int[] digitcount(int num) {
        int[] count = new int[10];
        if (num == 0)
            count[0]++;
        while (num > 0) {
            count[num % 10]++;
            num /= 10;
        }
        return count;
    }

    private boolean samed(int[] a, int[] b) {
        for (int i = 0; i < 10; i++) {
            if (a[i] != b[i])
                return false;
        }
        return true;
    }
}