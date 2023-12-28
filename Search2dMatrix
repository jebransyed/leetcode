class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int top=0, bottom=matrix.length-1, left=0, right=matrix[0].length-1;
        int row=0;

        while(top<=bottom){
             int mid=(top+bottom)/2;
             if(matrix[mid][0]==target) {
                 return true; 
             } else if(target<matrix[mid][0]) {
                 bottom = mid-1;
             } else {
                 if(target<=matrix[mid][right]) {
                     row=mid;
                     break;
                 } else {
                     top=mid+1;
                 }
             }
         }

         while(left<=right) {
             int mid=(left+right)/2;
             if(target == matrix[row][mid]) {
                 return true;
             } else if(target<matrix[row][mid]) {
                 right=mid-1;
             } else {
                 left=mid+1;
             }
         }
         return false;
    }
}
