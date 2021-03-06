package mindustry.ui;

import arc.graphics.g2d.TextureRegion;
import arc.scene.ui.Image;
import arc.scene.ui.layout.Stack;
import arc.scene.ui.layout.Table;
import mindustry.type.ItemStack;

public class ItemImage extends Stack{

    public ItemImage(TextureRegion region, int amount){
        Table t = new Table().left().bottom();
        t.add(amount + "").name("item-label");

        add(new Image(region));
        add(t);
    }

    public ItemImage(TextureRegion region){
        Table t = new Table().left().bottom();

        add(new Image(region));
        add(t);
    }

    public ItemImage(ItemStack stack){
        add(new Image(stack.item.icon(Cicon.medium)));

        if(stack.amount != 0){
            Table t = new Table().left().bottom();
            t.add(stack.amount + "").name("item-label").style(Styles.outlineLabel);
            add(t);
        }
    }
}
