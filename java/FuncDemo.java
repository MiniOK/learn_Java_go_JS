class MyDemo1<T>{
    // 这个方法的 泛型 T 和 类的泛型 T 是同一个
    public void test(T t){
        System.out.println(t);
    }

    // 这里方法参数中的 T 和类上的 T 不是同一个，这个是随意的，没有任何关系
    // 明确点就是方法自己的泛型，参数类型任意
    public <T> void func(T t){
        System.out.println(t);
    }

    // 静态方法只能自己使用泛型
    public static <E> void funcStatic(E t){
        System.out.println(t);
    }

}




public class FuncDemo {
    public static void main(String[] args) {
        MyDemo1<String> d = new MyDemo1();
        d.test("123");

        d.func(66);



    }
}
