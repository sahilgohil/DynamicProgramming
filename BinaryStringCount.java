 long countStrings(int n) {
        
        long[] dp0 = new long[n+1];
        long[] dp1 = new long[n+1];
        
        dp0[1] = (long)(1);
        dp1[1] = (long)(1);
        
        for(int i=2;i<dp0.length;i++)
        {
            dp0[i] = (long)dp0[i-1]+dp1[i-1];
            dp1[i] = (long)dp0[i-1];
        }
        return (long)(dp0[n] + dp1[n]);
        // code here
    }
