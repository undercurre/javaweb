package main.java.domain;

import java.io.Serializable;

/**
 * 用户实体类
 */
public class User implements Serializable {
    private int score;//用户score
    private String username;//用户名，账号
    private String password;//密码

    /**
     * 无参构造方法
     */
    public User() {
    }

    /**
     * 有参构方法
     * @param score
     * @param username
     * @param password
     */
    public User(int score, String username, String password) {
        this.score = score;
        this.username = username;
        this.password = password;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
