package household;

import dweller.Person;
import exceptions.DadosPessoaisIncompletosException;
import expenditure.Cost;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author guilherme
 */
public class Republic implements Serializable {
    private LinkedList<Person> residents = new LinkedList<>();
    private LinkedList<Cost> costs = new LinkedList<>();

    public Republic() {
    }

    public Republic(LinkedList<Person> residents, LinkedList<Cost> costs){
        this.residents = residents;
        this.costs = costs;
    }

    public LinkedList<Person> getResidents() {
        return residents;
    }
    
    public String[] getResidentsNames() {
        LinkedList<String> names = new LinkedList<>();
        for(Person p: residents) {
            names.add(p.getName());
        }
        return (String[]) names.toArray();
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
    
    public void addPerson(String name, String email, String income) throws DadosPessoaisIncompletosException {
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
    
    public Person searchPerson(String name) {
        for (Person next : residents) {
            if (next.getName().equals(name)) {
                return next;
            }
        }
        
        return null;
    }    
    
    @Override
    public String toString() {
        
        String result = "Alunos:\n";
        String separator = "#######################################\n";
        
        for (Person p: residents) {
            result += separator;
            result += p.toString();
        }
        
        return result;
    }

    public void addCosts(String desc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
