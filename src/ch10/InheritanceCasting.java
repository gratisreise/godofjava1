package ch10;

public class InheritanceCasting {
    public static void main(String[] args) {
        InheritanceCasting inheritance = new InheritanceCasting();
        //inheritance.objectCast();
        //inheritance.objectCase2();
        inheritance.objectCastArray();

    }

    private void objectCast() {
        ParentCasting parent = new ParentCasting();
        ChildCasting child = new ChildCasting();


        ParentCasting prent2 = child;
        ChildCasting child2 = (ChildCasting) parent;
    }
    public void objectCase2(){
        ChildCasting child = new ChildCasting();
        ParentCasting parent2 = child;
        ChildCasting child2 = (ChildCasting) parent2;
    }
    public void objectCastArray(){
        ParentCasting[] parentArray = new ParentCasting[3];
        parentArray[0] = new ChildCasting();
        parentArray[1] = new ParentCasting();
        parentArray[2] = new ChildCasting();
    }

    private void objectTypeCheck(ParentCasting[] parentArray){
        for(ParentCasting tempParent: parentArray){
            if(tempParent instanceof ChildCasting){
                System.out.println("childCasting");
                ChildCasting tempChild = (ChildCasting)tempParent;
                tempChild.printAge();
            } else if(tempParent instanceof ParentCasting){
                System.out.println("ParentCasting");
            }
        }
    }
}
