package cn.edu.zjut.po;

public class IDcard implements java.io.Serializable{
    private int id;
    private String code;
    public IDcard(){

    }
    public IDcard(int id,String code){
        this.code=code;
        this.id=id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
