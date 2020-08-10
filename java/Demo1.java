class Student{}

class Worker{}

class Tool<E>{
    // 祖先类
    private E obj;
    public void setObj(E obj){
        this.obj=obj;
    }

    public Object getObj(){
        return obj;
    }
}


public class Demo1 {

    public static void main(String[] args) {
        Tool<Student> tool = new Tool();

        // 设置 Student 类
        tool.setObj(new Student());

        // 用 Worker 类去接受，编译正常，但是运行时就会爆出类型转换异常
//        Student obj = tool.getObj();
    }
}
