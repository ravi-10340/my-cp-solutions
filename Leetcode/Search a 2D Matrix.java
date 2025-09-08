class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;
        int s = 0;
        int e = r*c -1;
        int mid = s + (e-s)/2;

        while(s<=e){
            int ele = matrix[mid/c][mid%c];
            if(ele==target){
                return true;
            }
            if(ele<target){
                s = mid+1;
            }
            else{
                e = mid-1;
            }
            mid = s+(e-s)/2;
        }
        return false;

    }
}
