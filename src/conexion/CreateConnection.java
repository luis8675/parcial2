/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package conexion;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;



/**
 *
 * @author eesteban
 */
public class CreateConnection {
  
    static Properties props = new Properties();

    String hostname = null;
    String port = null;
    String database = null;
    String username = null;
    String password = null;
    
    public CreateConnection (){
        
        String path = "C:\\Users\\luisc\\Documents\\NetBeansProjects\\Parcial2\\src\\conexion\\db_config.properties";
        InputStream in = null;
        try {
            // Looks for properties file in the root of the src directory in Netbeans Project
            
            in = Files.newInputStream(Paths.get(path));
            props.load(in);
            in.close();
        }   catch (IOException ex) {
                        System.out.println(ex.getMessage());
            }   finally{
                    try{
                            in.close();
                        }catch (IOException ex ) {
                                ex.printStackTrace();
                                }
                }
        // Metodo que se manda a llamar para cargar las propiedades del archivo de propiedades
        loadProperties();
        
    }
    
    public void loadProperties(){
                this.hostname = props.getProperty("hostname");
                this.port  = props.getProperty("port");
                this.database = props.getProperty("database");
                this.username =   props.getProperty("username");
                this.password =   props.getProperty("password");
        }
    
    

    
    public Connection getConnection() {
        Connection conn = null;
        try {
            
            String jdbcUrl = "jdbc:postgresql://"+this.hostname+":"+
                    this.port + "/" + this.database;
            
            conn = DriverManager.getConnection(jdbcUrl,username,password);
            System.out.println("Conexion establecida");
            
            return conn;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return conn;
    
}
}