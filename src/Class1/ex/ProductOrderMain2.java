package Class1.ex;

import java.util.Scanner;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        System.out.print("입력할 주문의 갯수를 입력하세요 ");
        int index = inputData.nextInt();

        ProductOrder[] productList = new ProductOrder[index];
        for(int i=1; i<=index; i++){
            System.out.println(i + "번째 주문정보를 입력하세요");
            System.out.print("상품명 : ");
            String productName = inputData.nextLine();
            System.out.print("가격 : ");
            int price = inputData.nextInt();
            System.out.print("수량 : ");
            int quantity = inputData.nextInt();
            inputData.nextLine();

            productList[i] = createProduct(productName, price, quantity);
        }

        printList(productList);
        int totalPrice = total(productList);

        System.out.println("총 금액은 "+totalPrice + "원입니다.");

    }
    static ProductOrder createProduct(String productName, int price, int quantity){
        ProductOrder product = new ProductOrder();
        product.productName = productName;
        product.price = price;
        product.quantity = quantity;

        return  product;
    }

    static void printList(ProductOrder productList[]){
        for(ProductOrder list : productList){
            System.out.println("상품명: "+list.productName+", 가격: "+list.price+", 수량: "+list.quantity);
        }
    }

    static int total(ProductOrder productList[]){
        int total=0;

        for(int i=0; i<productList.length; i++){
            total+=(productList[i].price * productList[i].quantity);
        }
        return total;
    }


}
