package org.example;

public interface Gradable {
    static double grade = 1.1;
    public default void RiseSalary(Emploee emp) {
        System.out.println("Only executive can rise salary");
    }

    public default double GetGrade() {
        return grade;
    }
}
