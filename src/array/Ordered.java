package array;

public interface Ordered {
    void insert(int insertEle);
    void insertByOrder(int insertEle);
    boolean delete(int deleteEle);
    void removeMax();
    void update(int newInt, int oldInt);
    boolean select(int selectEle);
    boolean binarySearch(int integer);
    void bubbleSort();
    void doubleBubbleSort();
    void simpleSelectSort();
    void display();
    int size();
    int getMax();
}
