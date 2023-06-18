 /*
       * buy and sell stocks One transaction allowed
       */

    public static int BuyAndSellStocks(int[] arr) {

        int lsf = Integer.MAX_VALUE; // least value so far
        int pist = 0; // profit if sold today
        int op = 0; // overall profit

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] < lsf)
            {
                lsf = arr[i];
            }

            pist = arr[i] - lsf;
            if(op < pist)
            {
                op = pist;
            }
        }

        return op;
    }
