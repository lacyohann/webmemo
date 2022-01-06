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
        String sql = "SELECT * FROM memo m INNER JOIN user u ON u.id = m.user_id AND prive=false";
        Connection connexion = AccesBd.getConnection();
        Statement state = connexion.createStatement();
        ResultSet rs = state.executeQuery(sql);
        while (rs.next()){
            Memo m = new Memo();
            m.setId(rs.getInt("idmemo"));
            m.setContenu(rs.getString("Contenu"));
            m.setDateCreation(rs.getDate("date_creation"));
            m.setBefore_update(rs.getInt("before_update"));
            
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
    
    public static List<Memo> getPrivateMemo() throws SQLException{
        List<Memo> pmemos = new ArrayList<>();
        String sql = "SELECT * FROM memo p INNER JOIN user u ON u.id = p.user_id AND prive=true";
        Connection connexion = AccesBd.getConnection();
        Statement state = connexion.createStatement();
        ResultSet rs = state.executeQuery(sql);
        while (rs.next()){
            Memo p = new Memo();
            p.setId(rs.getInt("idmemo"));
            p.setContenu(rs.getString("Contenu"));
            p.setDateCreation(rs.getDate("date_creation"));
            p.setPrive(rs.getBoolean("Prive"));
            
            User u = new User();
            u.setId(rs.getInt("user_id"));
            u.setNom(rs.getString("nom"));
            u.setPrenom(rs.getString("prenom"));
            u.setLogin(rs.getString("login"));
            
            p.setCreateur(u);
            
            pmemos.add(p);
        }
        
        return pmemos;
        
    }

    public static void insertMemo(Memo m) throws SQLException {
        String sql = "INSERT INTO memo (contenu, user_id) VALUES (?, ?)";
        Connection connexion = AccesBd.getConnection();
        PreparedStatement prepare = connexion.prepareStatement(sql);
        prepare.setString(1, m.getContenu());
        prepare.setInt(2, m.getCreateur().getId());
        prepare.execute();

    }
}
