import java.util.Arrays;
class Max_Gap{
    public static void main(String[] args) {
        int arr[] = {3,6,9,1};
        Arrays.sort(arr);
        for(int v:arr){
            System.out.print(v + " ");
        }
        System.out.print(maximumGap(arr));

    }
    public  static int maximumGap(int[] nums) {
        int max  =0;
        if(nums.length < 2)
        {
            return 0;
        }
        else{
        Arrays.sort(nums);
        int deiffernce = 0;
        
        for(int i =1;i<nums.length;i++)
        {
        deiffernce = nums[i] - nums[i -1];
        System.out.println(deiffernce);
        max = deiffernce > max ? deiffernce : max;
        }
        return max;
        }
        
    }
}