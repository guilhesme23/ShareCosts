/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dweller;

import java.io.Serializable;

/**
 *
 * @author guilherme
 */
public class Person implements Serializable {
    private String name;
    private String email;
    private float income;
    
    public Person(){
        
    }
    
    public Person(String name, String email, float income) {
        this.name = name;
        this.email = email;
        this.income = income;
    }
    
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public float getIncome() {
        return income;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIncome(float income) {
        this.income = income;
    }
    
    @Override
    public String toString() {
        
        String result = "Name: " + this.name 
                        + "\n" 
                        + "Email: " + this.email 
                        + "\n" 
                        + "Income: " + this.income + "\n";
    
        return result;
    }
}
