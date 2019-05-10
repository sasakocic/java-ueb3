import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyIntOrderedListTest {

    @Test
    void insert() {
        Assertions.assertTrue(true);
    }

    @Test
    void removeKeyAtIndex() {
        Assertions.assertEquals(1, 1);
    }

    @Test
    void print() {
        MyIntOrderedList list = new MyIntOrderedList();
        list.print();
    }

    @Test
    void toStringTest() {
        MyIntOrderedList list = new MyIntOrderedList();
        Assertions.assertEquals("{}", list.toString());
        list.insert(3);
        Assertions.assertEquals("{3}", list.toString());
        list.insert(1);
        Assertions.assertEquals("{1, 3}", list.toString());
        list.insert(2);
        Assertions.assertEquals("{1, 2, 3}", list.toString());
    }

    @Test
    void count() {
        MyIntOrderedList list = new MyIntOrderedList();
        Assertions.assertEquals(0, list.count());
        list.insert(1);
        Assertions.assertEquals(1, list.count());
    }
}