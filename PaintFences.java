  long countWays(int n,int k)
    {
        //code here.
        long same = (k *1)L;
        long diff = (k * (k-1)L;
        long total = (same+diff)L;
        
        for(int i=2;i<n;i++)
        {
            long ns = (diff) L;
            long nd = (total * (k-1)) L;
            
            same = ns;
            diff = nd;
            total = (same + diff) L;
        }
        return total;
    }
