package LLD;

public class Waitress {
    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;
    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }
    public void printMenu(){
        System.out.println("MENU\n----\nBREAKFAST");
        pancakeHouseMenu.createIterator().forEachRemaining(menuItem -> System.out.println(menuItem.getName()+": "+menuItem.getPrice()));
        System.out.println("\nLUNCH");
        dinerMenu.createIterator().forEachRemaining(menuItem -> System.out.println(menuItem.getName()+": "+menuItem.getPrice()));
    }
}
