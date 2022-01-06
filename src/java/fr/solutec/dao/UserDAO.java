
package fr.solutec.dao;

import java.sql.PreparedStatement;
import fr.solutec.model.User;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;

public class UserDAO {
    public static User getByLoginAndPassword(String login, String password) throws SQLException{
        User u = null;
        String sql = "SELECT * FROM user WHERE login = ? AND mdp = ?";
        Connection connexion = AccesBd.getConnection();
        PreparedStatement prepare = connexion.prepareStatement(sql);
        prepare.setString(1, login);
        prepare.setString(2, password);
        ResultSet result = prepare.executeQuery();
        if (result.next()) {
            u = new User();
            u.setId(result.getInt("id"));
            u.setNom(result.getString("nom"));
            u.setPrenom(result.getString("prenom"));
            u.setLogin(result.getString("login"));
        }
        return u;
    }
    public static void insertUser(User u) throws SQLException {
        String sql = "INSERT INTO user (nom, prenom, login, mdp) VALUES (?, ?, ?, ?)";
        Connection connexion = AccesBd.getConnection();
        PreparedStatement prepare = connexion.prepareStatement(sql);
        prepare.setString(1, u.getNom());
        prepare.setString(2, u.getPrenom());
        prepare.setString(3, u.getLogin());
        prepare.setString(4, u.getMdp());
        prepare.execute();
    }
}
