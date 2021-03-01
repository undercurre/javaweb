package main.java.dao.impl;

import main.java.dao.UserDao;
import main.java.domain.Test;
import main.java.domain.User;
import main.java.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
public class UserDaoImpl implements UserDao {

    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
    @Override
    public User findByUsername(String username) {
        User user = null;
        try {
            String sql = "select * from user where username = ?";
            user = template.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), username);
        }catch (Exception e){

        }
        return user;
    }

    @Override
    public void save(User user) {
        String sql = "insert into user(username,password,score) values(?,?,?)";
        template.update(sql,user.getUsername()
                           ,user.getPassword()
                           ,user.getScore()
                );

    }

    @Override
    public Test updateUser(Test test) {
        String sql = "update user set score=? where username=? ";
        template.update(sql, test.getScore()
                , test.getUsername()
        );
        return test;
    }

    @Override
    public User findByUsernameAndPassword(String username, String password) {
        Object[] params = new Object[] { username, password };
        System.out.println(username);
        User user = null;
        System.out.println("dao running......");
        try {
            String sql = "select * from user where username = ? and password = ? ";
            user = template.queryForObject(sql , new BeanPropertyRowMapper<User>(User.class), params);
        }catch (Exception e){

        }
        System.out.println("sql running......");
        System.out.println(user);
        return user;
    }
}
