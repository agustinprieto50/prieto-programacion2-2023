package Entities;
import java.util.Objects;
public class SetEmployee extends Employee{
    public SetEmployee(String name, String surname, Integer legajo, Integer yearsWorked) {
        super(name, surname, legajo, yearsWorked);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SetEmployee)) return false;
        SetEmployee employeeSet = (SetEmployee) o;
        return Objects.equals(getLegajo(), employeeSet.getLegajo()) &&
                Objects.equals(getYearsWorked(), employeeSet.getYearsWorked()) &&
                Objects.equals(getName(), employeeSet.getName()) &&
                Objects.equals(getSurname(), employeeSet.getSurname());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getLegajo(), getYearsWorked());
    }
}

