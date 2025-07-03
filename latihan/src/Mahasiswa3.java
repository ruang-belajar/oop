/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

/**
 *
 * @author Lenovo
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Mahasiswa3 {

    public String nim;
    public String nama;
    public Integer nilai;

    public boolean tambah()  {
        String DBDRIVER = "com.mysql.cj.jdbc.Driver";
        String DBCONNECTION = "jdbc:mysql://localhost:3306/test";
        String DBUSER = "root";
        String DBPASS = "";
        
        Connection conn = null;
        PreparedStatement st;

        try {
            Class.forName(DBDRIVER);
            conn = DriverManager.getConnection(DBCONNECTION, DBUSER, DBPASS);

            // prepare select statement
            String sql = "INSERT INTO mahasiswa (nim,nama,nilai) values (?,?,?)";
            st = conn.prepareStatement(sql);
            st.setString(1, this.nim);
            st.setString(2, this.nama);
            st.setInt(3, this.nilai);
            st.executeUpdate();
            conn.close();
            return true;
        } catch (Exception ex) {
            return false;
        }

    }
    
    public boolean baca(String nim)  {
        String DBDRIVER = "com.mysql.cj.jdbc.Driver";
        String DBCONNECTION = "jdbc:mysql://localhost:3306/test";
        String DBUSER = "root";
        String DBPASS = "";
        
        Connection conn = null;
        PreparedStatement st;
        ResultSet resultSet;

        try {
            Class.forName(DBDRIVER);
            conn = DriverManager.getConnection(DBCONNECTION, DBUSER, DBPASS);

            // prepare select statement
            String sql = "SELECT * FROM mahasiswa where nim=?";
            st = conn.prepareStatement(sql);
            st.setString(1, nim);
            resultSet = st.executeQuery();
            
            if(resultSet.next()) {
                this.nim = resultSet.getString("nim");
                this.nama = resultSet.getString("nama");
                this.nilai = resultSet.getInt("nilai");
            }
            
            conn.close();
            return true;
        } catch (Exception ex) {
            return false;
        }

    }
    
    public static ArrayList<Mahasiswa3> getList()  {
        String DBDRIVER = "com.mysql.cj.jdbc.Driver";
        String DBCONNECTION = "jdbc:mysql://localhost:3306/test";
        String DBUSER = "root";
        String DBPASS = "";
        
        Connection conn = null;
        PreparedStatement st;
        ResultSet resultSet;
        ArrayList<Mahasiswa3> result = new ArrayList<Mahasiswa3>();

        try {
            Class.forName(DBDRIVER);
            conn = DriverManager.getConnection(DBCONNECTION, DBUSER, DBPASS);

            // prepare select statement
            String sql = "SELECT * FROM mahasiswa ";
            st = conn.prepareStatement(sql);
            resultSet = st.executeQuery();
            
            while(resultSet.next()) {
                Mahasiswa3 mahasiswa = new Mahasiswa3();
                mahasiswa.nim = resultSet.getString("nim");
                mahasiswa.nama = resultSet.getString("nama");
                mahasiswa.nilai = resultSet.getInt("nilai");
                result.add(mahasiswa);
            }
            
            conn.close();
            return result;
        } catch (Exception ex) {
            return null;
        }

    }
}
