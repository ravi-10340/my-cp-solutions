class Solution {
    public int compareVersion(String version1, String version2) {
        String[] arr1 = version1.split("\\.");
        String[] arr2 = version2.split("\\.");

        int n = arr1.length, m = arr2.length;
        int i = 0, j = 0;

        while (i < n || j < m) {
            int v1 = (i < n) ? Integer.parseInt(arr1[i]) : 0;
            int v2 = (j < m) ? Integer.parseInt(arr2[j]) : 0;

            if (v1 > v2) return 1;
            if (v1 < v2) return -1;

            i++;
            j++;
        }
        return 0;
    }
}
