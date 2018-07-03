package expenditure;

import java.io.Serializable;
import java.util.LinkedList;
import exceptions.CategoriaNaoInformadaException;

/**
 *
 * @author guilherme
 */

public class Category implements Serializable{
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
    public Category(String desc) throws CategoriaNaoInformadaException{
        String descRegex = "\\D";
        //String subRegex = "\\D+";
        
        if(desc.matches(descRegex)/* && sub.matches(subRegex)*/){
           this.desc = desc;
           //this.sub = sub;
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
    
   /* public void addSub(Category categ){
        sub.add(categ);
    }
    */
    @Override
    public String toString(){
        String result = "Desc: " +this.desc
                        + "\n"
                       /* + "Subcategory: " + this.sub +"\n"*/;
        
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