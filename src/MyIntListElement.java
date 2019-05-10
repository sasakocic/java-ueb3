//package ueb3;


/**
 *
 * @author werner, braun (IFIS)
 */
public class MyIntListElement {

    private int key;
    protected MyIntListElement next;

    public MyIntListElement(int key, MyIntListElement next){
        this.key = key;
        this.next = next;
    }

    public MyIntListElement getNext(){
        return this.next;
    }

    public void setNext(MyIntListElement next){
        this.next = next;
    }

    /**
     *
     * @param otherElement
     * @return 0 if both Element equal, -1 if this < otherElement, else 1
     */
    public int compare(MyIntListElement otherElement){
        if (this.key == otherElement.key) {
            return 0;
        } else if (this.key < otherElement.key) {
            return -1;
        } else {
            return 1;
        }
    }

    public String toString(){
        return "" + this.key;
    }

}

