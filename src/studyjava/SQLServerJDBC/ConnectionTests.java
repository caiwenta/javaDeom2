/*
 * E:\蔡文塔\sqljdbc\sqljdbc_6.4\chs\samples
 * Microsoft JDBC driver 6.4 for SQL Server 下载和官方实例：https://www.microsoft.com/zh-cn/download/details.aspx?id=56615
 *
 * */
package studyjava.SQLServerJDBC;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.*;

public class ConnectionTests {
    @BeforeEach
    void setUp() throws Exception {
    }

    @AfterEach
    void tearDown() throws Exception {
    }

    @Test
    public void ConnectURLTest() {
        //为连接字符串创建变量。
        String connectionUrl = "jdbc:sqlserver://127.0.0.1:1433;" + "databaseName=Sales;integratedSecurity=true;";

        //声明的JDBC对象。
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            //建立连接。
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(connectionUrl);
            stmt = con.createStatement();

            //stmt.execute("DELETE  Sale WHERE Id=4");

            // C创建并执行返回一些数据的SQL语句。
            String SQL = "SELECT  * FROM [dbo].[Sale]";
            rs = stmt.executeQuery(SQL);

            // I迭代结果集中的数据并显示结果。
            while (rs.next()) {
                //有数据
                //取数据:getXXX
                int id = rs.getInt(1);//获得第一列的值
                //int id rs.getInt("id");// 获得id列的值
                String name = rs.getString(2);//获得第二列的值
                System.out.println(id + "==>" + name);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) try {
                rs.close();
            } catch (Exception e) {
            }
            if (stmt != null) try {
                stmt.close();
            } catch (Exception e) {
            }
            if (con != null) try {
                con.close();
            } catch (Exception e) {
            }
        }

    }

    @Test
    public void connectDSTest() {

        // 声明的JDBC对象。
        Connection con = null;
        CallableStatement cstmt = null;
        ResultSet rs = null;

        try {
            // 建立连接。
            SQLServerDataSource ds = new SQLServerDataSource();
            ds.setIntegratedSecurity(true);
            ds.setServerName("127.0.0.1");
            ds.setPortNumber(1433);
            ds.setDatabaseName("wdd_erp_snsn");
            con = ds.getConnection();

            // 执行返回某些数据的存储过程。
            cstmt = con.prepareCall("{call dbo.pro_j_stocklog(?,?)}");
            cstmt.setInt(1, 0);
            cstmt.setInt(2, 302);
            rs = cstmt.executeQuery();

            // 迭代结果集中的数据并显示结果。
            while (rs.next()) {
                System.out.println("name: " + rs.getString("sei_name") +
                        ", " + rs.getString("s_time"));
            }
        }

        // Handle any errors that may have occurred.
        catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) try {
                rs.close();
            } catch (Exception e) {
            }
            if (cstmt != null) try {
                cstmt.close();
            } catch (Exception e) {
            }
            if (con != null) try {
                con.close();
            } catch (Exception e) {
            }
        }
    }
}

