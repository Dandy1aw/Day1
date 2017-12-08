package Non_decreasingArray;

/**
 * Created by syw on 2017/12/8.
 */
/**非递减数组：
 * Given an array with n integers, your task is to check if it could become non-decreasing by modifying at most 1 element.

 We define an array is non-decreasing if array[i] <= array[i + 1] holds for every i (1 <= i < n).

 * */
public class Non_decreasing {
    public static void main(String[] args) {
        int [] num = {4,2,3,4,5,2,5,1,3};
        System.out.println(checkPossibility(num));
        for (int i=0;i<num.length;i++)
        {
            System.out.print(num[i]);
        }

    }
    public  static boolean checkPossibility(int[] nums) {
        int cnt = 0;                                                                    //记录改变的次数
        for(int i = 1; i < nums.length && cnt<=1 ; i++){
            if(nums[i-1] > nums[i]){
                cnt++;
                if(i-2<0 || nums[i-2] <= nums[i])nums[i-1] = nums[i];                    //如果i是第一个数，或者i-2这个数小于i那么只要将 i-1改成i即可
                else nums[i] = nums[i-1];                                                //如果i-2这个数大于i这个数那么必须修改是第i个数，
            }
        }
        return cnt<=1;
    }
}
