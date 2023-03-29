//ATIKAH 13020210244

interface A {
    public void aaa();
}

interface B extends A {
    public void aaa();
}

class Central0244 implements A, B {
    public void aaa() {
        System.out.println("aaa");
    }

    public static void main(String arg[]) {
        System.out.println("main");
        Central0244 obj = new Central0244();
        obj.aaa();
    }
}

