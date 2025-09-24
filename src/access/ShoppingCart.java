package access;

public class ShoppingCart {

    private Item[] items = new Item[10];
    private int itemCount = 0;

    void addItem(Item item) {

        if (itemCount >= items.length) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
        items[itemCount] = item;
        itemCount++;

    }

    void displayItems() {
        int totalItem = 0;
        System.out.println("장바구니 상품 출력");

        for (int i = 0; i < itemCount; i++) {
            int sum = items[i].getItemPrice() * items[i].getItemQuantity();
            System.out.println("상품명: " + items[i].getItemName() + " 합계: " + sum);

        }

        System.out.println("전체 가격 합: " + totalPrice());
    }

    private int totalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            totalPrice += items[i].getItemPrice() * items[i].getItemQuantity();
        }
        return totalPrice;

    }
}