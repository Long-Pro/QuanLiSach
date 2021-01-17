/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlsach2;
import java.sql.*;

/**
 *
 * @author Long CaCa
 */
public class QLSACH2 {

    /**
     * @param args the command line arguments
     */
    
    //jdbc:sqlserver://;databaseName=QLSACH_TiKi
    //com.microsoft.sqlserver.jdbc.SQLServerDriver
    
    public static Connection layKetNoi(){
        Connection ketNoi=null;
        String url="jdbc:sqlserver://;databaseName=QLSACH_TiKi";
        String username="sa";
        String password="123";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            ketNoi=DriverManager.getConnection(url,username,password);
            System.out.println("Ket noi thanh cong");
        } catch (Exception e) {
            System.out.println(e+" loi ket noi");
        }
        return ketNoi;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        layKetNoi();
        String str2 = String.format("|%*5d|",55);
        System.out.println(str2);
    }
    
}
