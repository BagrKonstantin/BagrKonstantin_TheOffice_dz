package org.example;

public final class Programmer extends Emploee implements Gradable {
    private int lines_written;
    Programmer(int age, int salary) {
        super(age, salary * 2);
        lines_written = 1024;
    }

    @Override
    void Complain() {
        System.out.println("My salary is too low. I don't want to press alt+enter for free.");
    }

    @Override
    public String toString() {
        return "Programmer";
    }

    int CodeWritten() {
        lines_written *= 4;
        return lines_written;
    }

//    @Override
//    public void RiseSalary() {
//        setSalary( (int)(getSalary() * grade));
//    }
}
