import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ProductManagement pm = new ProductManagement();

        while (true) {

            System.out.println("\n========= PRODUCT MANAGEMENT SYSTEM =========");
            System.out.println("1. Thêm sản phẩm mới");
            System.out.println("2. Hiển thị danh sách sản phẩm");
            System.out.println("3. Cập nhật số lượng theo ID");
            System.out.println("4. Xóa sản phẩm hết hàng");
            System.out.println("5. Thoát");
            System.out.println("=============================================");
            System.out.print("Chọn: ");

            int choice = Integer.parseInt(sc.nextLine());

            try {

                switch (choice) {

                    case 1:
                        System.out.print("ID: ");
                        int id = Integer.parseInt(sc.nextLine());

                        System.out.print("Name: ");
                        String name = sc.nextLine();

                        System.out.print("Price: ");
                        double price = Double.parseDouble(sc.nextLine());

                        System.out.print("Quantity: ");
                        int qty = Integer.parseInt(sc.nextLine());

                        System.out.print("Category: ");
                        String cat = sc.nextLine();

                        pm.addProduct(new Product(id, name, price, qty, cat));
                        System.out.println("Added!");
                        break;

                    case 2:
                        pm.display();
                        break;

                    case 3:
                        System.out.print("ID update: ");
                        int uid = Integer.parseInt(sc.nextLine());

                        System.out.print("New quantity: ");
                        int nqty = Integer.parseInt(sc.nextLine());

                        pm.updateQuantity(uid, nqty);
                        System.out.println("Updated!");
                        break;

                    case 4:
                        pm.deleteOutOfStock();
                        System.out.println("Deleted out of stock products!");
                        break;

                    case 5:
                        System.out.println("Bye!");
                        return;

                    default:
                        System.out.println("Invalid choice!");
                }

            } catch (InvalidProductException e) {
                System.out.println("ERROR: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("SYSTEM ERROR!");
            }
        }
    }
}
