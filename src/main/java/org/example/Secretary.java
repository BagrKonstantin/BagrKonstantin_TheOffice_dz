package org.example;

public class Secretary extends Emploee{
    Secretary(int age, int salary) {
        super(age, salary / 2);
    }

    @Override
    void Complain() {
        System.out.println("I love Jim Halpert");
    }

    @Override
    public String toString() {
        return "Secretary";
    }

    public void Count(int a, int b, int n) {
        if (n == 0) return;
        System.out.print(a);
        System.out.print(' ');
        Count(b, a + b, n - 1);
    }
}
