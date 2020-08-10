
class Per{
    int age;
}


interface MyInterface<T>{
    int compareTo(T o1,T o2);
}

// 定义个子接口
interface SubMyTnterface extends MyInterface<Integer>{

}

class MyDemo implements MyInterface<Per>{

    @Override
    public int compareTo(Per o1, Per o2) {
        return o1.age - o2.age;
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        /*MyDemo myDemo = new MyDemo();
        Per p1 = new Per();
        Per p2 = new Per();
        p1.age = 32;
        p2.age = 30;

        int i = myDemo.compareTo(p1, p2);
        System.out.println(i);*/


        // 使用匿名内部类
        MyInterface<Per> per = new MyInterface<Per>() {
            @Override
            public int compareTo(Per o1, Per o2) {
                return o1.age - o2.age;
            }
        };



        // lambda 方式
        MyInterface<Per> p = (o1, o2) -> o1.age - o2.age;

    }
}
