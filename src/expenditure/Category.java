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
    private LinkedList<Category> subCategory = new LinkedList<>();
    
    public Category(String desc){
        this.desc = desc;
    }
    
    protected String getDesc() {
        return desc;
    }

    protected  LinkedList<Category> getSubCategory() {
        return subCategory;
    }

    protected void setDesc(String desc) {
        this.desc = desc;
    }
    
    protected void addSubCategory(Category category){
         subCategory.add(category);
    }
         
    protected  Category findSubCategory(String desc){
       
        Category answer = null;
        for (Category temporary : subCategory) {
            if(temporary.getDesc().equals(desc)){
                answer = temporary;
            }
        }
        return answer;
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