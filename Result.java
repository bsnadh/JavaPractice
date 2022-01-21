import java.sql.*;
public class Result {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/javaforexam", "root","");
            Statement stmt = con.createStatement();
            String sql = "select * from javaforexam.info";
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()) {
                String name = rs.getString("name");
                int roll = rs.getInt("roll");
                String add = rs.getString("address");
                System.out.println(roll + "\t\t" + name
                                   + "\t\t" + add);
            }
            con.close();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
