package test;

public class Test {
    public int func(int foo, int bar) {
        int foobar = foo;
        if (foo < bar) {
            bar *= 2;
        }
        foobar = foo + bar;
        return foobar;
    }
}