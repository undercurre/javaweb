package main.java.domain;

import java.io.Serializable;


public class Student implements Serializable {
    private String score;//用户score
    private String name;//用户名，账号
    private String num;//密码

    /**
     * 无参构造方法
     */
    public Student() {
    }

    public Student(String score, String name, String num) {
        this.score = score;
        this.name = name;
        this.num = num;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String password) {
        this.num = num;
    }


}
