public static int maxWaysToDecodeEncoing(String code) {

        int[] dp = new int[code.length()];
        dp[0] = 1; // first digit can only be decoded one way
        for(int i=1;i<dp.length;i++)
        {
            char pre = code.charAt(i-1);
            char curr = code.charAt(i);

            if(pre == '0' && curr =='0')
            {
                dp[i] = 0;
            }
            else if(pre == '0' && curr != '0')
            {
                dp[i] = dp[i-1];
            }
            else if(pre != '0' && curr == '0')
            {
                if(pre == '1' || pre == '2')
                {
                    dp[i] = i>= 2 ? dp[i-2]:1;
                }
                else{
                    dp[i] = 0;
                }
            }
            else{
                if(Integer.parseInt(pre+""+curr) <= 26)
                {
                    dp[i] = dp[i-1]+ (i>= 2 ? dp[i-2]:1);
                }
                else{
                    dp[i] = dp[i-1];
                }
            }
        }

        return dp[code.length()-1];
        
    }
