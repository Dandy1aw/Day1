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
        int count = 0;//定义一个计数
        for(int i= 1;i<nums.length && count <=1;i++)//遍历修改  只要超过一次修改 就跳出循环，说明只可以修改一次。若两次就就是2
        {
            if(nums[i-1]>nums[i])//当出现一个需要修改的数时
            {
                count++; //计数加一
                //判断
                if(i-2<0||nums[i-2]<=nums[i]) nums[i-1]=nums[i];
                else
                    nums[i]=nums[i-1];
            }
        }
        return count<1;/*最后判断，count<1,就是说若修改2次 就不是非递减，一直到最后只修改了一次，那么就是非递减。*/
    }
}
