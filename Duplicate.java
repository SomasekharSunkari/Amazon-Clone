class Duplicate{
    public static void main(String[] args) {
        
    }
    public static String addBinary(String a , String b)
    {
        StringBuilder result   = new StringBuilder();
        int i = a.length() - 1 ;
        int carry = 0;
        int j = b.length() - 1 ;
        int sum =0;
        while(i>=0 || j>=0) 
        {
            int sum = carry;

            if(i>=0)
            {
                sum+=a.charAt(i) - '0';

            }
            if(j>=0)
            {
                sum+=b.charAt(j) - '0';
            }

            result.append(sum % 2);
            carry = sum / 2;
            i--;
            j--;

        }
        while(carry!=0)
        {
            result.append(carry);
        }
    }
}