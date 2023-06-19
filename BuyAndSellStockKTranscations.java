public static void BuyAndSellStocksKTransactions(int[] days, int k) {
        int[][] dp = new int[k+1][days.length];

        for(int t=1;t<dp.length;t++)
        {
            int max = Integer.MIN_VALUE;
            for(int d=1;d<dp[0].length;d++)
            {
                if(max < dp[t-1][d-1] - days[d-1])
                {
                    max = dp[t-1][d-1] - days[d-1];
                }

                if(max + days[d] > dp[t][d-1])
                {
                    dp[t][d] = max + days[d];
                }
                else{
                    dp[t][d] = dp[t][d-1];
                }

            }
        }
        System.out.println(dp[k][days.length-1]);
        
      }
