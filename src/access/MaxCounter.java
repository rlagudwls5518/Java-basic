package access;

public class MaxCounter {
    private int count = 0;
    private int max;

    MaxCounter(int max){
        this.max = max;
    }


    public void increment(){

        if(max <= count){
            System.out.println("최대값을 초과할 수 없습니다");
        }else{
            count += 1;
        }
    }

    public int getCount(){
        return count;
    }
}
