/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.projeto.poo;

import java.sql.*;

public class TesteConexao {
    
    public static void main(String[] args) throws SQLException {
        // Fazendo a Conexão
        ConexaoSQL con = new ConexaoSQL();
        con.startConexao();
        }

}
