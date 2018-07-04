 /* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expenditure;
import exceptions.CategoriaNaoInformadaException;
import exceptions.DescricaoNaoInformadaException;
import exceptions.ValorNaoInformadoException;
import java.io.Serializable;

/**
 *
 * @author guilherme
 */
public class Cost implements Serializable {
    private String desc;
    private Category category;
    private float value;

    public Cost() {
    }
    
    public Cost(String desc, Category category, float value) {
        this.desc = desc;
        this.category = category;
        this.value = value;
    }

    public Cost(String desc, Category category, String value) throws DescricaoNaoInformadaException, ValorNaoInformadoException, CategoriaNaoInformadaException{
        String descRegex = "\\D+";
        String valueRegex = "\\d+\\.?\\d{0,}";
        
        
        
        if(desc.matches(descRegex)){
            this.desc = desc;
        }
        else{
            throw new DescricaoNaoInformadaException();
        }
        
        if(value.matches(valueRegex)){
            float v = Float.parseFloat(value);
            this.value = v;
        }
        else{
            throw new ValorNaoInformadoException();
        }
        
        if(!category.getDesc().equals("Nenhum")){
            this.category = category;
        }
        else{
            throw new CategoriaNaoInformadaException();
        }
        
        
        
}

    public String getDesc() {
        return desc;
    }

    public Category getCategory() {
        return category;
    }

    public float getValue() {
        return value;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setValue(float value) {
        this.value = value;
    }
    
    @Override
    public String toString() {
        
        String result = "Descrição: " + this.desc 
                        + "\n" 
                        + this.category 
                        + "Value: " + this.value
                        + "\n";
    
        return result;
    }
}