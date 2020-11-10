package ro.fastrackit.classroom;

public class Box <T extends Human> {

    T kindOfBox;

    public T getKindOfBox() {
        return kindOfBox;
    }
    public Box(T kindOfBox){this.kindOfBox = kindOfBox;}
}
