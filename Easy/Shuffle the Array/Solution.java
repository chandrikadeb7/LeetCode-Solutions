class Solution {
    public int[] shuffle(int[] nums, int n) {
        int m = 2*n;
        int res[] = new int[m];
        int j=0;
        for(int i=0; i<m; i++)
        {
            if(i%2==0)
            {
                res[i]= nums[j];
                j++;
            }
            else
            {
                res[i]=nums[n];
                n++;
            }
        }
        return res;
    }
}