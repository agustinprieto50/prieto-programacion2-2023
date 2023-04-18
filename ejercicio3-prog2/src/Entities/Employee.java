package Entities;

public class Employee implements Comparable<Employee> {
    private String name;
    private String surname;
    private Integer legajo;
    private Integer yearsWorked;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getLegajo() {
        return legajo;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }

    public Integer getYearsWorked() {
        return yearsWorked;
    }

    public void getYearsWorked(Integer getYearsWorked) {
        this.yearsWorked = getYearsWorked;
    }



    public Employee(String name, String surname, Integer legajo, Integer yearsWorked){
        this.name = name;
        this.surname = surname;
        this.legajo = legajo;
        this.yearsWorked = yearsWorked;
    }

    @Override
    public int compareTo(Employee o) {
        return 0;
    }
}
