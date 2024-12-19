package Connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class JDBCConnection {
    public static Connection getConnection(){
        String url = "jdbc:sqlserver://localhost:1433;databaseName=BTL_QuanLyBanHang;encrypt=true;trustServerCertificate=true";
        String username = "sa";
        String password = "truong2004";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException ex) {
            System.out.println("Không load được driver");
        } catch (SQLException ex) {
            System.out.println("Không kết nối được");
        }
        return null;
    }
    public static void main(String[] args) {
        Connection con = getConnection();
        if(con != null){
            System.out.println("Ket noi thanh cong");
        }
    }
}
