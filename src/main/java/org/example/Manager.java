package org.example;

public class Manager extends Emploee implements Gradable {
    Manager(int age, int salary) {
        super(age, salary * 4);
    }

    @Override
    void Complain() {
        System.out.println("That's what she said");
    }

    @Override
    public String toString() {
        return "Manager";
    }

    public void MakeParty() {
        System.out.println("Smol prty");
    }

    public final Emploee HireEmploy(Emploee emp) {
        return new Programmer(24, emp.getSalary());
    }

//    @Override
//    public void RiseSalary() {
//        setSalary((int) (getSalary() * grade * grade));
//    }
}
