import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectTest {
    @Test
    public void testConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/webdb", "root", "");
        Assertions.assertNotNull(connection);
        connection.close();
    }

//    HikariCP 라이브러리를 이용해서 Connection Pool을 이용해 Connection를 생성해서 보관하고, 필요할때마다 꺼내서 쓰도록 테스트
    @Test
    public void testHikariCP() throws Exception {
        HikariConfig config = new HikariConfig();
        config.setDriverClassName("com.mysql.cj.jdbc.Driver");
        config.setJdbcUrl("jdbc:mysql://localhost:3306/webdb");
        config.setUsername("root");
        config.setPassword("");
        config.addDataSourceProperty("cachePrepStmts", "true");
        config.addDataSourceProperty("prepStmtCacheSize", "250");
        config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");

        HikariDataSource ds = new HikariDataSource(config);
        Connection connection = ds.getConnection();

        System.out.println(connection);
        connection.close();
    }
}
