package main.java.service;

import main.java.domain.Test;
import main.java.domain.User;

public interface UserService {
    boolean regist(User user);
    boolean recordScore(Test test);
    boolean login(User user);
    User search(User user);
}
