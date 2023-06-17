public static int countSubsequencesOfForm(String s) {

        int a = 0;
        int ab = 0;
        int abc = 0;

        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c == 'a')
            {
                a = a+a+1;
            }
            else if(c== 'b')
            {
                ab = ab+ab+a;
            }
            else if(c == 'c')
            {
                abc = abc+abc+ab;
            }
        }
        return abc;
        
    }
