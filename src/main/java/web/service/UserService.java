package web.service;

import web.models.User;

import java.util.List;

public interface UserService {

    public List<User> getAllUsers();

    public void saveUser(User user);

    public void deleteById(Long id);

    public User findById(Long id);

}
