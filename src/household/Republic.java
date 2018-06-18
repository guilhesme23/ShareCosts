package household;

import dweller.Person;
import expenditure.Cost;
import java.util.LinkedList;

/**
 *
 * @author guilherme
 */
public class Republic {
    private LinkedList<Person> residents;
    private LinkedList<Cost> costs;

    public Republic() {
    }

    public Republic(LinkedList<Person> residents, LinkedList<Cost> costs) {
        this.residents = residents;
        this.costs = costs;
    }

    public LinkedList<Person> getResidents() {
        return residents;
    }

    public LinkedList<Cost> getCosts() {
        return costs;
    }

    public void setResidents(LinkedList<Person> residents) {
        this.residents = residents;
    }

    public void setCosts(LinkedList<Cost> costs) {
        this.costs = costs;
    }
    
    
    
}
