package main.java.dao;

import main.java.domain.Test;
import main.java.domain.User;

public interface UserDao {
    public User findByUsername(String username);
    public void save (User user);
    public Test updateUser (Test test);

    public User findByUsernameAndPassword(String username, String password);
}
