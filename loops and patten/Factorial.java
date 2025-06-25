public class Factorial {
    public static void main(String[] args) {
        int num=4, fact=1;
        while (num!=0) {
            fact=fact*num;
            num--;
        }
        System.out.println(fact);
    }
}
