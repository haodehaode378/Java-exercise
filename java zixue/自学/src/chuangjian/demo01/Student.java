package chuangjian.demo01;

public class Student {
    private String name;
    private int age;



    //如果不写构造器，虚拟机会提供一个空参构造器
    public Student() {
        System.out.println("空参构造器");
    }


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
