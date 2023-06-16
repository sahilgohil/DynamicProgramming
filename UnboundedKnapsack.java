    public static int unboundedKnapsack(int bagCapacity, int[] prices, int[] weight)
    {
        int[] dp = new int[bagCapacity+1];
        dp[0] = 0;
        for(int i=1;i<dp.length;i++)
        {
            int max = Integer.MIN_VALUE;
            for(int j=0;j<weight.length;j++)
            {
                int currentItemWeight = weight[j];
                if(currentItemWeight<=i)
                {
                    int price = prices[j]+dp[i-currentItemWeight];
                    max = Math.max(max, price);
                }
            }
            dp[i] = max;
        }

        return dp[dp.length-1];

    }
