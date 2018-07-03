package household;

import dweller.Person;
import exceptions.DadosPessoaisIncompletosException;
import expenditure.Category;
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
    private LinkedList<Category> category = new LinkedList<>();
    private LinkedList<Category> sub = new LinkedList<>();    

    public Republic() {
        Category padrao = new Category();
        try {
            padrao.setDesc("Nenhum");
        } catch (IOException ex) {
            Logger.getLogger(Republic.class.getName()).log(Level.SEVERE, null, ex);
        }
        padrao.setSub(null);
        
        this.sub.add(padrao);
        
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
        return names.toArray(new String[0]);
    }

    public String[] getCategoriesSubs() {
        LinkedList<String> names = new LinkedList<>();
        for(Category s: sub) {
            names.add(s.getDesc());
        }
        return names.toArray(new String[0]);
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
    
    public void addCategory(String desc, int subIndex) throws IOException {
        Category category = new Category();
        category.setDesc(desc);
        Category sub = this.sub.get(subIndex);
        category.setSub(sub);
        this.category.add(category);
        
    }
    
    public void addSubCategory(String desc) throws IOException {
        Category sub = new Category();
        sub.setDesc(desc);
        sub.setSub(null);
        this.sub.add(sub);
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
    
    public void showCategories() {
        if (!category.isEmpty()) {
            JOptionPane.showMessageDialog(null, category);
            
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma categoria cadastrada!");
        }
    }
    
    public void showSubCategories() {
        LinkedList<Category> temp = (LinkedList<Category>) sub.clone();
        temp.removeFirst();
        if (!temp.isEmpty()) {
            JOptionPane.showMessageDialog(null, temp);
            
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma sub categoria cadastrada!");
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
