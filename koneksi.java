/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rumah_sakit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author micha
 */
public class koneksi {
    public static Connection con;
    public static Statement stm;
    //public static void main(String args[]){
    public static Connection configDB()throws SQLException{
        try {
            String url ="jdbc:mysql://localhost:3306/rumah_sakit";
            String user="root";
            String pass="";
            Class.forName("com.mysql.jdbc.Driver");
            con =DriverManager.getConnection(url,user,pass);
            stm = con.createStatement();
            System.out.println("koneksi berhasil;");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("koneksi gagal " +e.getMessage());
        }
        return con;
    }
}
