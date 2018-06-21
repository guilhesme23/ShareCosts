package household;

import dweller.Person;
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
    
    public void addPerson(String name, String email, String income) throws IllegalArgumentException {
        Person person;
        String emailRegex = "[\\w|\\d|_]+\\@\\w+\\.\\w+[\\.|\\w]*";
        String nameRegex = "\\D+";
        String incomeRegex = "\\d+\\.?\\d{0,}";
        
        if (name.matches(nameRegex) && email.matches(emailRegex) && income.matches(incomeRegex)) {
            float value = Float.parseFloat(income);
            person = new Person(name, email, value);
            this.residents.add(person);
        } else {
            throw new IllegalArgumentException();
        }
        
        
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
    
    public void recordResidents() {
        File file = new File("alunos.txt");
        file.delete();
        try {
            file.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(Republic.class.getName()).log(Level.SEVERE, null, ex);
        }
        ObjectOutputStream output;
        try {
            output = new ObjectOutputStream(new FileOutputStream(file));
            output.writeObject(residents);
            output.close();
        } catch (IOException ex) {
            Logger.getLogger(Republic.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public void loadResidents() {
        File file = new File("alunos.txt");
        
        ObjectInputStream input;
        
        try {
            input = new ObjectInputStream(new FileInputStream(file));
            residents = (LinkedList<Person>) input.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Republic.class.getName()).log(Level.SEVERE, null, ex);
        }
        
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
}
