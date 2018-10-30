package linked;

public class Link {
    int value;
    Link next;

    public Link(int value) {
        this.value = value;
    }

    void display() {
        System.out.print(value + " ");
    }


}
