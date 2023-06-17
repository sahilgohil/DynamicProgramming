 public static int arrangeBuildings(int n) {

        int[] dpb = new int[n+1];
        int[] dps = new int[n+1];

        dpb[1] = 1;
        dps[1] = 1;

        for(int i=2;i<dpb.length;i++)
        {
            dpb[i] = dps[i-1];
            dps[i] = dpb[i-1] + dps [i-1];
        }

        return (dpb[n]+dps[n])*(dpb[n]+dps[n]);
        
    }
