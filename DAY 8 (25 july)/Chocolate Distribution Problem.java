class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        long min=Long.MAX_VALUE;
        for(int i=0;i<=n-m;i++)
        {
            min=Math.min((Math.abs((long)a.get(i)-(long)a.get(i+m-1))),min);
        }
        return min;
    }
}