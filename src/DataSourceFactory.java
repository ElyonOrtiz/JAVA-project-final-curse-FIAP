import java.sql.*;
import java.sql.Connection;
import java.sql.SQLException;

public class DataSourceFactory {
    public static Connection obterConexao() {
        Connection conexao = null;
        try {
            // Carregando o driver JDBC do MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Estabelecendo a conexão com o banco de dados
            String url = "jdbc:mysql://localhost:3306/ElyonDB1";
            String usuario = "elyon";
            String senha = "08062002";
            conexao = DriverManager.getConnection(url, usuario, senha);
            // Fechando a conexão com o banco de dados
        } catch (SQLException e) {
            System.err.println("Não foi possível conectar no Banco de Dados");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.err.println("O Driver JDBC não foi encontrado!");
            e.printStackTrace();
        }
        return conexao;
    }
}