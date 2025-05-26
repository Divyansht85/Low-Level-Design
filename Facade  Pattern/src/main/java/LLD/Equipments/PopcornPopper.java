package LLD.Equipments;

public class PopcornPopper {
    public void on(){
        System.out.println("Popcorn Popper is on");
    }
    public void off(){
        System.out.println("Popcorn Popper is off");
    }
    @Override
    public String toString() {
        return "Popcorn Popper";
    }
    public void pop(){
        System.out.println("Popcorn Popper is popping popcorn!!");
    }
}
