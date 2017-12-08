package tohex;

/**
 * Created by syw on 2017/12/8.
 */
public class toHex {
    public static void main(String[] args) {
        int num = 23;
        char[] map = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'}; /*定义一张图 分别放入16个代表十六进制中的数*/
        System.out.println(toHexMethod(num,map));

    }

    private static String toHexMethod(int num, char[] map) {
        /*如果该数为0*/
        if (num ==0)
            return "0";
        String res = "";/*定义一个空串用于存放结果*/
        while (num!=0)
        {
            res = map[(num&15)]+res;/*这一步res位置不能颠倒，因为高位数总是在前面*//*与15利用二进制计算的原理，提取后4位*/
            num = num>>>4;/*无符号右移4位，高位以0补足。*/
        }
        return  res;
    }
}
