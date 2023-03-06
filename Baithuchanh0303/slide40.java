
public class slide40 {
    public static void main(String[] args) {
        int ngay;
        Scanner sc = new Scanner(System.in);
        System.out.print("cac ngay trong tuan");

    
        do {
            System.out.print("\nNhap ngay : ");
            day = sc.nextInt();
            switch(day) {
                case 1:
                System.out.print("thu 2");
                break;
                case 2:
                System.out.print("thu 3");
                break;
                case 3:
                System.out.print("thu 4");
                break;
                case 4:
                System.out.print("thu 5");
                break;
                case 5:
                System.out.print("thu 6");
                break;
                case 6:
                System.out.print("thu 7");
                break;
                case 7:
                System.out.print("chu nhat");
                break;
                default:
                System.out.print("Khong phai ngay trong tuan roi !");
                break;
            }
            
        }while(ngay trong tuan); 
        sc.close();
    
    }
}