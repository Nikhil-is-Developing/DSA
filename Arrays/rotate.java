//rotate image
class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int temp;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
            int right=n-1;
            int left=0;
            while(left<right){
                temp=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;

                left++;
                right--;
            }
        }

    }
}