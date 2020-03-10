public class main {
    public interface A {
        void a();
        void b();
        void c();
        void d();
        void e();
    }
    public abstract class B implements A { //1
        public void a() {
            System.out.print("a");
        }
        public void d() {
            System.out.print("d");
        }
    }
    public abstract static class C extends B {
        public void b() {
            System.out.print("b");
        }
        public void c() {
            System.out.print("c");
        }
        public void d() {
            System.out.print("D");
        }
    }
    public class Program {
        public static void main(String[] args) {
            A c = new C() { //2
                public void b() {
                    System.out.print("B");
                }
                public void e() {
                    System.out.print("e");
                }
            };
            c.a();
            c.b();
            c.c();
            c.d();
            c.e();
        }
    }