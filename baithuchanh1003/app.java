import java.util.Scanner;
 

public class tang gian mot chieu {
    public static void main(String[] args) {
        System.out.print("Nhap so phan tu cua mang ");
        int n = sc.nextInt();
        int [] array = new int [n];
        System.out.print("Nhap so phan tu cua mang: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            array[i] = sc.nextInt();
        }
        sortASC(array);
        System.out.println("Sap xep theo thu tu tang dan: ");
        show(array);

    }
         public static void sortASC(int [] array) {
        int temg = array[0];
        for (int i = 0 ; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temg = array[j];
                    array[j] = array[i];
                    array[i] = temg;
                }
            }
        }
    }
     public static void show(int [] array) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
