package apotek_harda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DatabaseConnection {

    public static Connection connect() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/apotek_harda?useSSL=false&serverTimezone=UTC";
            String user = "root";
            String pass = "";

            conn = DriverManager.getConnection(url, user, pass);
            // JOptionPane.showMessageDialog(null, "Koneksi ke database berhasil."); // optional
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Driver tidak ditemukan: " + e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Koneksi ke database gagal: " + e.getMessage());
        }
        return conn;
    }
}