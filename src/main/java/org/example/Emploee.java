package org.example;

public abstract class Emploee {
    abstract void Complain ();
    private int age;
    private int salary;
    Emploee(int age, int salary){
        this.age = age;
        this.salary = salary;
    }

    public void HappyBDay(){
        age++;
        System.out.println("Happy bday " + this + " now you are " + age);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emploee";
    }
}
