package dao;

import config.ConnectionFactory;
import model.Pessoa;

import java.sql.*;

public class PessoaDao {

    public Pessoa inserirPessoa(Pessoa p){
        try (Connection c = ConnectionFactory.getConnection()){
            String query = "INSERT INTO pessoa " +
                    "(nome, cpf, endereco) " +
                    "VALUES (?,?,?)";
            PreparedStatement st = c.prepareStatement(query,
                    Statement.RETURN_GENERATED_KEYS);
            st.setString(1,p.getNome());
            st.setString(2,p.getCpf());
            st.setString(3,p.getEndereco());
            st.executeUpdate();
            ResultSet rs = st.getGeneratedKeys();
            rs.next();
            p.setId(rs.getInt(1));
        }catch (SQLException e){
            e.printStackTrace();
        }
        return p;
    }

}
