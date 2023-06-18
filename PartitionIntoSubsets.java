     /*
      * partition n people into k subsets
      this means that the putting n people in k teams
      */

      public static int waysToPartitionNpeopleInKsubset(int n, int k) {
        // formula is f(n,k) = k*f(n-1,k) + f(n-1,k-1)
        // we will make 2d dp for subsets

        /*
         * the base cases are
         * if there are n=1,k=1 = 1
         * k = 1, 1
         * n<k = 0
         * n>k = formula
         */
        int[][] dp = new int[k+1][n+1];
        for(int i=1;i<dp.length;i++)
        {
            for(int j=1;j<dp[0].length;j++)
            {
                if(i == 1)
                {
                    dp[i][j] = 1;
                }
                else if(i == j)
                {
                    dp[i][j] = 1;
                }
                else if(i>j)
                {
                    dp[i][j] = 0;
                }
                else{
                    dp[i][j] = i * dp[i][j-1] + dp[i-1][j-1];
                }
            }
        }

        return dp[k][n];
        
      }
