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
        this.list.add(index, element);
    }

    public O objectAtIndex(Integer index){
        return this.list.get(index);
    }

    public O objectAtIndex0(){
        return this.list.get(0);
    }

    public O objectAtLastIndex(){
        return this.list.get((list.size())-1);
    }

    public void removeItem(Integer index){
        this.list.remove(this.list.get(index));
    }

}
