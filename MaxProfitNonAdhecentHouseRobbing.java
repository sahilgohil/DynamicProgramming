
public static int maxSumNonAdjecentSubsequences(int[] arr) {

        int inc = arr[0];
        int exc = 0;

        for(int i=1;i<arr.length;i++)
        {
            int ninc = exc+arr[i];
            int nexc = Math.max(exc, inc);

            inc = ninc;
            exc = nexc;
        }
        return Math.max(inc, exc);
    }
