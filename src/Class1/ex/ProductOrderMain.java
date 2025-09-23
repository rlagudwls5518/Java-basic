package Class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {

        ProductOrder[] productList = new ProductOrder[3];
        ProductOrder dubu = new ProductOrder();
        ProductOrder kimchi = new ProductOrder();
        ProductOrder cola = new ProductOrder();

        initProduct(dubu,"두부", 2000, 2);
        initProduct(kimchi,"김치", 5000, 1);
        initProduct(cola,"콜라", 1500, 2);

        productList[0] = dubu;
        productList[1] = kimchi;
        productList[2] = cola;

        printList(productList);

    }

    static void printList(ProductOrder productList[]){
        for(ProductOrder list : productList){
            System.out.println("상품명: "+list.productName+", 가격: "+list.price+", 수량: "+list.quantity);
        }
    }

    static void initProduct(ProductOrder productOrder, String productName, int price, int quantity){
        productOrder.productName =productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
    }
}
