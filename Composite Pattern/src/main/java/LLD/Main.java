package LLD;

public class Main {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu=new Menu("PANCAKE HOUSE MENU","Breakfast");
        MenuComponent dinerMenu=new Menu("DINER MENU","Lunch");
        MenuComponent cafeMenu=new Menu("CAFE MENU","Dinner");
        MenuComponent dessertMenu=new Menu("DESSERT MENU","Dessert of course!");
        MenuComponent allMenus=new Menu("ALL MENUS", "All menus combined");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);
        dinerMenu.add(new MenuItem("Pasta", "Spaghetti with Marinara Sauce, and a slice of sourdough bread", 3.89, true));
        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem("Apple Pie", "Apple pie with a flakey crust, topped with vanilla icecream", 1.59, true));
        Witress witress=new Witress(allMenus);
        witress.printMenu();
    }
}