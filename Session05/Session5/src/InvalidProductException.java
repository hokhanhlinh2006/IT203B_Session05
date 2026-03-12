public class InvalidProductException {
    public static void checkDuplicateId(Product newProduct, Product[] products) throws Exception {
        for (Product product : products) {
            if (product != null && product.getId() == newProduct.getId()) {
                throw new Exception("Mã sản phẩm trùng lặp" + newProduct.getId());
            }
        }

    }

}