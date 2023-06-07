package June_2_2023;

public class ChildClass extends ParentClass{

    private int childVar;

    public ChildClass() {
        super();
    }

    public ChildClass(int childVar) {
        this.childVar = childVar;
    }

    public ChildClass(int parentVar, int childVar) {
        super(parentVar);
        this.childVar = childVar;
    }

    public int getChildVar() {
        return childVar;
    }

    public void setChildVar(int childVar) {
        this.childVar = childVar;
    }
}
