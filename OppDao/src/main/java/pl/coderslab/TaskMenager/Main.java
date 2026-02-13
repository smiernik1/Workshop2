package pl.coderslab.TaskMenager;


import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

public class Main {

    public static void main(String[] args) {

        // TEST METODY CREATE
//        User user = new User();
//        user.setUserName("name");
//        user.setEmail("email@wp.pl");
//        user.setPassword("password23");
//        UserDao userDao = new UserDao();
//        userDao.create(user);

        //TEST METODY READ
        UserDao userDao2 = new UserDao();
        User user2 = userDao2.read(4);
        if (user2 != null) {
            System.out.println(user2.getId());
            System.out.println(user2.getUserName());
            System.out.println(user2.getEmail());
            System.out.println(user2.getPassword());
        } else {
            System.out.println("User not found");
        }

        //TEST METODY UPDATE
//        UserDao userDao3 = new UserDao();
//        User user3 = userDao3.read(4);
//        System.out.println(user3.getUserName());
//        System.out.println(user3.getEmail());
//        System.out.println(user3.getPassword());
//        user3.setUserName("Dawid Szymański");
//        user3.setEmail("dawid.szymanski@wp.pl");
//        user3.setPassword("password23");
//        userDao3.update(user3);
//        System.out.println(user3.getId());

        //TEST METODY DELETE
//        UserDao userDao4 = new UserDao();
//        userDao4.delete(7);

        //TEST METODY FIND ALL
        UserDao userDao5 = new UserDao();
        User[] users = userDao5.findAll();
        for (User user : users) {
            System.out.println(user.getId());
            System.out.println(user.getUserName());
            System.out.println(user.getEmail());
            System.out.println(user.getPassword());
        }

    }
}