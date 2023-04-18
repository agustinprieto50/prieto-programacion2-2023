package Entities;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class GenericList<O extends Comparable<O>> {
    private List<O> list;

    public GenericList(){
        list = new ArrayList<>();
    }

    public void add(O element){
        this.list.add(element);
    }

    public List<O> objectList(){
        return this.list;
    }

    public Integer listLength(){
        return this.list.size();
    }

    public void addToTheBeginning(O element){
        this.list.add(0, element);
    }

    public void sortList(){
        Collections.sort(this.list, new Comparator<O>() {
            @Override
            public int compare(O o1, O o2) {
                Employee e1 = (Employee) o1;
                Employee e2 = (Employee) o2;
                return e1.getYearsWorked().compareTo(e2.getYearsWorked());
            }
        });
    }

    public void shuffleList(){
        Collections.shuffle(this.list);
    }

    public void addAtSpecificIndex(O element, Integer index){
        try {
            this.list.add(index, element);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Array index out of bounds: " + e.getMessage());
        }
    }

    public O objectAtIndex(Integer index){
        try{
            return this.list.get(index);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Index out of bounds: " + e.getMessage());
        }
        return null;
    }

    public O objectAtIndex0(){
        try{
            return this.list.get(0);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Empty array. " + e.getMessage());
        }
        return null;
    }

    public O objectAtLastIndex(){
        try{
            return this.list.get((list.size())-1);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Empty array. " + e.getMessage());
        }
        return null;
    }

    public void removeItem(Integer index){
        try{
            this.list.remove(this.list.get(index));
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("The element does not exist. " + e.getMessage());
        }
    }

}
