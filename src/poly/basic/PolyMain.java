package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);
        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }
    private static void call(Parent parent) {
        parent.parentMethod();
        if (parent instanceof Child) { // 부모가 자식을 참조할 수있는지? 있으면 다운캐스팅 ㄱ
            System.out.println("Child 인스턴스 맞음");
            Child child = (Child) parent;
            child.childMethod();
        }else{
            System.out.println("1");
        }
    }
}
