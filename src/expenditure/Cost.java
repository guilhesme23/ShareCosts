/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expenditure;

/**
 *
 * @author guilherme
 */
public class Cost {
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
    
    
}
