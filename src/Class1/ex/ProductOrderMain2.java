package Class1.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {

        ProductOrder[] productList = new ProductOrder[3];
        ProductOrder dubu = createProduct("두부", 2000, 2);
        ProductOrder kimchi = createProduct("김치", 5000, 1);
        ProductOrder cola = createProduct("콜라", 1500, 2);

        productList[0] = dubu;
        productList[1] = kimchi;
        productList[2] = cola;

        printList(productList);

    }
    static ProductOrder createProduct(String productName, int price, int quantity){
        ProductOrder product = new ProductOrder();
        product.productName =productName;
        product.price = price;
        product.quantity = quantity;

        return  product;
    }

    static void printList(ProductOrder productList[]){
        for(ProductOrder list : productList){
            System.out.println("상품명: "+list.productName+", 가격: "+list.price+", 수량: "+list.quantity);
        }
    }


}
