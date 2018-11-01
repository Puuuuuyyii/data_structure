package innerClass;

public class OuterClass {
    private String name;
    private int id;
    class InnerClass{
        String innerName;
        OuterClass my = new OuterClass();

        public InnerClass() {
            name = "ddddd";
            id = 1323;
        }
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
