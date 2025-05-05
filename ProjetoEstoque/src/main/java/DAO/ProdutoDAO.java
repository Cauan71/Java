/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Modelo.Produtos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.spi.DirStateFactory;

/**
 *
 * @author lerinha
 */
public class ProdutoDAO {

    
    
    public List<Produtos> readForDesc (String Nome){
        
        Connection con = ConnectionFactory.getConection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produtos> produtos = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("Select * from produto WHERE Nome LIKE %Nome%?");
            stmt.setString(1,"%"+ Nome+"%");
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                Produtos produto = new Produtos();
                
                produto.setNome(rs.getString("Nome"));
                produto.setFornecedor(rs.getString("Fornecedor"));
                produto.setQuantidade(rs.getInt("Quantidade"));
                produto.setPreco(rs.getDouble("Preco"));
                produto.setResponsavel(rs.getString("Nome"));
                produtos.add(produto);
                
                
            }
            
        } catch (Exception e) {
   
            
            
        }finally{
            ConnectionFactory.closeConnection(con,stmt, rs);
        }
        
        
        
        return produtos;
        
    };

    private static class ConnectionFactory {

        private static Connection getConection() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public ConnectionFactory() {
        }
    }
    
}
