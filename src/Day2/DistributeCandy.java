package Day2;

/**
 * Created by syw on 2017/12/10.
 */

/**Given an integer array with even length, where different numbers in this array represent different kinds of candies.
 Each number means one candy of the corresponding kind.
 You need to distribute these candies equally in number to brother and sister.
 Return the maximum number of kinds of candies the sister could gain.
 * */

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**思路：如果糖果种类大于糖果数的二分之一，那么妹妹最多拿到糖果数的1/2,否则就是每种都拿到也就是糖果的种类数。
 * */
public class DistributeCandy {

    public  static  int distributeCandies(int[] candies) {
        Set<Integer> set = new HashSet<Integer>();
        for ( int s : candies)
        {
            set.add(s);
        }
        return set.size()>=candies.length/2 ? candies.length/2 : set.size();
    }

}
