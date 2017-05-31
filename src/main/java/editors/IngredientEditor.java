package editors;

import com.cakes.entity.Ingredient;

import java.beans.PropertyEditorSupport;

/**
 * Created by Kanibal on 26.05.2017.
 */
public class IngredientEditor extends PropertyEditorSupport{
    @Override
    public void setAsText(String idIngredient) throws IllegalArgumentException {

        Ingredient ingredient = new Ingredient();
        ingredient.setId(Integer.parseInt(idIngredient));

        setValue(ingredient);
    }
}
