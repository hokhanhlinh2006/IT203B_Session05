import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ProductManagement manager = new ProductManagement();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("========= PRODUCT MANAGEMENT SYSTEM =========");
            System.out.println("1. Thêm sản phẩm mới");
            System.out.println("2. Hiển thị danh sách sản phẩm");
            System.out.println("3. Cập nhật số lượng theo ID");
            System.out.println("4. Xóa sản phẩm đã hết hàng");
            System.out.println("5. Thoát chương trình");
            System.out.println("=============================================");
            System.out.print("Lựa chọn của bạn: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    manager.addProduct();
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;
                case 5:
                    System.out.println("Thoát chương trình...");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (choice != 5);

        sc.close();
    }
}