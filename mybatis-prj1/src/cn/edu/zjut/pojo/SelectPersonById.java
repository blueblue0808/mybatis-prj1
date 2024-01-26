package cn.edu.zjut.pojo;

import org.apache.ibatis.type.Alias;

public class SelectPersonById {
    private Integer id;
    private String name;
    private Integer age;
    private String code;

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ",name=" + name + "," + "age=" + age + ",code=" + code + "]";
    }
}
