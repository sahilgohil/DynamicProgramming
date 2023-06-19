public static int BuyAndSellInfiniteCooldown(int[] arr) {

        int bs = -arr[0]; // buy state
        int ss = 0; // sell state
        int cds = 0; // cooldown state

        for(int i=1;i<arr.length;i++)
        {
            int nbs = cds-arr[i];
            int nss = arr[i] + bs;
            int ncds = ss;

            if(nbs>bs) bs = nbs;
            if(nss>ss) ss = nss;
            if(ncds> cds) cds = ncds;
        }

        return ss;
      }
