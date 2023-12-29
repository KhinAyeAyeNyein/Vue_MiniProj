package medium.vue.api.web.form;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import medium.vue.api.persistence.entity.Category;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CategoryForm implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private Integer categoryId;
    
    private String categoryName;
    
    public CategoryForm(Category category) {
        this.categoryId = category.getId();
        this.categoryName = category.getName();
    }
}