package household;

import dweller.Person;
import expenditure.Cost;
import java.util.Iterator;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author guilherme
 */
public class Republic {
    private LinkedList<Person> residents = new LinkedList<>();
    private LinkedList<Cost> costs = new LinkedList<>();

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
    
    public void addPerson(String name, String email, float income) {
        Person person = new Person(name,email,income);
        
        this.residents.add(person);
    }
    
    public void showResidents() {
        if (!residents.isEmpty()) {
            Iterator iter = this.residents.iterator();
        
            while(iter.hasNext()) {
                System.out.println(iter.next().toString());
            }
            
            JOptionPane.showMessageDialog(null, residents);
            
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum inquilino cadastrado!");
        }
    }
    
}
