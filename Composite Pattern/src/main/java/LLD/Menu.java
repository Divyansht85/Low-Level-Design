package LLD;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {
    List<MenuComponent> menuComponents=new ArrayList<MenuComponent>();
    String name;
    String description;
    public Menu(String name,String description) {
        this.name=name;
        this.description=description;
    }
    @Override
    public void print() {
        System.out.println("\n"+name);
        System.out.println("--"+description);
        System.out.println("-------------------------------------");
        for(MenuComponent menuComponent:menuComponents) {
            menuComponent.print();
        }
    }
    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }
    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }
    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public String getDescription() {
        return description;
    }
}
