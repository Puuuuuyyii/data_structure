package array;

public class OrderedArrayTest {
    public static void main(String[] args) throws InterruptedException {
        Ordered orderedArray = new OrderedArray();
        long iniTime = System.nanoTime();
        orderedArray.insert(24);
        orderedArray.insert(26);
        orderedArray.insert(568);
        orderedArray.insert(6);
        orderedArray.insert(9);
        orderedArray.insert(32);
        orderedArray.insert(12);
        orderedArray.insert(85);
        orderedArray.insert(65);
        orderedArray.insert(14);
        orderedArray.insert(90);
        orderedArray.insert(47);
        orderedArray.insert(36);
        orderedArray.insert(24);
        orderedArray.insert(17);
        orderedArray.insert(99);
        orderedArray.insert(655);
        orderedArray.insert(5852);
        orderedArray.insert(127);
        orderedArray.display();
        orderedArray.quickSort(0, 18);
        long endTime = System.nanoTime();
        orderedArray.display();




    }
}
