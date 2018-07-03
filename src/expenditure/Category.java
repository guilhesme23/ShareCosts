package expenditure;

import java.io.Serializable;
import java.util.LinkedList;
import exceptions.CategoriaNaoInformadaException;
import java.io.IOException;

/**
 *
 * @author guilherme
 */

public class Category implements Serializable{
    private String desc;
    private Category sub;
    
    public Category(String desc){
        this.desc = desc;
    }

    public Category() {
    }
    
    public String getDesc() {
        return desc;
    }

    public Category getSub() {
        return sub;
    }

    public void setDesc(String desc) throws IOException {
        if (!desc.isEmpty()) {
            this.desc = desc;
        } else {
            throw new IOException();
        }
        
    }
    
    public void setSub(Category sub){
        this.sub = sub;
    }
    
    public String toString() {
        String result;
        if (sub != null) {
            result = "Descrição: " + desc + "\n";
            result += "Sub Categoria: " + sub.getDesc() + "\n";
        } else {
            result = "Descrição: " + desc + "\n";
        }
        return result;
    }
    
}

































/*public class Category implements Serializable{
    String desc;
    private LinkedList<Category> category = new LinkedList<>();

   
    public Category() {
    }

    public Category(String desc, LinkedList<Category> category) {
        this.desc = desc;
        this.category = category;
    }

    /**
     *
     * @param desc
     * @param sub
     * @throws exceptions.CategoriaNaoInformadaException
     */
    /*public Category(String desc) throws CategoriaNaoInformadaException{
        String descRegex = "\\D";
        
        
        if(desc.matches(descRegex)){
           this.desc = desc;
           
        } else{
            throw new CategoriaNaoInformadaException();
        }
    }
    public String getDesc() {
            return desc;
    }

   public LinkedList<Category> getCategory(){
        return category;
    }
   
    public void setDesc(String desc) {
        this.desc = desc;
    }
    
   
    @Override
    public String toString(){
        String result = "Desc: " +this.desc
                        + "\n";
   
        
        return result;
    }
    /*
    protected  Categoria procurarSubCat(String desc){
       
        Categoria resposta = null;
        for (Categoria tmp : subCats) {
            if(tmp.getDesc().equals(desc)){
                resposta = tmp;
            }
        }
        return resposta;
    }

    */
    
//}