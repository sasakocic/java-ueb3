//package ueb3;

public class MyIntOrderedList {

    private MyIntListElement head = null;

    public MyIntOrderedList() {
    }

    public void insert(int key) {
        MyIntListElement current = head;
        MyIntListElement newE = new MyIntListElement(key, null);
        if (head == null) {
            head = newE;
        } else {
            current = findAppropriate(head, key);
            newE.setNext(current.getNext());
            current.setNext(newE);
        }
    }

    public MyIntListElement findAppropriate(MyIntListElement h, int k) {
        while (h.getNext() != null && h.getNext().compare(new MyIntListElement(k, null)) < 0) {
            h = h.getNext();
        }
        return h;
    }

    public MyIntListElement findLast(MyIntListElement h) {
        while (h.getNext() != null) {
            h = h.getNext();
        }
        return h;
    }

//  head -> null
//  1 -> 2 -> 3 -> 4 -> null
//                 c.setNext(newE);
//  1 -> 2 -> 3 -> 4 -> 5 -> null
// c = findLast(head);

//
//		while (current != null) {
//
//			if (newE.compare(current) > 0) {
//				lastElement = current;
//				lastElement.setNext(current);
//				current = current.getNext();
//			} else {// In on itself implies compare(...) <= 0 which implies newE <= listE
//				newE.setNext(current);
//				break;
//			}
//		}
//		MyIntListElement newE = new MyIntListElement(key, current);
//
//			MyIntListElement newE = new MyIntListElement(key, current);
//			head = newE;
//		}
//
//    }

    public void removeKeyAtIndex(int idx) {
        MyIntListElement currentElement = head;
        MyIntListElement lastElement = null;
        for (int i = idx; i > 0; i--) {
            lastElement = currentElement;
            currentElement = currentElement.next;
        }
        lastElement.setNext(currentElement.getNext());
        // Erasing of currentElement necessary?
    }

    public int count() {
        MyIntListElement current = head;
        int n = 0;
        while (current != null) {
            n++;
            current = current.getNext();
        }
        return n;
    }

    public void print() {
        System.out.println(toString());
    }

    public String toString() {
        MyIntListElement current = head;
        String output = "{";
        while (current != null) {
            output += current.toString();
            if (current.getNext() != null)
                output += ", ";
            current = current.getNext();
        }
        output += "}";
        return output;
    }
}
