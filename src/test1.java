

public class test1 {

    public static void main(String[] args) {
        int n=105;
        int result= (int) factorial(n);
        String a=String.valueOf(result);
        int b=Integer.valueOf(a);
        System.out.println(a);
        System.out.println(returnNum(a));
    }
    public static long factorial(long number) {
        if (number <= 1)
            return 1;
        else
            return number * factorial(number - 1);
    }
    public static int returnNum(String num){
        int leng=num.length();
        int result=0;
        for (int i=leng;i>=0;i--){
            String temp=num.substring(i-1,i);
            if (temp.equals("0")){
                result++;
            }else break;
        }
        return result;
    }
}
