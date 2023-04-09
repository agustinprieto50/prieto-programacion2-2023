package Entities;

public class Employee {
    private String name;
    private String surname;
    private Integer legajo;
    private Integer yearsWorked;
    public Employee(String name, String surname, Integer legajo, Integer yearsWorked){
        this.name = name;
        this.surname = surname;
        this.legajo = legajo;
        this.yearsWorked = yearsWorked;
    }

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

    public void setYearsWorked(Integer yearsWorked) {
        this.yearsWorked = yearsWorked;
    }

    public String toString(){
        return String.format("Name: %s. Surname: %s. Legajo: %s. Years Worked: %s", this.name,
                this.surname, this.legajo, this.yearsWorked);
    }
}
