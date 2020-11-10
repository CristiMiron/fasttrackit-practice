package ro.fastrackit.classroom;

public enum StudentType implements ScholarType{
    BACHELOR(0),
    MASTERS (1),
    PHD (2);

    public int indexInt;
    StudentType(int index){
        this.indexInt = index;
    }
}
