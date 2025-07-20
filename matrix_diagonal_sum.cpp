class Solution {
public:
    int diagonalSum(vector<vector<int>>& mat) {
        int n=mat.size();
        int primarysum=0,secondarysum=0;
        for( int i=0,j=0;i<n;i++,j++){

        
            primarysum+=mat[i][j];
            secondarysum+=mat[i][n-1-j];
        }
        if(n%2==1){
            int mid=n/2;
            secondarysum-=mat[mid][mid];
        }
        return primarysum+secondarysum;
        
    }
};