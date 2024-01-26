package cn.edu.zjut.po;

public class Person implements java.io.Serializable{
    private int id;
    private String name;
    private int age;
    private IDcard card;
    public Person(){

    }
    public Person(int id,String name,int age,IDcard card){
        this.id=id;
        this.name=name;
        this.age=age;
        this.card=card;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public IDcard getCard() {
        return card;
    }

    public void setCard(IDcard card) {
        this.card = card;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ",name=" + name + "," + "age=" + age + ",code=" + card.getCode() + "]";
    }
}
