package ch10;

public class IngeritancePoly {
    public static void main(String[] args) {
        IngeritancePoly inheritance = new IngeritancePoly();
        inheritance.callPrintNames();
    }

    private void callPrintNames() {
        Parent parent1 = new Parent();
        Parent parent2 = new Child();
        Parent parent3 = new ChildOther();

        parent1.printName();
        parent2.printName();
        parent3.printName();
    }
}
