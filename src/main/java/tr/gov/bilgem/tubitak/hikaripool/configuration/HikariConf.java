package tr.gov.bilgem.tubitak.hikaripool.configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class HikariConf {
    private static final HikariDataSource ds;
    private static final Properties prop = new Properties();

    static {
        HikariConfig config;
        try {
            Properties properties = new Properties();
                    properties.load(ClassLoader.getSystemResourceAsStream("hikari.properties"));
            config = new HikariConfig(properties);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /*
            Pool suspend edildiğinde connection istendiğinde eğer exception edilmek istenirse bu property set edilmeli.
            HikariConfig'de setter yok. Buradan yapılmalı.
        */
        //System.setProperty("com.zaxxer.hikari.throwIfSuspended", "true");

        ds = new HikariDataSource(config);
    }

    public static HikariDataSource getDs() {
        return ds;
    }

    private HikariConf() {}

    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
}
