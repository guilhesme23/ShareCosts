package expenditure;

import java.util.LinkedList;

/**
 *
 * @author guilherme
 */

public class Category {
    private String desc;
    private LinkedList<Category> sub = new LinkedList<>();

   
    public Category() {
    }

    public Category(String desc) {
        this.desc = desc;
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