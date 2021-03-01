package main.java.service.impl;
import main.java.dao.UserDao;
import main.java.dao.impl.UserDaoImpl;
import main.java.domain.Test;
import main.java.domain.User;
import main.java.service.UserService;

import static java.lang.System.*;

public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();
    @Override
    public boolean regist(User user) {
        User u = userDao.findByUsername(user.getUsername());
        if (u != null){
            return false;

        }
        userDao.save(user);
        return true;
    }

    @Override
    public boolean recordScore(Test test) {
        User u = userDao.findByUsername(test.getUsername());
        if (u != null){
            userDao.updateUser(test);
        }else {
            return false;
        }
        return true;
    }

    @Override
    public boolean login(User user) {
        User u = userDao.findByUsernameAndPassword(user.getUsername(),user.getPassword());
        System.out.println("service running......");
        if (u == null){
            return false;
        }
        return true;
    }

    @Override
    public User search(User user) {
        User u = userDao.findByUsername(user.getUsername());
        return u;
    }
}
