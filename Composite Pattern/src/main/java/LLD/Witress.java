package LLD;

public class Witress {
    MenuComponent allMenus;
    public Witress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }
    public void printMenu() {
        allMenus.print();
    }
}
