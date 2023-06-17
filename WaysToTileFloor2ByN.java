   public static int waysTotileFloor2byn(int n) {
        // need to knwo the ways to tile the 2 by n length of floor usnig the 2 by 1 length of tile
        int[] dp = new int[n+1];
        dp[0] = 0; // 2 by 0 no ways
        dp[1] = 1; // 2by 1 only one way
        dp[2] = 2; // 2by 2 two ways 2 vertical or 2 horizontal

        // now if we are asked to find the tiling for n floor
        for(int i=3;i<dp.length;i++)
        {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
        
    }
