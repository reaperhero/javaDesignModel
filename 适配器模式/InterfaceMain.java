package funcfactory.package05;

public class InterfaceMain {
    public static void main(String[] args) {
        AbsAdapter absAdapter = new AbsAdapter() {
            @Override
            public void m1() {
                System.out.println("使用了m1的方法");
            }
        };
        absAdapter.m1();
    }
}
