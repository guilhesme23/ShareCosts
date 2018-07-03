/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expenditure;

import exceptions.CategoriaNaoInformadaException;
import expenditure.Category;
import java.util.LinkedList;

/**
 *
 * @author guilherme
 */
public class Cost {
    private String desc;
    static LinkedList <Category> category= new LinkedList<>();
    private float value;
    

    public Cost() {
    }

    public Cost(String desc, LinkedList<Category> category, float value) {
        this.desc = desc;
        Cost.category = category;
        this.value = value;
    }

    public String getDesc() {
        return desc;
    }

    public LinkedList<Category> getCategory() {
        return category;
    }

    public float getValue() {
        return value;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setCategory(LinkedList<Category> category) {
        Cost.category = category;
    }

    public void setValue(float value) {
        this.value = value;
    }
   
    /*public void addCategory() throws CategoriaNaoInformadaException {
        Category category = new Category(desc);
        this.Category.add(category);
    }*/
    
    protected static Category findCategory(String desc){   
        Category answer = null;
        for (Category temporary : category) {
            if(temporary.getDesc().equals(desc)){
                answer = temporary;
                return answer;
            }
            if(!(temporary.getSubCategory().isEmpty())){ 
              for(Category sub: temporary.getSubCategory()){
                        if(sub.getDesc().equals(desc)){
                           answer = sub;
                           return answer;
                       }               
                }
            } 
            
        }
      
        return answer;
    }
    
}
