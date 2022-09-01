import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.*;

public class ExcelWithCSV {
    public static void main(String[] args) throws FileNotFoundException, SQLException {

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mapping", "root", "root");
        System.out.println("connection  is  sucessful");

        PrintWriter p = new PrintWriter(new File("D:\\ExcelDataCSV1.csv"));
        PrintWriter pw = new PrintWriter(new File("C:\\Users\\lenovo\\Downloads\\GeneratedEXCELFile\\ExcelDataCSV1.csv"));
        StringBuilder s = new StringBuilder();

        ResultSet rs = null;

        String query = "select * from map";
        PreparedStatement ps = con.prepareStatement(query);
        rs = ps.executeQuery();

        s.append("id");
        s.append("|");
        s.append("action");
        s.append("|");
        s.append("role");
        s.append("|");
        s.append("status");
        s.append("|");
        s.append("authorized");
        s.append("|");
        s.append("submitted");
        s.append("|");
        s.append("update_record_version");
        s.append("|");
        s.append("inactive_previous_record");
        s.append("|");
        s.append("last_configuration_action");
        s.append("|");
        s.append("insert_record_into_audit");
        s.append("|");
        s.append("insert_record_into_basetable");
        s.append("|");
        s.append("mapping_status");
        s.append("|");
        s.append("copy_record_from_base_table");
        s.append("\r\n");

        while (rs.next()) {
            s.append(rs.getString("id"));
            s.append("|");
            s.append(rs.getString("action"));
            s.append("|");
            s.append(rs.getString("role"));
            s.append("|");
            s.append(rs.getString("status"));
            s.append("|");
            s.append(rs.getString("authorized"));
            s.append("|");
            s.append(rs.getString("submitted"));
            s.append("|");
            s.append(rs.getString("update_record_version"));
            s.append("|");
            s.append(rs.getString("inactive_previous_record"));
            s.append("|");
            s.append(rs.getString("last_configuration_action"));
            s.append("|");
            s.append(rs.getString("insert_record_into_audit"));
            s.append("|");
            s.append(rs.getString("insert_record_into_basetable"));
            s.append("|");
            s.append(rs.getString("mapping_status"));
            s.append("|");
            s.append(rs.getString("copy_record_from_base_table"));
            s.append("\r\n");

        }
        p.write(s.toString());
        pw.write(s.toString());
        p.close();
        pw.close();
        System.out.println("CSV file move from  source to another source");

    }
}