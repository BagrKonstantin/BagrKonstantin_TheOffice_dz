package org.example;

final public class Executive extends Manager {
    Executive(int age, int salary) {
        super(age, salary * 8);
    }

    @Override
    void Complain() {
        System.out.println("Nobody loves me");
    }

    @Override
    public String toString() {
        return "Executive";
    }

    @Override
    public void MakeParty() {
        System.out.println("BIG PARTY");
    }

    @Override
    public void RiseSalary(Emploee emp) {
        if (emp instanceof Gradable) {
            System.out.println("RISE SALARY TO " + emp);
            emp.setSalary((int) (emp.getSalary() * GetGrade()));
            System.out.println("NOW IT'S " + emp.getSalary());
        }
    }
}
