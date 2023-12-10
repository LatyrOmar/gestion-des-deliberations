/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.des.délibérations;

import java.sql.*;
import javax.swing.JOptionPane;
public class connexion {
     Connection con;
         
         public connexion() {
     		// TODO Auto-generated method stub
             
               try {
             	// 1charger le driver mysql
                   Class.forName("com.mysql.jdbc.Driver");
             //2creer la connection
                   con=DriverManager.getConnection("jdbc:mysql://localhost/gestion_des_deliberation","root", "" );
                 //  JOptionPane.showMessageDialog(null, "connexion etablie");
                  // System.out.println("done");
                   
             //3 creer un etat de connexion qui me permettra d'executer des requetes sql
                 Statement st=con.createStatement();
               }
               catch(Exception e) {
             	  JOptionPane.showMessageDialog(null, "connexion echoue");
                   System.out.println("NOTdone");

               }
     	}
}
