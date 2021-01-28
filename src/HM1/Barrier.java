package HM1;

public abstract class Barrier {
    private String name;

    public Barrier(String name){
        this.name = name;
    }

    protected abstract boolean moving (Action action);

    public String getName(){
        return name;
    }
}
