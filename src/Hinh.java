import java.util.Scanner;

public class Hinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner sc = new Scanner(System.in);

        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the Rectangle");
            System.out.println("2. Draw the Triangle top-left");
            System.out.println("3. Draw the Triangle bottom-left");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Draw the Rectangle");
                    System.out.println("Nhap chieu dai: ");
                    int chieuDai = sc.nextInt();
                    System.out.println("Nhap chieu rong: ");
                    int chieuRong = sc.nextInt();
                    //In hinh chu nhat
                    for (int i = 0; i < chieuDai; i++) {
                        for (int j = 0; j < chieuRong; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();//Xuong dong sau moi lan in xong
                    }
                    break;
                case 2:
                    System.out.println("Draw the Triangle top-left");
                    //Chieu cao tam giac
                    System.out.println("Nhap chieu cao tam giac: ");
                    int chieuCaoTamGiac = sc.nextInt();
                    //In hinh tam giac vuong
                    for (int i = chieuCaoTamGiac; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Draw the Triangle bottom-left");
                    //Chieu cao tam giac
                    System.out.println("Nhap chieu cao tam giac: ");
                    int chieuCao = sc.nextInt();
                    //In hinh tam giac vuong
                    for (int i = 1; i <= chieuCao; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
