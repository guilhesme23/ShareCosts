package expenditure;

import java.io.Serializable;
import java.util.LinkedList;
import exceptions.CategoriaNaoInformadaException;

/**
 *
 * @author guilherme
 */

public class Category implements Serializable{
    private String desc;
    private LinkedList<Category> sub = new LinkedList<>();

   
    public Category() {
    }

    public Category(String desc, LinkedList<Category> sub) {
        this.desc = desc;
        this.sub = sub;
    }

    /**
     *
     * @param desc
     * @param sub
     * @throws exceptions.CategoriaNaoInformadaException
     */
    public Category(String desc, Category sub) throws CategoriaNaoInformadaException{
        String descRegex = "[\\w|\\d|_]+\\@\\w+\\.\\w+[\\.|\\w]*";
        String subRegex = "\\D+";
        
        if(desc.matches(descRegex) && sub.matches(subRegex)){
           this.desc = desc;
           this.sub = sub;
        } else{
            throw new CategoriaNaoInformadaException();
        }
    }
    
    public String getDesc() {
            return desc;
    }

    public LinkedList<Category> getSub(){
        return sub;
    }
     
    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    public void addSub(Category categ){
        sub.add(categ);
    }
    
    public String toString(){
        String result = "Desc: " +this.desc
                        + "\n"
                        + "Subcategory: " + this.sub +"\n";
        
        return result;
    }
    /*public Category(String desc, Category sub) {
        this.desc = desc;
        this.sub = sub;
    }

    
    public Category getSub() {
        return sub;
    }

  

    public void setSub(Category sub) {
        this.sub = sub;
    }
    
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
}