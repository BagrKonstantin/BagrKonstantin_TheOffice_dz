package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Emploee> list = new ArrayList<>();

        list.add(new Programmer(20, 20000));
        list.add(new Secretary(18, 20000));
        list.add(new Manager(30, 20000));
        list.add(new Executive(40, 20000));

        for (Emploee emp : list) {
            System.out.println(emp + ":");
            emp.Complain();
            emp.HappyBDay();
            System.out.println("Salary is " + emp.getSalary());
            if (emp instanceof Programmer p) {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Lines written: " + p.CodeWritten());
                }
            } else if (emp instanceof Secretary s) {
                System.out.print("Sheeps: ");
                s.Count(0, 1, 15);
                System.out.println();
            } else if (emp instanceof Executive e) {
                for (Emploee em : list) {
                    e.RiseSalary(em);
                }
            } else if (emp instanceof Manager m) {
                m.MakeParty();
                m.HireEmploy(new Secretary(12, 1000) {
                });
            }
            if (emp instanceof Gradable gr) {
                gr.RiseSalary(emp);
            }
            System.out.println('\n');
        }
    }
}