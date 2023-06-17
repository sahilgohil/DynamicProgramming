    public static int waysTotileFloorMbyn(int n, int m) {
        // need to knwo the ways to tile the m by n length of floor usnig the m by 1 length of tile
        int[] dp = new int[n+1];

        for(int i=1;i<dp.length;i++)
        {
            if(i<m)
            {
                dp[i] = 1;
            }
            else if(i == m)
            {
                dp[i] = 2;
            }
            else{
                dp[i] = dp[i-1]+dp[i-m];
            }
        }
        return dp[n];
        
    }
