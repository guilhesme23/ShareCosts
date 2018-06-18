package expenditure;

/**
 *
 * @author guilherme
 */
public class Category {
    private String desc;
    private Category sub;

    public Category() {
    }

    public Category(String desc) {
        this.desc = desc;
    }

    public Category(String desc, Category sub) {
        this.desc = desc;
        this.sub = sub;
    }

    public String getDesc() {
        return desc;
    }

    public Category getSub() {
        return sub;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setSub(Category sub) {
        this.sub = sub;
    }
    
    
}
