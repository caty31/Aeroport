/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectaeroport;

import Entity.Avion;
import Entity.Pilote;
import Entity.Vol;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author stag
 */
public class ConnectAeroport {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String host = "localhost"; // L'ip de l'hôte
        String port = "3306"; // Le port de connexion, 3306 par défaut sur MySQL
        String base = "aeroport"; // La base de données sur laquelle se connecter
        String login = "cours"; // Le login
        String password = "cours"; // Le mot de passe
        // Construction de l'URL de connexion au standard Java/JDBC
        String url = "jdbc:mysql://" + host + ":" + port + "/" + base;
        String url1 = url + "?user=" + login + "&password=" + password;
        // Avec des properties. On peut bien sûr
        // récupérer ces properties depuis un fichier de configuration...
        Properties info = new Properties();
        info.put("user", login);
        info.put("password", password);
        try (Connection conn1 = DriverManager.getConnection(url, login, password)) {
            // Première méthode de connection : avec les login/mdp en String (recommandeé)
            if (conn1 != null) {
                System.out.println(" Vous etes connecté à la base de données de Mahgwe Caty " + base + " avec l'URL " + url);
                // on crée une requette avion
                Statement stmt = conn1.createStatement();
                String req = "SELECT * FROM avion";
                ResultSet res = stmt.executeQuery(req);
                System.out.println("\n *************  Voici la liste des avions de notre flotte : **************  \n");

                while (res.next()) {
                    Avion avion = new Avion(
                            res.getInt("id"),
                            res.getString("type"),
                            res.getInt("capacite")
                    );

                    System.out.println("avion = " + avion);

                }

                // je crée une requette pour pilote
                String req1 = "SELECT * FROM pilote";
                ResultSet res1 = stmt.executeQuery(req1);
                System.out.println("\n **************  Voici la liste des pilote de notre compagnie:  ****************   \n");
                while (res1.next()) {
                    Pilote pilote = new Pilote(
                            res1.getInt("id"),
                            res1.getString("nom"),
                            res1.getString("prenom")
                    );

                    System.out.println("pilote = " + pilote);

                }

                // je cree une requette pour vol
                String req2 = "SELECT * FROM vol";
                ResultSet res2 = stmt.executeQuery(req2);
                System.out.println("\n  *************  Voici le programme des vols effectués:   ****************** \n");
                while (res2.next()) {
                    Vol vol = new Vol(
                            res2.getInt("id"),
                            res2.getString("depart"),
                            res2.getString("arrivee"),
                            res2.getInt("id_avion"),
                            res2.getInt("id_pilote"),
                            res2.getDate("jdep"),
                            res2.getDate("hdep"),
                            res2.getDate("jarr"),
                            res2.getDate("harr")
                    );
                    System.out.println("vol = " + vol);

                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(ConnectAeroport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
