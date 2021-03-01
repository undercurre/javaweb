package main.java.domain;

import java.io.Serializable;

public class Test implements Serializable {
    private String submit1;
    private String submit2;
    private String submit3;
    private String submit4;
    private String submit5;
    private int score;
    private String username;

    public Test() {
    }

    public Test(String submit1, String submit2, String submit3, String submit4, String submit5, int score, String username) {
        this.submit1 = submit1;
        this.submit2 = submit2;
        this.submit3 = submit3;
        this.submit4 = submit4;
        this.submit5 = submit5;
        this.score = score;
        this.username = username;
    }

    public String getSubmit1() {
        return submit1;
    }

    public String getSubmit2() {
        return submit2;
    }

    public String getSubmit3() {
        return submit3;
    }

    public void setSubmit4(String submit4) {
        this.submit4 = submit4;
    }

    public void setSubmit5(String submit5) {
        this.submit5 = submit5;
    }

    public void setSubmit1(String submit1) {
        this.submit1 = submit1;
    }

    public void setSubmit2(String submit2) {
        this.submit2 = submit2;
    }

    public void setSubmit3(String submit3) {
        this.submit3 = submit3;
    }

    public String getSubmit4() {
        return submit4;
    }

    public String getSubmit5() {
        return submit5;
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
}

