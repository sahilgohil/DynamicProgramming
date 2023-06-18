    /*
     * buy and sell infinite transaction allowed
     */

     public static int BuyAndSellStocksInfinite(int[] arr) {

        int buy = arr[0];
        int sell = arr[0];
        int profit = 0;

        for(int i=1;i<arr.length;i++)
        {
            int todayPrice = arr[i];
            if(todayPrice < sell || i == arr.length-1)
            {
                if(sell-buy >0)
                {
                    profit+= sell-buy;
                }
                buy = todayPrice;
                sell = todayPrice;
            }
            else{
                sell = todayPrice;
            }
            
        }
        return profit;
     }
