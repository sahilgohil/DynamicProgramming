   public static int paintHouse(int[][] arr)
    {
        int[][] dp = new int[arr.length][arr[0].length];

        dp[0][0] = arr[0][0];
        dp[0][1] = arr[0][1];
        dp[0][2] = arr[0][2];

        for(int i=1;i<arr.length;i++)
        {
            dp[i][0] = arr[i][0] + (Math.min(dp[i-1][1], dp[i-1][2]));
            dp[i][1] = arr[i][1] + (Math.min(dp[i-1][0], dp[i-1][2]));
            dp[i][2] = arr[i][2] + (Math.min(dp[i-1][1], dp[i-1][0]));
        }

        return Math.min(Math.min(dp[arr.length-1][0], dp[arr.length-1][1]), dp[arr.length-1][2]);

    }
