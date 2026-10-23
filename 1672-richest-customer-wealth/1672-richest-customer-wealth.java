class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;int a=0;
        for(int i=0;i<accounts.length;i++){
            for(int j=0;j<accounts[i].length;j++){
                a=a+accounts[i][j];
            }
            if (max<a){
                max=a;
            }
            a=0;
        }
        return max;
    }
}