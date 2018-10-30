package array;

public class ArrayTest {
    public static void main(String[] args) {
        int[] array = {12, 123, 125, 5869, 15, 1253, 1, 6, 9, 186, 65, 38, 96};
        int deleteEle = 15;
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + "   ");
        }
        System.out.println("\n" + "我要删除" + deleteEle);
        int searchKey = 0;
        for (int i = 0; i < array.length; i ++){
            if (array[i] == deleteEle){
                searchKey = i;
                break;
            }
        }
        int[] newArray = new int[array.length - 1];
        for(int i = 0; i < searchKey; i++){
            newArray[i] = array[i];
        }
        for(int i = searchKey; i < newArray.length; i++){
            newArray[i] = array[i+1];
        }
        for (int i = 0; i < newArray.length; i++){
            System.out.print(newArray[i] + "   ");
        }
        System.out.println();
        Ordered orderedArray = new OrderedArray();
        orderedArray.insertByOrder(24);
        orderedArray.insertByOrder(2);
        orderedArray.insertByOrder(4);
        orderedArray.insertByOrder(6);
        orderedArray.insertByOrder(9);
        orderedArray.insertByOrder(32);
        orderedArray.insertByOrder(12);
        orderedArray.insertByOrder(85);
        orderedArray.insertByOrder(95);
        orderedArray.insertByOrder(115);
        orderedArray.insertByOrder(11);
        orderedArray.insertByOrder(38);
        orderedArray.insertByOrder(54);
        orderedArray.display();
    }
}
