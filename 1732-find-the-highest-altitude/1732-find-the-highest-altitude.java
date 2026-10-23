class Solution {
    public int largestAltitude(int[] gain) {
        int[] alt=new int[gain.length+1];
        alt[0]=0;int e=Integer.MIN_VALUE;
        for(int i=0;i<gain.length;i++){
            alt[i+1]=gain[i]+alt[i];
        }
        for(int i=0;i<alt.length;i++){
            if(e<alt[i]){
                e=alt[i];
            }
        }
        return e;
    }
}