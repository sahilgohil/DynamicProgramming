public static void BuyAndSellTwoTransaction(int[] arr) {
        
        int[] dpl = new int[arr.length];
        int max = 0;
        dpl[0] = max;
        int lsf = arr[0];


        for(int i=1;i<arr.length;i++)
        {
            int curr = arr[i];
            if(curr < lsf)
            {
                dpl[i] = max;
                lsf = curr;
            }
            else{
                int profit = curr-lsf;
                max = Math.max(max, profit);
                dpl[i] = max;
            }
        }

        for(int i:dpl)
        {
            System.out.print(i+" ");
        }

        int msf = arr[arr.length-1];
        int[] dpr = new int[arr.length];
        dpr[arr.length-1] = 0;
        int maxRight = 0;

        for(int i=arr.length-2;i>=0;i--)
        {
            int curr = arr[i];
            if(curr>msf)
            {
                dpr[i] = maxRight;
                msf = curr;
            }
            else{
                int profit = msf-curr;
                maxRight = Math.max(maxRight, profit);
                dpr[i] = maxRight;
            }
        }

        int ans = Integer.MIN_VALUE;

        for(int i=0;i<dpl.length;i++)
        {
            ans = Math.max(ans, dpl[i]+dpr[i]);
        }
        System.out.println(ans);

      }
