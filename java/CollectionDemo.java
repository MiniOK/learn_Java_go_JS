import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        Collection<String> templist = new ArrayList<>();

        list.add("Tom");
        list.add("Lucy");
        list.add("Lily");

        templist.add("Tom1");
        templist.add("Tom2");
        templist.add("Tom3");
        list.addAll(templist);
        System.out.println(list);

        for (String l:list){
            System.out.println(l);
        }

//        list.remove("Tom");


//        System.out.println(list);
//        list.removeAll(templist);
//        System.out.println(list);
//        list.clear();
//        System.out.println(list);

    }
}
