package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
// import jm.task.core.jdbc.util.Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

// import static jm.task.core.jdbc.util.Util.getConnection;

public class UserDaoJDBCImpl implements UserDao {
   // Connection connection = getConnection();
    public UserDaoJDBCImpl() {

    }

    public void createUsersTable() {
//        String sql = "CREATE TABLE IF NOT EXISTS users (Id BIGINT PRIMARY KEY AUTO_INCREMENT, " +
//                "name VARCHAR(50), lastName VARCHAR(50), age TINYINT)";
//        try (Statement statement = connection.createStatement()) {
//            statement.executeUpdate(sql);
//            System.out.println("UsersTable has been created!");
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
    }

    public void dropUsersTable() {
//        String sql = "DROP TABLE IF EXISTS users";
//        try (Statement statement = connection.createStatement()){
//            statement.executeUpdate(sql);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
    }

    public void saveUser(String name, String lastName, byte age) {
//        String sql = "INSERT INTO users (NAME, LASTNAME, AGE) VALUES (?, ?, ?)";
//        try (PreparedStatement prep = connection.prepareStatement(sql)) {
//            prep.setString(1, name);
//            prep.setString(2, lastName);
//            prep.setByte(3, age);
//            prep.executeUpdate();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
    }

    public void removeUserById(long id) {
//        String sql = "DELETE FROM users WHERE ID = ?";
//        try (PreparedStatement prep = connection.prepareStatement(sql)) {
//            prep.setLong(1, id);
//            prep.executeUpdate();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
    }

    public List<User> getAllUsers() {
//        List<User> users = new ArrayList<>();
//        String sql = "SELECT * FROM users";
//        try (PreparedStatement prep = connection.prepareStatement(sql)) {
//            ResultSet resultSet = prep.executeQuery();
//            while (resultSet.next()) {
//                User user = new User();
//                user.setId(resultSet.getLong("ID"));
//                user.setName(resultSet.getString("NAME"));
//                user.setLastName(resultSet.getString("LASTNAME"));
//                user.setAge(resultSet.getByte("AGE"));
//                users.add(user);
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
        return null;
    }

        public void cleanUsersTable() {
//            String sql = "TRUNCATE TABLE users";
//            try (Statement statement = connection.createStatement()){
//                statement.executeUpdate(sql);
//            } catch (SQLException e) {
//                throw new RuntimeException(e);
//            }
        }
}
