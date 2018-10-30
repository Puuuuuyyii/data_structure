package Annotation;

import java.lang.annotation.Annotation;

public class MyAnnotionTest {
    @MyAnnotation(age = 12)
    private int age;
    @MyAnnotation(value = {"DJUIGS"})
    private String name;

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    @MyAnnotation(age = 12)
    public void setAge(int age) {
        this.age = age;
    }
    @MyAnnotation(value = {"DJUIGS"})
    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        MyAnnotionTest anno = new MyAnnotionTest();
        System.out.println(anno.getAge());
        System.out.println(anno.getName());
        for (Annotation annotation : anno.getClass().getAnnotations()){
            System.out.println(annotation);
        }
    }
}
