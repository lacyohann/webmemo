/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.dao;

import java.util.List;
import fr.solutec.model.Memo;
import fr.solutec.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class MemoDAO {
    
    public static List<Memo> getAllMemo() throws SQLException{
        List<Memo> memos = new ArrayList<>();
        String sql = "SELECT * FROM memo m INNER JOIN user u ON u.id = m.user_id";
        Connection connexion = AccesBd.getConnection();
        Statement state = connexion.createStatement();
        ResultSet rs = state.executeQuery(sql);
        while (rs.next()){
            Memo m = new Memo();
            m.setId(rs.getInt("idmemo"));
            m.setContenu(rs.getString("Contenu"));
            m.setDateCreation(rs.getDate("date_creation"));
            
            User u = new User();
            u.setId(rs.getInt("user_id"));
            u.setNom(rs.getString("nom"));
            u.setPrenom(rs.getString("prenom"));
            u.setLogin(rs.getString("login"));
            
            m.setCreateur(u);
            
            memos.add(m);
        }
        
        return memos;
    }
    
    public static void deleteMemo(int id) throws SQLException {
        String sql = "DELETE FROM memo WHERE idmemo= ?;";
        Connection connexion = AccesBd.getConnection();
        PreparedStatement prepare = connexion.prepareStatement(sql);
        prepare.setInt(1, id);
        prepare.execute();
    }
    
}
