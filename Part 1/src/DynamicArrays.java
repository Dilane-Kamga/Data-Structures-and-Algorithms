import java.util.ArrayList;

public class DynamicArrays {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.remove(0);
        System.out.println(list.indexOf(40));
        System.out.println(list);
    }
}
