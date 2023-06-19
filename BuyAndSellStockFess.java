      public static int BuyAndSellInfiniteFees(int[] prices,int fee) {

        int bs = -prices[0]; // initial buy state
        int ss = 0; // initial sell state

        for(int i=1;i<prices.length;i++)
        {
            // first check the buy state
            int nbs = ss - prices[i];
            int nss = prices[i] + bs -fee;
            if(nbs>bs)
            {
                bs = nbs;
            }
            if(nss>ss)
            {
                ss = nss;
            }
        }

        return ss;
        
      }
