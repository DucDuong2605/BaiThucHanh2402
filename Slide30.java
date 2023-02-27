public class slise34 {
public static void main(string[] args){
        int n;
        int sum =0;
        System.out.println("nhap n =");
        n = new Scanner(System.in).nextInt();
        int m = n;
        System.out.print("sum= ");
        while (n>0){
            System.out.println(n%10+"+");
            sum+= n%10;
            n/= 10;
        }
        System.out.println("Tong"+m+"="+sum);
    }
}