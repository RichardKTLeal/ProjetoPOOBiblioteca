/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.poo;

import java.sql.*;

public class ConexaoSQL {
    private String url = "jdbc:mysql://localhost:3307/biblioteca";
    private String user = "root";
    private String pass = "";

    public Connection startConexao() throws SQLException{
        try{
            
        Connection conn = DriverManager.getConnection(url, user, pass);
        System.out.println("Conectado!!");
        Statement stmt = conn.createStatement();
        return conn;
        }
        catch(Exception e){
         System.out.println("Erro ao Conectar: " + e.getMessage());
         return null;
        }
        
    }
}
