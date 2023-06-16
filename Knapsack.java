    public static int knapsackProblem(int bagCapacity, int[] profit, int [] weight, int items)
    {
        int[][] dp = new int[items+1][bagCapacity+1];

        for(int i=1;i<dp.length;i++)
        {
            for(int j=1;j<dp[0].length;j++)
            {
                int w = weight[i-1];
                if(w>=j)
                {
                    int upperWeight = dp[i-1][j];
                    int current =profit[i-1] +dp[i-1][j-w];
                    dp[i][j] = Math.max(upperWeight, current);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[dp.length-1][dp[0].length-1];
    }
