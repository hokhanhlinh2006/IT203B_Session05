import java.util.ArrayList;
import java.util.Scanner;

public class ProductManagement {

    ArrayList<Product> products = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ProductManagement pr = new ProductManagement();
        int choice = 0;

        do {
            System.out.println("========= PRODUCT MANAGEMENT SYSTEM =========");
            System.out.println("1. Thêm sản phẩm mới");
            System.out.println("2. Hiển thị danh sách sản phẩm");
            System.out.println("3. Cập nhật số lượng theo ID");
            System.out.println("4. Xóa sản phẩm đã hết hàng");
            System.out.println("5. Thoát chương trình");

            choice = Integer.parseInt(pr.sc.nextLine());

            switch (choice) {

                case 1:
                    pr.addProduct();
                    break;

                case 5:
                    System.out.println("Thoát chương trình...");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }

        } while (choice != 5);
    }

    public void addProduct() {

        System.out.println("Nhập ID:");
        int id = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập tên:");
        String name = sc.nextLine();

        System.out.println("Nhập giá:");
        double price = Double.parseDouble(sc.nextLine());

        System.out.println("Nhập số lượng:");
        int quantity = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập category:");
        String category = sc.nextLine();

        Product newProduct = new Product(id, name, price, quantity, category);

        try {

            InvalidProductException.checkDuplicateId(newProduct, products);

            products.add(newProduct);

            System.out.println("Thêm sản phẩm thành công!");

        } catch (InvalidProductException e) {

            System.out.println(e.getMessage());
        }
    }
}