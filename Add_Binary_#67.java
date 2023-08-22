class Add_Binary{
    public static void main(String[] args) {
System.out.println(addBinary("11000","11"));
    }
  
            public static String addBinary(String a, String b) {
                StringBuilder result = new StringBuilder();
                
                int carry = 0;  // Initialize carry
                
                int i = a.length() - 1;
                int j = b.length() - 1;
                
                // Iterate from right to left
                while (i >= 0 || j >= 0) {
                    int sum = carry;  // Add carry from previous step
                    
                    if (i >= 0)
                        sum += a.charAt(i) - '0';  // Convert char to int
                    
                    if (j >= 0)
                        sum += b.charAt(j) - '0';  // Convert char to int
                    
                    result.append(sum % 2);  // Append the rightmost digit of sum
                    
                    carry = sum / 2;  // Calculate carry for the next step
                    
                    i--;
                    j--;
                }
                
                if (carry != 0)
                    result.append(carry);  // If there's a remaining carry
                
                return result.reverse().toString();  // Reverse and convert to string
            }
            
           
        }
        
     