public class BasicArrayQuestion2 {
    public static void main(String[] args) {
        int[] num = new int[26];
        num[0] = 100;
        num[25] = 200;
        int temp = num[25];
        num[25] = num[0];
        num[0] =temp;
        System.out.println(num[0] + " "+num[25]);

    }
}
