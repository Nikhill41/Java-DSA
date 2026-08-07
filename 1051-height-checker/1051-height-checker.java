class Solution {
    public int heightChecker(int[] heights) {
        int n=heights.length;
        int count=0;
        int[] expected=Arrays.copyOf(heights,heights.length);
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(expected[j]>expected[j+1]){
                    int temp=expected[j];
                    expected[j]=expected[j+1];
                    expected[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(heights[i]!=expected[i]) count++;
        }
        return count;
    }
}