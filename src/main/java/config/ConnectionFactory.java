package config;

import lombok.NoArgsConstructor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@NoArgsConstructor
public class ConnectionFactory {
    public static Connection getConnection(){
        try{
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost/turma_web",
                    "root",
                    "123456"
            );
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
