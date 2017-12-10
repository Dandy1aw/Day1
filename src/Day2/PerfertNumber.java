package Day2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by syw on 2017/12/10.
 */
/**
 * We define the Perfect Number is a positive integer that is equal to the sum of all its positive divisors except itself.

 Now, given an integer n, write a function that returns true when it is a perfect number and false when it is not.

 * */
public class PerfertNumber {
    /**自己的方法，超时了
     * */
    public boolean perfect(int num)
    {

        List<Integer> list = new ArrayList<Integer>();
        int sum = 0;
        for(int i = 1;i <=num/2;i++)
        {
            if(num%i==0) list.add(i);
        }
        for(int s : list)
        {
            sum+=s;
        }
        return sum==num;
    }
    /**最优法：
     * */
    public class  perfectSolution{
        public boolean perfectNumber(int num)
        {
            if (num==1) return false;
            int sum = 0;
            for(int i=2;i<=Math.sqrt(num);i++)
            {
                if (num%i==0)
                {
                    sum+=i;   /*如果不是其根号数需要加上除数以及被除数,因为是根号数就只要加一次即可*/
                    if (num/i!=i) sum +=num/i;
                }

            }
            sum++;/*最后加上1即可*/
            return sum==num;
        }
    }
//    public class Solution {
//        public boolean checkPerfectNumber(int num) {
//            if (num == 1) return false;/* 如果是1，输出否*/
//            int sum = 0; /*定义一个和，用于存放*/
//            for (int i = 2; i <= Math.sqrt(num); i++) {/*从2 遍历到 根号 num,然后能整除就加上除数和被除数，当是平方的时候就只加一次*/
//                if (num % i == 0) {
//                    sum += i;
//                    if (i != num / i) sum += num / i;
//                }
//            }
//            sum++;//最后加上1
//            return sum == num;
//        }
//    }
}
