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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;


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
    
    public static void deleteFlash() throws SQLException{
        
        List<Memo> memos = getAllMemo(); //on récupère la liste via la fonction getAllMemo()
        
        for(Memo m : memos){    //on parcourt la liste memos avec un objet m de type Memo 
            
            String prefixe;
            prefixe = m.getContenu().substring(0, 7);   //on récupère les 7 premiers caractères de la chaine contenu
            String flash = "*flash*";       //prefixe pour memo flash
            
            if (prefixe.equals(flash)) {    //si prefixe est égal à *flash* alors...

                String sql = "DELETE FROM memo WHERE idmemo = " + m.getId();    //on récupère dans une chaine la commande sql pour supprimer la ligne de la BD
                Connection connexion = AccesBd.getConnection(); //connexion à la BD
                Statement state = connexion.createStatement();  //création du statut
                state.executeUpdate(sql);                       //exécution de la ligne sql
            }
        }
    }
}
