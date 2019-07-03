/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Brandon Kynsi
 */
/*public class deliverableMain {
    public static void main(String[] args) {
        ResultSet rs = null;
	Statement stmt = null;
	Connection conn = null;
            if (args.length != 4)
            {
            	System.out.println("USAGE: java ser322.jdbclab jdbc:mysql://localhost/JDBCLabInit <user> <passwd> com.mysql.cj.jdbc.Driver query1");
		System.exit(0);
            }
            String _url = "jdbc:mysql://localhost/JDBCLabInit";
            try {
		// Step 1: Load the JDBC driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Step 2: make a connection
		conn = DriverManager.getConnection(_url, args[1], args[2]);
		// Step 3: Create a statement
		stmt = conn.createStatement();
		// Step 4: Make a query
		rs = stmt.executeQuery("SELECT emp.EMPNO, emp.ENAME, dept.DNAME\n" +
                "FROM emp, dept\n" +
                "WHERE emp.DEPTNO = dept.DEPTNO;");
		// Step 5: Display the results
		while (rs.next()) {
                    System.out.print(rs.getInt(1) + "\t");
                    System.out.print(rs.getString(2) + "\t ");
                    System.out.println(rs.getString(3));
                }
            }
            catch (Exception exc)
            {
		exc.printStackTrace();
            }
            finally {  // ALWAYS clean up your DB resources
		try {
                    if (rs != null)
                    rs.close();
                    if (stmt != null)
                    stmt.close();
                    if (conn != null)
                    conn.close();
                }
		catch (SQLException se) {
                    se.printStackTrace();
                }
            }    
    }
}*/
