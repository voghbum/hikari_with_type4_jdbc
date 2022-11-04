package tr.gov.bilgem.tubitak.hikaripool;

import tr.gov.bilgem.tubitak.hikaripool.data.entity.User;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserRepository repo = new UserRepository();
        Iterable<User> users = repo.findAll();

        users.forEach(System.out::println);
    }
}
