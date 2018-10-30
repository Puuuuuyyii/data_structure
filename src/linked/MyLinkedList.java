package linked;

public class MyLinkedList {
    private Link first;

    public MyLinkedList() {
        first = null;
    }

    public void insertFirst(int element) {
        Link newLink = new Link(element);
        newLink.next = first;
        first = newLink;
    }

    public void deleteFirst() {
        first = first.next;
    }

    public void deleteByValue(int value) {
        Link temp = first;
        Link previous = first;
        int index = 0;
        while (temp.value != value) {
            index++;
            if (temp.next == null) {
                System.out.println("没有找到此元素");
            }
            previous = temp;
            temp = temp.next;
        }
        if (temp == first) {
            first = first.next;
        }else {
            previous.next = temp.next;

        }
    }

    public void deleteByIndex(int index) {
        Link temp = first;
        Link previous = first;
        int tempIndex = 0;
        while (tempIndex != index) {
            tempIndex ++;
            previous = temp;
            temp = temp.next;
        }
        if (temp == first) {
            first = first.next;
        }else {
            System.out.println("删除的节点是" + tempIndex);
            tempIndex = 0;
            previous.next = temp.next;

        }
    }

    void select(int value) {
        Link temp = first;
        int index = 0;
        while (temp != null){
            index ++;
            if (temp.value == value){
                System.out.println("元素的下标是" + index);
            }
            temp = temp.next;
        }
    }
    public void disPlayAll() {
        Link temp = first;
        while (temp != null){
            temp.display();
            temp = temp.next;
        }
        System.out.println();
    }
}
